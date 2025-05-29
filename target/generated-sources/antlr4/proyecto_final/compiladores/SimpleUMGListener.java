// Generated from proyecto_final\compiladores\SimpleUMG.g4 by ANTLR 4.5.1
package proyecto_final.compiladores;

package proyecto_final.compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleUMGParser}.
 */
public interface SimpleUMGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SimpleUMGParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SimpleUMGParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(SimpleUMGParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(SimpleUMGParser.BloqueContext ctx);
}