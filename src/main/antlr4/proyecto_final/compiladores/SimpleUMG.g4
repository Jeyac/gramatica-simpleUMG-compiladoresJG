grammar SimpleUMG;

@header {
package proyecto_final.compiladores;
}

programa: bloque;
bloque: '{' '}';

IDENT: [a-zA-Z]+;
WS: [ \t\r\n]+ -> skip;