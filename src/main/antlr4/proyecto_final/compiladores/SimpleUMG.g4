grammar SimpleUMG;

@header {
package proyecto_final.compiladores;
}

// Regla inicial explícita (para evitar problemas con StartContext)
start: programa EOF;

// Reglas del parser
programa: librerias? PROGRAMA tipo IDENT bloque;

librerias: libreria+;
libreria: LIB tipo IDENT '(' parametros? ')' ';';
parametros: parametro (',' parametro)*;
parametro: tipo IDENT;

bloque: '{' (declaracion | sentencia)* '}';

declaracion: tipo IDENT ';';

sentencia: asignacion
         | si
         | mientras
         | retorno
         | llamada ';';

asignacion: IDENT '=' expresion ';';

si: IF '(' expresion ')' bloque (ELSE bloque)?;

mientras: WHILE '(' expresion ')' bloque;

retorno: RETURN expresion ';';

llamada: IDENT '(' (expresion (',' expresion)*)? ')';


