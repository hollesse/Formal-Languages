s : expr '$' ;

expr
	: product exprRest
	;

exprRest
    : '+' product exprRest
    | '-' product exprRest
    | 
    ; 

product
	: factor productRest
	;

productRest
    : '*' factor productRest
    | '/' factor productRest
    |
    ;

factor
	: CONSTANT
	| '(' expr ')'
	;

