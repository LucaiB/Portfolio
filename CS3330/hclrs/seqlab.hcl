# nop
# halt
# irmovq
# rrmovq
# unconditional jmp

register pF {
	pc : 64 = 0;
	}

register cC {
	SF:1 = 0;
	ZF:1 = 0;
	}

pc = F_pc;

wire icode : 4, ifun : 4, rA : 4, rB : 4, valC : 64, valP : 64, valE : 64, conditionsMet : 1;

# split instruction
icode = i10bytes[4..8];
ifun = i10bytes[0..4];
rA = i10bytes[12..16];
rB = i10bytes[8..12];

# MUX to set Stat
Stat = [
	icode == HALT	: STAT_HLT;
	icode > 0xb	: STAT_INS;
	1		: STAT_AOK;
];

# MUX to set rA
reg_srcA = [
	icode in {RRMOVQ, OPQ, RMMOVQ}	: rA;
	1				: 0xF;
];

# MUX to set rB
reg_srcB = [
	icode in {RRMOVQ, RMMOVQ, OPQ}	: rB;
	1				: 0xF;
];

# MUX to set dstE
reg_dstE = [
	!conditionsMet && icode == RRMOVQ 	: 0xF;
	icode in {RRMOVQ, IRMOVQ, OPQ}		: rB;
	1					: 0xF;
];

# MUX to set valC
valC = [
	icode == JXX			: i10bytes[8..72];
	1				: i10bytes[16..80];
];

# MUX to set register write data
reg_inputE = [
	icode == RRMOVQ && ifun == 0	: reg_outputA;
	icode == RRMOVQ && conditionsMet: reg_outputA;
	icode == OPQ			: valE;
	icode == IRMOVQ			: valC;
	1				: 0;
];

# MUX to execute ALU
valE = [
	icode == OPQ && ifun == ADDQ		: reg_outputA + reg_outputB;
	icode == OPQ && ifun == SUBQ		: reg_outputB - reg_outputA;
	icode == OPQ && ifun == ANDQ		: reg_outputA & reg_outputB;
	icode == OPQ && ifun == XORQ		: reg_outputA ^ reg_outputB;
	icode == RMMOVQ				: valC + reg_outputB;
	icode == RRMOVQ && ifun != ALWAYS	: reg_outputB - reg_outputA;
	1					: 1;
];

mem_readbit = [
    icode == 4 : 0;
    1 : 1;
];

mem_writebit = [
    icode == 4 : 1;
    1 : 0;
];

mem_input = [
    icode == 4 : reg_outputA;
    1 : 0;
];

mem_addr = [
    icode == 4 : valE;
    1 : 0;
];

# set condition codes for OPq
stall_C = !(icode == OPQ);
c_ZF = (valE == 0);
c_SF = (valE >= 0x8000000000000000);

# MUX for CMOVXX
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
valP = [
	icode in {RRMOVQ, OPQ}		: F_pc + 2;
	icode == JXX			: valC;
	icode in {IRMOVQ, RMMOVQ} 	: F_pc + 10;
	1				: F_pc + 1;
];

p_pc = valP;
