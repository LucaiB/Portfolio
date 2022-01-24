# -*-sh-*- # this line enables partial syntax highlighting in emacs
m_icode = M_icode;
m_valM = mem_output;
m_rA = M_rA;
m_dstM = M_dstM;
m_stat = M_stat;

d_icode = D_icode;
d_valC = D_valC;
d_rA = D_rA;
d_stat = D_stat;

register fF { pc:64 = 0; }
Stat = W_stat;

f_pc = valP;

wire operand1:64, operand2:64, loadUse:1;

mem_readbit = M_icode == MRMOVQ;
mem_writebit = M_icode == RMMOVQ ;

#Fetch
pc = F_pc;

wire ifun:4;

valP = F_pc + offset;

f_icode = i10bytes[4..8];
ifun = i10bytes[0..4];
f_rA = i10bytes[12..16];
f_rB = i10bytes[8..12];

f_valC = [
	f_icode == JXX : i10bytes[8..72];
	1 : i10bytes[16..80];
];

wire offset:64, valP:64;
offset = [
	f_icode in { HALT, NOP, RET } : 1;
	f_icode in { RRMOVQ, OPQ, PUSHQ, POPQ } : 2;
	f_icode in { JXX, CALL } : 9;
	1 : 10;
];

f_stat = [
	f_icode == HALT	: STAT_HLT;
	f_icode > 11	: STAT_INS;
	1		: STAT_AOK;
];





#Decode

reg_srcA = [
	D_icode == RMMOVQ : D_rA;
	1 : REG_NONE;
];


d_rvalA = [
	reg_srcA == REG_NONE			: 0;	
	m_icode == MRMOVQ && m_dstM == reg_srcA	: m_valM;
	W_icode == MRMOVQ && W_dstM == reg_srcA : W_valM;
	1	: reg_outputA;
];

reg_srcB = [
	D_icode in {RMMOVQ, MRMOVQ} : D_rB;
	1 : REG_NONE;
];

d_rvalB = [
	reg_srcB == REG_NONE			: 0;	
	m_icode == MRMOVQ && m_dstM == reg_srcB	: m_valM;
	W_icode == MRMOVQ && W_dstM == reg_srcB : W_valM;
	1	: reg_outputB;
];

register fD {
	stat	: 3 = 0;
	icode	: 4 = 0;
	rA	: 4 = 15;
	rB	: 4 = 15;
	valC	: 64 = 0;
}

d_dstM = [ 
	D_icode == MRMOVQ : D_rA;
	1: REG_NONE;
];

#Memory

register eM {
	icode 	: 4 = 0;
	valE 	: 64 = 0;
	rvalA 	: 64 = 0;
	rA 	: 4 = 15;
	dstM	: 4 = 15;
	stat	: 3 = 0;
}

mem_addr = [
	M_icode in { MRMOVQ, RMMOVQ } : M_valE;
        1: 0xBADBADBAD;
];
mem_input = [
	M_icode == RMMOVQ  : M_rvalA;
        1: 0xBADBADBAD;
];



#Execute

register dE {
	icode	: 4 = 0;
	rA	: 4 = 15;
	rvalA	: 64 = 0;
	rvalB	: 64 = 0;
	valC	: 64 = 0;
	dstM	: 4 = 15;
	stat	: 3 = 0;
}

operand1 = [
	E_icode in { MRMOVQ, RMMOVQ } : E_valC;
	1: 0;
];
operand2 = [
	E_icode in { MRMOVQ, RMMOVQ } : E_rvalB;
	1: 0;
];

loadUse = (E_icode == MRMOVQ && E_dstM == reg_srcA) || (E_icode == MRMOVQ && E_dstM == reg_srcB);

stall_F = loadUse;
stall_D = loadUse;
bubble_E = loadUse;

e_valE = [
	E_icode in { MRMOVQ, RMMOVQ } : operand1 + operand2;
	1 : 0;
];

e_icode = E_icode;
e_rvalA = E_rvalA;
e_rA = E_rA;
e_dstM = E_dstM;
e_stat = E_stat;

#Writeback

register mW {
	icode	: 4 = 0;
	valM	: 64 = 0;
	rA	: 4 = 15;
	dstM	: 4 = 15;
	stat	: 3 = 0;
}

reg_dstM = W_dstM;

reg_inputM = [
	W_icode == MRMOVQ : W_valM;
        1: 0xBADBADBAD;
];




