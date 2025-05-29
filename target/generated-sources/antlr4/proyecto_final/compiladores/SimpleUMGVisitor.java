// Generated from proyecto_final\compiladores\SimpleUMG.g4 by ANTLR 4.5.1
package proyecto_final.compiladores;

package proyecto_final.compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleUMGParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleUMGVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(SimpleUMGParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(SimpleUMGParser.BloqueContext ctx);
}