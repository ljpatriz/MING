grammar Mips;

@header {
package model.reading;
}

/*
 * Parser Rules
 */

program : command+ ;
line : command ;
command : (add | addi | addiu | addu | and | andi | beq | bgez | bgtz | blez | bltz | bne | break_
               | clo | clz | div | divu | j | jal | jalr | jr | lb | lbu | lh | li | lhu | lw | move
               | movn| movz | mul | mult | nop | nor | or | sb | sub | subu | sw | syscall | xor
               | xori | ori | label | mfhi | mflo ) ;


add : ADD REGISTER REGISTER REGISTER ;
addi : ADDI REGISTER REGISTER INT ;
addiu : ADDIU REGISTER REGISTER INT ;
addu : ADDU REGISTER REGISTER REGISTER ;
and : AND REGISTER REGISTER REGISTER ;
andi : ANDI REGISTER REGISTER INT ;
beq : BEQ REGISTER REGISTER LABEL ;
bgez : BGEZ REGISTER LABEL ;
bgtz : BGTZ REGISTER LABEL ;
blez : BLEZ REGISTER LABEL ;
bltz : BLTZ REGISTER LABEL ;
bne : BNE REGISTER REGISTER LABEL ;
break_ : BREAK ;
clo : CLO REGISTER REGISTER ;
clz : CLZ REGISTER REGISTER ;
div : DIV REGISTER REGISTER ;
divu : DIVU REGISTER REGISTER ;
j : J LABEL ;
jal : JAL LABEL ;
jalr : JALR REGISTER REGISTER ;
jr : JR REGISTER ;
lb : LB REGISTER INT LPAREN REGISTER RPAREN ;
lbu : LBU REGISTER INT LPAREN REGISTER RPAREN ;
lh : LH REGISTER INT LPAREN REGISTER RPAREN ;
lhu : LHU REGISTER INT LPAREN REGISTER RPAREN ;
li : LI REGISTER INT ;
lw : LW REGISTER INT LPAREN REGISTER RPAREN ;
mfhi : MFHI REGISTER ;
mflo : MFLO REGISTER ;
move : MOVE REGISTER REGISTER ;
movn : MOVN REGISTER REGISTER REGISTER ;
movz : MOVZ REGISTER REGISTER REGISTER ;
mul : MUL REGISTER REGISTER REGISTER ;
mult : MULT REGISTER REGISTER ;
nop : NOP ;
nor : NOR REGISTER REGISTER REGISTER ;
or : OR REGISTER REGISTER REGISTER ;
ori : ORI REGISTER REGISTER INT ;
sb : SB REGISTER INT LPAREN REGISTER RPAREN ;
sub : SUB REGISTER REGISTER REGISTER ;
subu : SUBU REGISTER REGISTER REGISTER ;
sw : SW REGISTER INT LPAREN REGISTER RPAREN ;
syscall : SYSCALL ;
xor : XOR REGISTER REGISTER REGISTER ;
xori : XORI REGISTER REGISTER INT ;
label : LABEL;





/*
 * Lexer Rules
 */

REGISTER: ('$zero' | '$at' | '$v0' | '$v1' | '$a0' | '$a1' | '$a2' | '$a3' | '$t0' | '$t1' | '$t2'
        | '$t3' | '$t4' | '$t5' | '$t6' | '$t7' | '$s0' | '$s1' | '$s2' | '$s3' | '$s4' | '$s5'
        | '$s6' | '$s7' | '$t8' | '$t9' | '$k0' | '$k1' | '$gp' | '$sp' | '$fp' | '$ra' | '$0'
        | '$1' | '$2' | '$3' | '$4' | '$5' | '$6' | '$7' | '$8' | '$9' | '$10' | '$11' | '$12'
        | '$13' | '$14' | '$15' | '$16' | '$17' | '$18' | '$19' | '$20' | '$21' | '$22' | '$23'
        | '$24' | '$25' | '$26' | '$27' | '$28' | '$29' | '$30' | '$31') ;
INT		: [1-9][0-9]*;

ADD		: 'add'		;
ADDI	: 'addi'	;
ADDIU	: 'addiu'	;
ADDU	: 'addu'	;
AND		: 'and'		;
ANDI	: 'andi'	;
BEQ		: 'beq'		;
BGEZ	: 'bgez'	;
BGTZ	: 'bgtz'	;
BLEZ	: 'blez'	;
BLTZ	: 'bltz'	;
BNE		: 'bne'		;
BREAK	: 'break'	;
CLO		: 'clo'		;
CLZ		: 'clz'		;
DIV		: 'div'		;
DIVU	: 'divu'	;
J		: 'j'		;
JAL		: 'jal'		;
JALR	: 'jalr'	;
JR		: 'jr'		;
LB		: 'lb'		;
LBU		: 'lbu'		;
LH		: 'lh'		;
LHU		: 'lhu'		;
LI      : 'li'      ;
LW		: 'lw'		;
MFHI    : 'mfhi'    ;
MFLO    : 'mflo'    ;
MOVE    : 'move'    ;
MOVN	: 'movn'	;
MOVZ	: 'movz'	;
MUL		: 'mul'		;
MULT	: 'mult'	;
NOP		: 'nop'		;
NOR		: 'nor'		;
OR		: 'or'		;
SB		: 'sb'		;
SUB		: 'sub'		;
SUBU	: 'subu'	;
SW		: 'sw'		;
SYSCALL	: 'syscall'	;
XOR		: 'xor'		;
XORI	: 'xori'	;
ORI		: 'ori'		;

//SEP		: WS		; //(SPACE+ | COMMA SPACE+ | COMMA | TAB | NEWLINE)
//SPACE	: ' '		;
//COMMA	: ','		;


WS :[, \t\r\n]+->skip;
LPAREN		: '(' ;
RPAREN		: ')' ;
LABEL	: .+?':' ;

