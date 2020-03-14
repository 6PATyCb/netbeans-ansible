   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
grammar AnsibleIniAntlr;
//@lexer::header{package de.javastream.netbeans.ansible.lexer;}

ini
    :(sl_comment | section | varsSection | groupSection | EOL)*
    ;

sl_comment
    : SL_COMMENT
    ;

section
    : sectionHeader sectionRow+
    ;

sectionRow
    : ((hostname? (WS* expression)*)|EOL*|sl_comment*) EOL
    ;


varsSection
    : sectionVarsHeader (expression | EOL)*
    ;

groupSection
    : sectionGroupHeader (hostname (expression)* | EOL)*
    ;

sectionHeader
   : SECTION_HEADER
   ;

sectionVarsHeader
   : SECTION_VARS_HEADER
   ;


sectionGroupHeader
   : SECTION_GROUP_HEADER
   ;


expression
   : variable WS* EQUAL WS* value
   ;

variable
   : IDENT
   ;


value
   : (path | hostname | (STRING|IDENT))
   ;

path
   : PATH
   ;


hostname
   : (STRING|IDENT) (DOT STRING)*
   ;



SECTION_VARS_HEADER
   : LSQUARE (STRING|IDENT) COLON WARS RSQUARE (WS|EOL)*EOL
   ;

SECTION_GROUP_HEADER
   : LSQUARE (STRING|IDENT) COLON IDENT RSQUARE (WS|EOL)*EOL
   ;

SECTION_HEADER
   : LSQUARE (STRING|IDENT) RSQUARE (WS|EOL)*EOL
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


EQUAL
   : '='
   ;


SLASH
   : '/'
   ;


DOT
    : '.'
    ;

MINUS
    : '-'
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

FOLDER_NAME
    : ('.' | '..' | [a-zA-Z~0-9._-]+)
    ;

FILE_NAME
    : '.'? [a-zA-Z~0-9._-]+
    ;

PATH
   : SLASH? (FOLDER_NAME) (SLASH FOLDER_NAME)* SLASH? FILE_NAME?
   ;


WS
   : [ \t] +
   ; 

EOL
   : [\r]?[\n]
   ;
