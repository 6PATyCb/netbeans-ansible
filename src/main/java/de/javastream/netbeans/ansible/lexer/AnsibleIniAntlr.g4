/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
grammar AnsibleIniAntlr;
//@lexer::header{package de.javastream.netbeans.ansible.lexer;}

ini
    :(sl_comment | section | varsSection | groupSection)*
    ;

sl_comment
    : SL_COMMENT
    ;

section
    : sectionHeader (hostname | EOL)*
    ;


varsSection
    : sectionVarsHeader (hostname | EOL)*
    ;


groupSection
    : sectionGroupHeader (hostname | EOL)*
    ;


sectionHeader
   : LSQUARE IDENT RSQUARE (WS|EOL)*EOL
   ;


sectionVarsHeader
   : LSQUARE IDENT COLON WARS RSQUARE (WS|EOL)*EOL
   ;


sectionGroupHeader
   : LSQUARE IDENT COLON IDENT RSQUARE (WS|EOL)*EOL
   ;





hostname
   : (STRING|IDENT) (DOT STRING)*
   ;

WARS
   : 'v' 'a' 'r' 's'
   ;


SL_COMMENT
   : '#' ~ [\r\n]* EOL
   ;


LSQUARE
    : '['
    ;


RSQUARE
    : ']'
    ;

IDENT
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;


DOT
    : '.'
    ;


COLON
    : ':'
    ;


HEX
   : ('%' [a-fA-F0-9] [a-fA-F0-9]) +
   ;


STRING
   : ([a-zA-Z~0-9] | HEX) ([a-zA-Z0-9.-] | HEX)*
   ;


WS
   : [ \t] +
   ; 

EOL
   : [\r]?[\n]
   ;