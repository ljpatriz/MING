grammar mipsgrammar;

/*
 * Parser Rules
 */
 
expr : LPAREN operator SPACE expr ( SPACE expr )+ RPAREN | constant ;	// match (operator expr expr+)
operator : (PLUS | MINUS | TIMES | DIVIDE) ;
constant : INTEGER ;


line : command NEWLINE ;
command : (add | addi | addiu | addu | and | andi | beq | bgez | bgtz | blez | bltz | bne | break | clo | clz | div | divu | j | jal | jalr | jr | lb | lbu | lh | lhu | lw | movn | movz | mul | mult | nop | nor | or | sb | sub | subu | sw | syscall | xor | xori | ori)


add : ADD REGISTER REGISTER REGISTER ;
addi : ADDI REGISTER REGISTER INT ;
addiu : ADDIU REGISTER REGISTER INT ;
addu : ADDU REGISTER REGISTER REGISTER ;
and : AND REGISTER REGISTER REGISTER ;
andi : ANDI REGISTER REGISTER INT ;
beq : BEQ REGISTER REGISTER LABEL ;
bgez : BGEZ REGISTER LABEL ;
bgtz : BGTZ REGISTER LABEL ;
bltz : BLTZ REGISTER LABEL ;
bne : BNE REGISTER REGISTER LABEL ;
break : BREAK ;
clo : CLO REGISTER REGISTER ;
clz : CLZ REGISTER REGISTER ;
div : DIV REGISTER REGISTER ;
divu : DIVU REGISTER REGISTER ;
j : J LABEL ;
jal : JAL LABEL ;
jalr : JALR REGISTER ;
jr : JR REGISTER ;
lb : LB REGISTER INT LPAREN REGISTER RPAREN ;
lbu : LBU REGISTER INT LPAREN REGISTER RPAREN ;
lh : LH REGISTER INT LPAREN REGISTER RPAREN ;
lhu : LHU REGISTER INT LPAREN REGISTER RPAREN ;
lw : LW REGISTER INT LPAREN REGISTER RPAREN ;
movn : MOVN REGISTER REGISTER REGISTER ;
movz : MOVZ REGISTER REGISTER REGISTER ;
mul : MUL REGISTER REGISTER REGISTER ;
mult : MULT REGISTER REGISTER ;
nop : NOP ;
nor : NOR REGISTER REGISTER REGISTER ;
or : OR REGISTER REGISTER REGISTER ;
sb : SB REGISTER INT LPAREN REGISTER RPAREN ;
sub : SUB REGISTER REGISTER REGISTER ;
subu : SUBU REGISTER REGISTER REGISTER ;
sw : SW REGISTER INT LPAREN REGISTER RPAREN ;
syscall : SYSCALL ;
xor : XOR REGISTER REGISTER REGISTER ;
xori : XORI REGISTER REGISTER INT ;
ori : ORI REGISTER REGISTER INT ;





/*
 * Lexer Rules
 */

ADD		: "add"		;
ADDI	: "addi"	;
ADDIU	: "addiu"	;
ADDU	: "addu"	;
AND		: "and"		;
ANDI	: "andi"	;
BEQ		: "beq"		;
BGEZ	: "bgez"	;
BGTZ	: "bgtz"	;
BLTZ	: "bltz"	;
BNE		: "bne"		;
BREAK	: "break"	;
CLO		: "clo"		;
CLZ		: "clz"		;
DIV		: "div"		;
DIVU	: "divu"	;
J		: "j"		;
JAL		: "jal"		;
JALR	: "jalr"	;
JR		: "jr"		;
LB		: "lb"		;
LBU		: "lbu"		;
LH		: "lh"		;
LHU		: "lhu"		;
LW		: "lw"		;
MOVN	: "movn"	;
MOVZ	: "movz"	;
MUL		: "mul"		;
MULT	: "mult"	;
NOP		: "nop"		;
NOR		: "nor"		;
OR		: "or"		;
SB		: "sb"		;
SUB		: "sub"		;
SUBU	: "subu"	;
SW		: "sw"		;
SYSCALL	: "syscall"	;
XOR		: "xor"		;
XORI	: "xori"	;
ORI		: "ori"		;

 
WS :[\t\r\n]+->skip;
LPAREN		: '(' ;
RPAREN		: ')' ;
PLUS		: '+' ;
MINUS		: '-' ;
TIMES		: '*' ;
DIVIDE		: '/' ;
INTEGER		: [1-9][0-9]* ;
SPACE		: ' ' ;