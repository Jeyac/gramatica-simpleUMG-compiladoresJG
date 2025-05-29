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
	 * Enter a parse tree produced by {@link SimpleUMGParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SimpleUMGParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SimpleUMGParser.StartContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleUMGParser#librerias}.
	 * @param ctx the parse tree
	 */
	void enterLibrerias(SimpleUMGParser.LibreriasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#librerias}.
	 * @param ctx the parse tree
	 */
	void exitLibrerias(SimpleUMGParser.LibreriasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#libreria}.
	 * @param ctx the parse tree
	 */
	void enterLibreria(SimpleUMGParser.LibreriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#libreria}.
	 * @param ctx the parse tree
	 */
	void exitLibreria(SimpleUMGParser.LibreriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(SimpleUMGParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(SimpleUMGParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(SimpleUMGParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(SimpleUMGParser.ParametroContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(SimpleUMGParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(SimpleUMGParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(SimpleUMGParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(SimpleUMGParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(SimpleUMGParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(SimpleUMGParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(SimpleUMGParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(SimpleUMGParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(SimpleUMGParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(SimpleUMGParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(SimpleUMGParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(SimpleUMGParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#llamada}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(SimpleUMGParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#llamada}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(SimpleUMGParser.LlamadaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterIdentExpr(SimpleUMGParser.IdentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitIdentExpr(SimpleUMGParser.IdentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unariaExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterUnariaExpr(SimpleUMGParser.UnariaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unariaExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitUnariaExpr(SimpleUMGParser.UnariaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(SimpleUMGParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(SimpleUMGParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code llamadaExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaExpr(SimpleUMGParser.LlamadaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code llamadaExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaExpr(SimpleUMGParser.LlamadaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativaExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativaExpr(SimpleUMGParser.MultiplicativaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativaExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativaExpr(SimpleUMGParser.MultiplicativaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(SimpleUMGParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(SimpleUMGParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code igualdadExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterIgualdadExpr(SimpleUMGParser.IgualdadExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code igualdadExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitIgualdadExpr(SimpleUMGParser.IgualdadExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relacionalExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterRelacionalExpr(SimpleUMGParser.RelacionalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relacionalExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitRelacionalExpr(SimpleUMGParser.RelacionalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(SimpleUMGParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(SimpleUMGParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aditivaExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAditivaExpr(SimpleUMGParser.AditivaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aditivaExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAditivaExpr(SimpleUMGParser.AditivaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(SimpleUMGParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SimpleUMGParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(SimpleUMGParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SimpleUMGParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SimpleUMGParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleUMGParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(SimpleUMGParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUMGParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(SimpleUMGParser.TipoContext ctx);
}