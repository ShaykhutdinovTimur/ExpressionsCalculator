grammar ArithmeticExpressions;
prog: stat+ ;

stat: VAR '=' expr ';' NEWLINE # Assign
    | expr ';' NEWLINE # ExpressionOnly;

expr:  expr op=(ADD|SUB) term # AdditionOrSubtract
    | term # AdditionOrSubtractTerm;

term:  term op=(MUL|DIV) factor # MultiplicationOrDivision
    | factor # MultiplicationOrDivisionDeg;

factor: deg EXP factor # FactorDeg
    | deg # SimpleFactor;

deg:  INT # Int
    | (SUB|)VAR # Var
    | (SUB|)'(' expr ')' # Parens;

VAR : [a-zA-Z]+ ;
INT : [-]?[0-9]+ ;

NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
EXP : '^' ;