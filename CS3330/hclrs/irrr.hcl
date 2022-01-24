# An example file in our custom HCL variant, with lots of comments

register pP {  
	pc:64 = 0; # 64-bits wide; 0 is its default value.
} 

register cC {
	SF:1 = 0;
	ZF:1 = 0;
}

pc = P_pc;

# we can define our own input/output "wires" of any number of 0<bits<=80
wire opcode:8, icode:4;

# the x[i..j] means "just the bits between i and j".  x[0..1] is the 
# low-order bit, similar to what the c code "x&1" does; "x&7" is x[0..3]
opcode = i10bytes[0..8];   # first byte read from instruction memory
icode = opcode[4..8];      # top nibble of that byte

/* we could also have done i10bytes[4..8] directly, but I wanted to
 * demonstrate more bit slicing... and all 3 kinds of comments      */
// this is the third kind of comment

# named constants can help make code readable
const TOO_BIG = 0xC; # the first unused icode in Y86-64

# some named constants are built-in: the icodes, ifuns, STAT_??? and REG_???


# Stat is a built-in output; STAT_HLT means "stop", STAT_AOK means 
# "continue".  The following uses the mux syntax described in the 
# textbook
Stat = [
	icode > 11: STAT_INS;
	icode == HALT : STAT_HLT;
	1             : STAT_AOK;
];


wire rA:4, rB:4, valC:64;


rA = [
icode == RRMOVQ : i10bytes[12..16];
1 : REG_NONE;
];


rB =  [
icode == IRMOVQ : i10bytes[8..12];
icode == RRMOVQ : i10bytes[8..12];
1 : REG_NONE;
];


valC = [
icode == IRMOVQ : i10bytes[16..80];
icode == JXX    : i10bytes[8..72];
1 : 0;
];


reg_srcA = [
icode == RRMOVQ : rA;
1 : REG_NONE;
];

reg_dstE = [
icode == IRMOVQ : rB;
icode == RRMOVQ : rB;
1 : REG_NONE;
];

reg_inputE = [
icode == IRMOVQ : valC;
icode == RRMOVQ : reg_outputA;
1 : 0;
];


# to make progress, we have to update the PC...
p_pc = P_pc + [
	icode == HALT: 1;
	icode == NOP: 1;
	icode == RRMOVQ: 2;
	icode == OPQ: 2;
	icode == PUSHQ: 2;
	icode == POPQ: 2; 
	icode == IRMOVQ: 10;
	icode == MRMOVQ: 10;
	icode == RMMOVQ: 10;
	icode == JXX: valC - P_pc;
	1:10;
];# you may use math ops directly...
