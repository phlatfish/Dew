grammar dew;

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';

program: statement* EOF;

statement
    : assignment ';'
    | methodCall ';'
    ;

assignment
    : variableType variableName '=' expression
    ;

variableType
    : 'int'
    | 'str'
    | 'float'
    | 'bool'
    ;

variableName: NAME;

expression
    : methodCall
    | STRING
    | NUMBER
    | variableName
    | '(' expression ')'
    | expression op=(ADD | SUB | MUL | DIV) expression
    ;

methodCall
    : methodName '(' methodCallArguments ')'
    ;

methodName: NAME;

methodCallArguments
    : expression (',' expression)*
    ;

NAME: [a-zA-Z][a-zA-Z0-9]*;

STRING: '"' ~('"')* '"';

NUMBER: '-'? ('0'..'9')+ ('.' ('0'..'9')+)?;

WS: [ \t\u000C\r\n]+ -> skip;
