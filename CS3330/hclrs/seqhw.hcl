# jXX
# mrmovq
# pushq
# popq
# call
# ret


register cC {
	SF:1 = 0;
	ZF:1 = 0;
	}

register pF {
	pc : 64 = 0;
	}

pc = F_pc;

wire icode : 4, conditionsMet : 1, ifun : 4, rB : 4, rA : 4, valP : 64, valC : 64, valE : 64; 

# split instruction
icode = i10bytes[4..8];
rA = i10bytes[12..16];
ifun = i10bytes[0..4];
rB = i10bytes[8..12];

# MUX to set Stat
Stat = [
	icode == HALT	: STAT_HLT;
	icode > 11	: STAT_INS;
	1		: STAT_AOK;
];

# MUX to set rA
reg_srcA = [
	icode in {RRMOVQ, OPQ, RMMOVQ, MRMOVQ, POPQ, PUSHQ}	: rA;
	1							: 15;
];

# MUX to set rB
reg_srcB = [
	icode in {RRMOVQ, RMMOVQ, OPQ, MRMOVQ}	: rB;
	icode in {POPQ, PUSHQ, RET, CALL}	: REG_RSP;
	1					: 15;
];

# MUX to set dstE
reg_dstE = [
	!conditionsMet && icode == RRMOVQ	: 15;
	icode in {RRMOVQ, IRMOVQ, OPQ}	: rB;
	icode in {POPQ, PUSHQ, RET, CALL} 	: REG_RSP;
	1					: 15;
];

# MUX to set dstM
reg_dstM = [
	icode in {POPQ, MRMOVQ}	: rA;
	1			: 15;
];

# MUX to set valC
valC = [
	icode in {IRMOVQ, RMMOVQ, MRMOVQ}	: i10bytes[16..80];
	icode in {JXX, CALL}			: i10bytes[8..72];
	1					: 0xBADBADBAD;
];

# MUX to set register write data
reg_inputE = [
	icode == RRMOVQ && conditionsMet	: reg_outputA;
	icode in {RET, CALL, POPQ, PUSHQ, OPQ}	: valE;
	icode == IRMOVQ				: valC;
	1					: 0xBADBADBAD;
];

# MUX to set inputM
reg_inputM = [
	icode in {POPQ, MRMOVQ}	: mem_output;
	1			: 0xBADBADBAD;
];

# MUX to execute ALU
valE = [
	icode == OPQ && ifun == ADDQ		: reg_outputA + reg_outputB;
	icode == OPQ && ifun == SUBQ		: reg_outputB - reg_outputA;
	icode == OPQ && ifun == ANDQ		: reg_outputA & reg_outputB;
	icode == OPQ && ifun == XORQ		: reg_outputA ^ reg_outputB;
	icode == RMMOVQ				: valC + reg_outputB;
	icode == RRMOVQ && ifun != ALWAYS	: reg_outputB - reg_outputA;
	icode == MRMOVQ				: reg_outputB + valC;
	icode in {CALL, PUSHQ}			: reg_outputB - 8;
	icode in {RET, POPQ}			: reg_outputB + 8;
	1					: 1;
];

mem_readbit = [
	icode in {RMMOVQ, PUSHQ, CALL}	: 0;
	1 				: 1;
];

mem_writebit = [
	icode in {RMMOVQ, PUSHQ, CALL}	: 1;
	1 				: 0;
];

mem_input = F_pc + [
	icode in {RMMOVQ, PUSHQ}	: reg_outputA - F_pc;
	icode == CALL			: 9;
	1 				: 0 - F_pc;
];

mem_addr = [
	icode in {POPQ, RET}			: reg_outputB;
	icode in {RMMOVQ, MRMOVQ, PUSHQ, CALL}	: valE;
	1 					: 0;
];

# set condition codes for OPq
stall_C = (icode != OPQ);
c_SF = (valE >= 0x8000000000000000);
c_ZF = (valE == 0);


# MUX for conditionsMet
conditionsMet = [
	ifun == ALWAYS	: 1;
	ifun == LE 	: C_SF || C_ZF;
	ifun == LT 	: C_SF;
	ifun == EQ 	: C_ZF;
	ifun == NE 	: ~C_ZF;
	ifun == GE 	: ~C_SF || C_ZF;
	ifun == GT 	: ~C_SF & ~C_ZF;
	1 		: 0;
];

# MUX to calculate valP
valP = F_pc + [
	icode in {RRMOVQ, OPQ, PUSHQ, POPQ}	: 2;
	icode == JXX && !conditionsMet	: 9;
	icode == CALL				: valC - F_pc;
	icode == JXX && conditionsMet		: valC - F_pc;
	icode in {IRMOVQ, RMMOVQ, MRMOVQ} 	: 10;
	icode == RET				: mem_output - F_pc;
	1					: 1;
];

p_pc = valP;
