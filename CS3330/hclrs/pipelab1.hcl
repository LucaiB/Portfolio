

#Fetch
pc = F_pc;


#the PC and condition codes registers
register fF { pc:64 = 0; }

d_rA = i10bytes[12..16];
d_rB = i10bytes[8..12];
d_icode = i10bytes[4..8];
d_ifun = i10bytes[0..4];


d_valC = [
	d_icode == JXX  : i10bytes[8..72];
	1 : i10bytes[16..80];
];

wire offset : 64, valP : 64;

offset = 1 + [
	d_icode == JXX: 8;
	d_icode == CALL: 8;
	d_icode in { HALT, NOP, RET } : 0;
	d_icode in { RRMOVQ, OPQ, PUSHQ, POPQ } : 1;
	1 : 9;
];
valP = F_pc + offset;

#Register bank
register dW {
	rvalA : 64 = 0;
	rA : 4 = 15;
	rB : 4 = 15;
	valC : 64 = 15;
	dstE : 4 = REG_NONE;
	Stat : 3 = 0;
	icode : 4 = NOP;
	ifun : 4 = 0;
}


#Decode

# source selection
reg_srcA = [
	d_icode == RRMOVQ : d_rA;
	1 : REG_NONE;
];

d_rvalA = [
	(reg_dstE == reg_srcA) & (reg_dstE != REG_NONE) 	: reg_inputE;
	1 	 					: reg_outputA;
];


d_Stat = [
	d_icode == HALT : STAT_HLT;
	d_icode > 11 : STAT_INS;
	1 : STAT_AOK;
];

d_dstE = [
	d_icode == RRMOVQ : d_rB;
	d_icode == IRMOVQ: d_rB;
	1 : REG_NONE;
];


#PC and Status updates

Stat = W_Stat;

stall_F = (d_Stat != STAT_AOK);
f_pc = valP;

#Writeback


# destination selection
reg_dstE = W_dstE;

reg_inputE = [ 
	W_icode == RRMOVQ : W_rvalA;
	W_icode in {IRMOVQ} : W_valC;
        1: 0xBADBADBAD;
];






