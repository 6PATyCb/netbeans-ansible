/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar AnsibleIniLexerGrammar;
@lexer::header{package de.javastream.netbeans.ansible.lexer;}

HOST_AND_PORT: HOST_NAME ':' NUMBER;
GROUP: LSQUARE NAME (':' NAME)? RSQUARE;
RANGE_HOST_NAME: (LETTER|DIGIT|'_'|'-'|'.')+ LSQUARE (DIGIT)+ ':' (DIGIT)+ RSQUARE (LETTER|DIGIT|'_'|'-'|'.')+;
NAME: (LETTER) (LETTER|DIGIT|'_'|'-')*;
NUMBER: NO_ZERO_DIGIT (DIGIT)*;
HOST_NAME: (LETTER) (LETTER|DIGIT|'_'|'-'|'.')*;
IPV4: ('1'..'2')? ('0'..'9')? ('0'..'9') '.' ('1'..'2')? ('0'..'9')? ('0'..'9') '.' ('1'..'2')? ('0'..'9')? ('0'..'9') '.' ('1'..'2')? ('0'..'9')? ('0'..'9');
STRING: '"' ~[\n\r]*? '"';
WS: [ \t\r\n]+; 
SL_COMMENT: '#' .*? '\n';
OPERATOR:  ('=');

fragment LSQUARE: '[';
fragment RSQUARE: ']';
fragment LETTER: ('a'..'z'|'A'..'Z');
fragment DIGIT: '0'..'9';
fragment NO_ZERO_DIGIT: '1'..'9';
