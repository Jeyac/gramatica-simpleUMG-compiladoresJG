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
	 * Visit a parse tree produced by {@link SimpleUMGParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SimpleUMGParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(SimpleUMGParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#librerias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrerias(SimpleUMGParser.LibreriasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#libreria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibreria(SimpleUMGParser.LibreriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(SimpleUMGParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(SimpleUMGParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(SimpleUMGParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(SimpleUMGParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(SimpleUMGParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(SimpleUMGParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(SimpleUMGParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(SimpleUMGParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(SimpleUMGParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#llamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada(SimpleUMGParser.LlamadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExpr(SimpleUMGParser.IdentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unariaExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnariaExpr(SimpleUMGParser.UnariaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(SimpleUMGParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code llamadaExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaExpr(SimpleUMGParser.LlamadaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativaExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativaExpr(SimpleUMGParser.MultiplicativaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(SimpleUMGParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igualdadExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdadExpr(SimpleUMGParser.IgualdadExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relacionalExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacionalExpr(SimpleUMGParser.RelacionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(SimpleUMGParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aditivaExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAditivaExpr(SimpleUMGParser.AditivaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(SimpleUMGParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SimpleUMGParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleUMGParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(SimpleUMGParser.TipoContext ctx);
}