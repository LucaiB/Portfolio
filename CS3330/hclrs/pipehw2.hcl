register pF {
	predPC : 64 = 0;
	}

register cC {
	ZF:1 = 0;
	SF:1 = 0;
	}
	
d_icode = D_icode;
d_ifun = D_ifun;
d_valC = D_valC;
d_stat = D_stat;
d_rA = D_rA;
d_oldvalP = D_oldvalP;

e_rvalA = E_rvalA;
e_rvalB = E_rvalB;
e_valC = E_valC;
e_stat = E_stat;
e_rA = E_rA;
e_dstM = E_dstM;
e_oldvalP = E_oldvalP;
e_icode = E_icode;
e_ifun = E_ifun;

m_rA = M_rA;
m_rvalA = M_rvalA;
m_icode = M_icode;
m_ifun = M_ifun;
m_stat = M_stat;
m_valC = M_valC;
m_conditionsMet = M_conditionsMet;
m_dstE = M_dstE;
m_dstM = M_dstM;
m_valE = M_valE;
m_valM = mem_output;

reg_dstM = W_dstM;


#Fetch

register fD {
	rA 		: 4 = 15;
	rB 		: 4 = 15;
	valC 		: 64 = 0;
	stat 		: 3 = 0;
	icode 		: 4 = 0;
	ifun 		: 4 = 0;
	valP 		: 64 = 0;
	oldvalP	: 64 = 0;
}

pc = [ 
	M_icode == JXX && !M_conditionsMet	: M_oldvalP;
	W_icode == RET				: W_valM;
	1					: F_predPC;
];


f_icode = i10bytes[4..8];
f_ifun = i10bytes[0..4];
f_rA = i10bytes[12..16];
f_rB = i10bytes[8..12];

f_valC = [
	f_icode in {PUSHQ, POPQ, CALL, RET}	: 8;
	1					: i10bytes[16..80];
];



f_valP = pc + [
	f_icode in {RRMOVQ, OPQ, PUSHQ, POPQ}	: 2;
	f_icode in {JXX, CALL}			: i10bytes[8..72] - pc;
	f_icode in {IRMOVQ, RMMOVQ, MRMOVQ} 	: 10;
	1					: 1;
];

f_oldvalP = pc + 9;

f_stat = [
	f_icode == HALT	: STAT_HLT;
	f_icode > 11	: STAT_INS;
	1		: STAT_AOK;
];


#Decode

register dE {
	icode	: 4 = 0;
	rA	: 4 = 15;
	rvalA 	: 64 = 0xBADBADBAD;
	rvalB 	: 64 = 0xBADBADBAD;
	valC 	: 64 = 0;
	ifun 	: 4 = 0;
	dstE 	: 4 = 15;
	dstM	: 4 = 15;
	stat 	: 3 = 0;
	oldvalP	: 64 = 0;
}


reg_srcA = [
	D_icode in {RRMOVQ, OPQ, RMMOVQ, PUSHQ, POPQ}	: D_rA;
	1						: REG_NONE;
];


reg_srcB = [
	D_icode in {RRMOVQ, RMMOVQ, OPQ, MRMOVQ}: D_rB;
	D_icode in {PUSHQ, POPQ, CALL, RET}	: REG_RSP;
	1					: REG_NONE;
];

d_rvalA = [
	reg_srcA == e_dstE && e_icode == IRMOVQ 				: e_valC;
	reg_srcA == e_dstE && e_icode == RRMOVQ 				: e_rvalA;
	reg_srcA == e_dstE && e_icode in {OPQ, POPQ, PUSHQ, CALL}		: e_valE;
	reg_srcA == m_dstE && m_icode == IRMOVQ 				: m_valC;
	reg_srcA == m_dstE && m_icode == RRMOVQ 				: m_rvalA;
	reg_srcA == m_dstE && m_icode in {OPQ, POPQ, PUSHQ, CALL}		: m_valE;
	reg_srcA == m_dstM && m_icode in {MRMOVQ, POPQ}				: m_valM;
	reg_srcA == reg_dstM 							: reg_inputM;
	reg_srcA == reg_dstE							: reg_inputE;
	reg_srcA == REG_NONE							: 0;
	1									: reg_outputA;
];

d_rvalB = [
	reg_srcB == e_dstE && e_icode == IRMOVQ 				: e_valC;
	reg_srcB == e_dstE && e_icode == RRMOVQ 				: e_rvalA;
	reg_srcB == e_dstE && e_icode in {OPQ, POPQ, PUSHQ, CALL, RET} 		: e_valE;
	reg_srcB == m_dstE && m_icode == IRMOVQ 				: m_valC;
	reg_srcB == m_dstE && m_icode == RRMOVQ 				: m_rvalA;
	reg_srcB == m_dstE && m_icode in {OPQ, POPQ, PUSHQ, CALL, RET}		: m_valE;
	reg_srcB == m_dstM && m_icode in {MRMOVQ, POPQ}				: m_valM;
	reg_srcB == reg_dstM 							: reg_inputM;
	reg_srcB == reg_dstE							: reg_inputE;
	1									: reg_outputB;
];

d_dstE = [
	D_icode in {RRMOVQ, IRMOVQ, OPQ} 	: D_rB;
	D_icode in {POPQ, PUSHQ, CALL, RET}	: REG_RSP;
	1					: REG_NONE;
];
#############################
d_dstM = [ 
	D_icode in {MRMOVQ, POPQ} 	: D_rA;
	1				: REG_NONE;
];

#Execute

wire loadUse:1;

register eM {
	icode 		: 4 = 0;
	ifun 		: 4 = 0;
	rA 		: 4 = 15;
	rvalA 		: 64 = 0xBADBADBAD;
	rvalB 		: 64 = 0xBADBADBAD;
	oldvalP	: 64 = 0;
	dstE 		: 4 = 0;
	dstM		: 4 = 15;
	valC 		: 64 = 0;
	valE 		: 64 = 0;
	conditionsMet 	: 1 = 0;
	stat 		: 3 = 0;
}



##############################

loadUse = (E_icode in {MRMOVQ, POPQ} && E_dstM == reg_srcA) || (E_icode in {MRMOVQ, POPQ} && E_dstM == reg_srcB);

# MUX to execute ALU
e_valE = [
	E_icode == OPQ && E_ifun == ADDQ	: E_rvalA + E_rvalB;
	E_icode == OPQ && E_ifun == SUBQ	: E_rvalB - E_rvalA;
	E_icode == OPQ && E_ifun == ANDQ	: E_rvalA & E_rvalB;
	E_icode == OPQ && E_ifun == XORQ	: E_rvalA ^ E_rvalB;
	E_icode in {RMMOVQ, MRMOVQ, POPQ, RET}	: E_valC + E_rvalB;
	E_icode in {PUSHQ, CALL}		: E_rvalB - E_valC;
#	E_icode == RRMOVQ && E_ifun != ALWAYS	: E_rvalB - E_rvalA;
	1					: 0;
];


# set condition codes for OPq
stall_C = !(E_icode == OPQ);
c_ZF = (e_valE == 0);
c_SF = (e_valE >= 0x8000000000000000);

# MUX for CMOVXX
e_conditionsMet = [
	E_ifun == ALWAYS: 1;
	E_ifun == LE 	: C_SF || C_ZF;
	E_ifun == LT 	: C_SF;
	E_ifun == EQ 	: C_ZF;
	E_ifun == NE 	: ~C_ZF;
	E_ifun == GE 	: ~C_SF || C_ZF;
	E_ifun == GT 	: ~C_SF & ~C_ZF;
	1 		: 0;
];

e_dstE = [
	E_icode == RRMOVQ && !e_conditionsMet	: 15;
	1					: E_dstE;
];

#Memory

register mW {
	rA		: 4 = 15;
	rvalA 		: 64 = 0;
	valC 		: 64 = 0;
	valE 		: 64 = 0;
	dstE 		: 4 = 0;
	valM		: 64 = 0;
	dstM		: 4 = 15;
	stat 		: 3 = 0;
	icode 		: 4 = 0;
	ifun 		: 4 = 0;
	conditionsMet 	: 1 = 0;
}


mem_input = [
	M_icode in {RMMOVQ, PUSHQ}	: M_rvalA;
	M_icode == CALL			: M_oldvalP;
	1 				: 0;
];

mem_addr = [
	M_icode in {POPQ, RET}			: M_rvalB;
	M_icode in {RMMOVQ, MRMOVQ, PUSHQ, CALL}: M_valE;
	1 					: 0;
];

mem_readbit = [
	M_icode in {RMMOVQ, PUSHQ, CALL}: 0;
	1 				: 1;
];

mem_writebit = [
	M_icode in {RMMOVQ, PUSHQ, CALL}: 1;
	1 				: 0;
];



#Writeback


reg_dstE = [
	W_icode == HALT				: 15;
	!W_conditionsMet && W_icode == RRMOVQ 	: 15;
	1					: W_dstE;
];

reg_inputM = [
	W_icode in {MRMOVQ, POPQ} : W_valM;
        1: 0xBADBADBAD;
];




reg_inputE = [
	W_icode == RRMOVQ && W_conditionsMet	: W_rvalA;
	W_icode == IRMOVQ			: W_valC;
	W_icode in {OPQ, PUSHQ, POPQ, CALL, RET}: W_valE;
	1					: 0;
];

#PC and Status updates

Stat = W_stat;

p_predPC = f_valP;

bubble_D = (e_icode == JXX && !e_conditionsMet) || (e_icode == RET) || (m_icode == RET);
stall_D = loadUse;

bubble_E = loadUse || (e_icode == JXX && !e_conditionsMet) || (m_icode == RET);

bubble_M = (m_icode == RET);

stall_F = loadUse || (d_icode == RET) || (e_icode == RET) || (m_icode == RET) || (f_stat != STAT_AOK);
