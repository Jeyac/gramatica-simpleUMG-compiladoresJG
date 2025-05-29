// Generated from proyecto_final\compiladores\SimpleUMG.g4 by ANTLR 4.5.1
package proyecto_final.compiladores;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleUMGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, NUMERO=21, FLOAT_NUM=22, BOOLEANO=23, CADENA=24, 
		INT=25, FLOAT=26, BOOL=27, STRING=28, PROGRAMA=29, LIB=30, IF=31, ELSE=32, 
		WHILE=33, RETURN=34, OPARIT=35, OPREL=36, OPIGUAL=37, OPLOG=38, IDENT=39, 
		COMENTARIO=40, WS=41;
	public static final int
		RULE_start = 0, RULE_programa = 1, RULE_librerias = 2, RULE_libreria = 3, 
		RULE_parametros = 4, RULE_parametro = 5, RULE_bloque = 6, RULE_declaracion = 7, 
		RULE_sentencia = 8, RULE_asignacion = 9, RULE_si = 10, RULE_mientras = 11, 
		RULE_retorno = 12, RULE_llamada = 13, RULE_expresion = 14, RULE_literal = 15, 
		RULE_tipo = 16;
	public static final String[] ruleNames = {
		"start", "programa", "librerias", "libreria", "parametros", "parametro", 
		"bloque", "declaracion", "sentencia", "asignacion", "si", "mientras", 
		"retorno", "llamada", "expresion", "literal", "tipo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "','", "'{'", "'}'", "'='", "'-'", "'!'", "'*'", 
		"'/'", "'+'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", 
		null, null, null, null, "'int'", "'float'", "'bool'", "'string'", "'programa'", 
		"'lib'", "'if'", "'else'", "'while'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "NUMERO", "FLOAT_NUM", 
		"BOOLEANO", "CADENA", "INT", "FLOAT", "BOOL", "STRING", "PROGRAMA", "LIB", 
		"IF", "ELSE", "WHILE", "RETURN", "OPARIT", "OPREL", "OPIGUAL", "OPLOG", 
		"IDENT", "COMENTARIO", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SimpleUMG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleUMGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SimpleUMGParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			programa();
			setState(35);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(SimpleUMGParser.PROGRAMA, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(SimpleUMGParser.IDENT, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public LibreriasContext librerias() {
			return getRuleContext(LibreriasContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if (_la==LIB) {
				{
				setState(37);
				librerias();
				}
			}

			setState(40);
			match(PROGRAMA);
			setState(41);
			tipo();
			setState(42);
			match(IDENT);
			setState(43);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibreriasContext extends ParserRuleContext {
		public List<LibreriaContext> libreria() {
			return getRuleContexts(LibreriaContext.class);
		}
		public LibreriaContext libreria(int i) {
			return getRuleContext(LibreriaContext.class,i);
		}
		public LibreriasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_librerias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterLibrerias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitLibrerias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitLibrerias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibreriasContext librerias() throws RecognitionException {
		LibreriasContext _localctx = new LibreriasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_librerias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				libreria();
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LIB );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibreriaContext extends ParserRuleContext {
		public TerminalNode LIB() { return getToken(SimpleUMGParser.LIB, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(SimpleUMGParser.IDENT, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public LibreriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libreria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterLibreria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitLibreria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitLibreria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibreriaContext libreria() throws RecognitionException {
		LibreriaContext _localctx = new LibreriaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_libreria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LIB);
			setState(51);
			tipo();
			setState(52);
			match(IDENT);
			setState(53);
			match(T__0);
			setState(55);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(54);
				parametros();
				}
			}

			setState(57);
			match(T__1);
			setState(58);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			parametro();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(61);
				match(T__3);
				setState(62);
				parametro();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(SimpleUMGParser.IDENT, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			tipo();
			setState(69);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__4);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << IDENT))) != 0)) {
				{
				setState(74);
				switch (_input.LA(1)) {
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
					{
					setState(72);
					declaracion();
					}
					break;
				case IF:
				case WHILE:
				case RETURN:
				case IDENT:
					{
					setState(73);
					sentencia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(SimpleUMGParser.IDENT, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			tipo();
			setState(82);
			match(IDENT);
			setState(83);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciaContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentencia);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				si();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				mientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				retorno();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				llamada();
				setState(90);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SimpleUMGParser.IDENT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IDENT);
			setState(95);
			match(T__6);
			setState(96);
			expresion(0);
			setState(97);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimpleUMGParser.IF, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimpleUMGParser.ELSE, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IF);
			setState(100);
			match(T__0);
			setState(101);
			expresion(0);
			setState(102);
			match(T__1);
			setState(103);
			bloque();
			setState(106);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(104);
				match(ELSE);
				setState(105);
				bloque();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SimpleUMGParser.WHILE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WHILE);
			setState(109);
			match(T__0);
			setState(110);
			expresion(0);
			setState(111);
			match(T__1);
			setState(112);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SimpleUMGParser.RETURN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(RETURN);
			setState(115);
			expresion(0);
			setState(116);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SimpleUMGParser.IDENT, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterLlamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitLlamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitLlamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_llamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IDENT);
			setState(119);
			match(T__0);
			setState(128);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__8) | (1L << NUMERO) | (1L << FLOAT_NUM) | (1L << BOOLEANO) | (1L << CADENA) | (1L << IDENT))) != 0)) {
				{
				setState(120);
				expresion(0);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(121);
					match(T__3);
					setState(122);
					expresion(0);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(130);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentExprContext extends ExpresionContext {
		public TerminalNode IDENT() { return getToken(SimpleUMGParser.IDENT, 0); }
		public IdentExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterIdentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitIdentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitIdentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnariaExprContext extends ExpresionContext {
		public Token op;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public UnariaExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterUnariaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitUnariaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitUnariaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExprContext extends ExpresionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LlamadaExprContext extends ExpresionContext {
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public LlamadaExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterLlamadaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitLlamadaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitLlamadaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativaExprContext extends ExpresionContext {
		public ExpresionContext izquierda;
		public Token op;
		public ExpresionContext derecha;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public MultiplicativaExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterMultiplicativaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitMultiplicativaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitMultiplicativaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExpresionContext {
		public ExpresionContext izquierda;
		public ExpresionContext derecha;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public OrExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgualdadExprContext extends ExpresionContext {
		public ExpresionContext izquierda;
		public Token op;
		public ExpresionContext derecha;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public IgualdadExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterIgualdadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitIgualdadExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitIgualdadExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelacionalExprContext extends ExpresionContext {
		public ExpresionContext izquierda;
		public Token op;
		public ExpresionContext derecha;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public RelacionalExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterRelacionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitRelacionalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitRelacionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpresionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ParenExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AditivaExprContext extends ExpresionContext {
		public ExpresionContext izquierda;
		public Token op;
		public ExpresionContext derecha;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public AditivaExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterAditivaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitAditivaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitAditivaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExpresionContext {
		public ExpresionContext izquierda;
		public ExpresionContext derecha;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public AndExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new UnariaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(133);
				((UnariaExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((UnariaExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(134);
				expresion(10);
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(T__0);
				setState(136);
				expresion(0);
				setState(137);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new LlamadaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				llamada();
				}
				break;
			case 4:
				{
				_localctx = new IdentExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(IDENT);
				}
				break;
			case 5:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativaExprContext(new ExpresionContext(_parentctx, _parentState));
						((MultiplicativaExprContext)_localctx).izquierda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(144);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(145);
						((MultiplicativaExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((MultiplicativaExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(146);
						((MultiplicativaExprContext)_localctx).derecha = expresion(10);
						}
						break;
					case 2:
						{
						_localctx = new AditivaExprContext(new ExpresionContext(_parentctx, _parentState));
						((AditivaExprContext)_localctx).izquierda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(147);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(148);
						((AditivaExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__11) ) {
							((AditivaExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(149);
						((AditivaExprContext)_localctx).derecha = expresion(9);
						}
						break;
					case 3:
						{
						_localctx = new RelacionalExprContext(new ExpresionContext(_parentctx, _parentState));
						((RelacionalExprContext)_localctx).izquierda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(150);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(151);
						((RelacionalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
							((RelacionalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(152);
						((RelacionalExprContext)_localctx).derecha = expresion(8);
						}
						break;
					case 4:
						{
						_localctx = new IgualdadExprContext(new ExpresionContext(_parentctx, _parentState));
						((IgualdadExprContext)_localctx).izquierda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(153);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(154);
						((IgualdadExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((IgualdadExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(155);
						((IgualdadExprContext)_localctx).derecha = expresion(7);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpresionContext(_parentctx, _parentState));
						((AndExprContext)_localctx).izquierda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(156);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(157);
						match(T__18);
						setState(158);
						((AndExprContext)_localctx).derecha = expresion(6);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpresionContext(_parentctx, _parentState));
						((OrExprContext)_localctx).izquierda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(159);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(160);
						match(T__19);
						setState(161);
						((OrExprContext)_localctx).derecha = expresion(5);
						}
						break;
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(SimpleUMGParser.NUMERO, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(SimpleUMGParser.FLOAT_NUM, 0); }
		public TerminalNode CADENA() { return getToken(SimpleUMGParser.CADENA, 0); }
		public TerminalNode BOOLEANO() { return getToken(SimpleUMGParser.BOOLEANO, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << FLOAT_NUM) | (1L << BOOLEANO) | (1L << CADENA))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SimpleUMGParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SimpleUMGParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleUMGParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(SimpleUMGParser.STRING, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUMGListener ) ((SimpleUMGListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUMGVisitor ) return ((SimpleUMGVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\5\3)\n\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4\61\n\4\r\4\16\4"+
		"\62\3\5\3\5\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6B\n\6\f\6"+
		"\16\6E\13\6\3\7\3\7\3\7\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n_\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fm\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17~\n\17\f\17\16\17\u0081\13"+
		"\17\5\17\u0083\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0091\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a5\n\20\f\20\16"+
		"\20\u00a8\13\20\3\21\3\21\3\22\3\22\3\22\2\3\36\23\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"\2\t\3\2\n\13\3\2\f\r\4\2\n\n\16\16\3\2\17\22\3\2"+
		"\23\24\3\2\27\32\3\2\33\36\u00b3\2$\3\2\2\2\4(\3\2\2\2\6\60\3\2\2\2\b"+
		"\64\3\2\2\2\n>\3\2\2\2\fF\3\2\2\2\16I\3\2\2\2\20S\3\2\2\2\22^\3\2\2\2"+
		"\24`\3\2\2\2\26e\3\2\2\2\30n\3\2\2\2\32t\3\2\2\2\34x\3\2\2\2\36\u0090"+
		"\3\2\2\2 \u00a9\3\2\2\2\"\u00ab\3\2\2\2$%\5\4\3\2%&\7\2\2\3&\3\3\2\2\2"+
		"\')\5\6\4\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\37\2\2+,\5\"\22\2,-\7)"+
		"\2\2-.\5\16\b\2.\5\3\2\2\2/\61\5\b\5\2\60/\3\2\2\2\61\62\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2\2\64\65\7 \2\2\65\66\5\"\22\2\66\67"+
		"\7)\2\2\679\7\3\2\28:\5\n\6\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\4\2\2"+
		"<=\7\5\2\2=\t\3\2\2\2>C\5\f\7\2?@\7\6\2\2@B\5\f\7\2A?\3\2\2\2BE\3\2\2"+
		"\2CA\3\2\2\2CD\3\2\2\2D\13\3\2\2\2EC\3\2\2\2FG\5\"\22\2GH\7)\2\2H\r\3"+
		"\2\2\2IN\7\7\2\2JM\5\20\t\2KM\5\22\n\2LJ\3\2\2\2LK\3\2\2\2MP\3\2\2\2N"+
		"L\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\b\2\2R\17\3\2\2\2ST\5\"\22"+
		"\2TU\7)\2\2UV\7\5\2\2V\21\3\2\2\2W_\5\24\13\2X_\5\26\f\2Y_\5\30\r\2Z_"+
		"\5\32\16\2[\\\5\34\17\2\\]\7\5\2\2]_\3\2\2\2^W\3\2\2\2^X\3\2\2\2^Y\3\2"+
		"\2\2^Z\3\2\2\2^[\3\2\2\2_\23\3\2\2\2`a\7)\2\2ab\7\t\2\2bc\5\36\20\2cd"+
		"\7\5\2\2d\25\3\2\2\2ef\7!\2\2fg\7\3\2\2gh\5\36\20\2hi\7\4\2\2il\5\16\b"+
		"\2jk\7\"\2\2km\5\16\b\2lj\3\2\2\2lm\3\2\2\2m\27\3\2\2\2no\7#\2\2op\7\3"+
		"\2\2pq\5\36\20\2qr\7\4\2\2rs\5\16\b\2s\31\3\2\2\2tu\7$\2\2uv\5\36\20\2"+
		"vw\7\5\2\2w\33\3\2\2\2xy\7)\2\2y\u0082\7\3\2\2z\177\5\36\20\2{|\7\6\2"+
		"\2|~\5\36\20\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082z\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\4\2\2\u0085\35\3\2\2\2\u0086\u0087"+
		"\b\20\1\2\u0087\u0088\t\2\2\2\u0088\u0091\5\36\20\f\u0089\u008a\7\3\2"+
		"\2\u008a\u008b\5\36\20\2\u008b\u008c\7\4\2\2\u008c\u0091\3\2\2\2\u008d"+
		"\u0091\5\34\17\2\u008e\u0091\7)\2\2\u008f\u0091\5 \21\2\u0090\u0086\3"+
		"\2\2\2\u0090\u0089\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u00a6\3\2\2\2\u0092\u0093\f\13\2\2\u0093\u0094\t"+
		"\3\2\2\u0094\u00a5\5\36\20\f\u0095\u0096\f\n\2\2\u0096\u0097\t\4\2\2\u0097"+
		"\u00a5\5\36\20\13\u0098\u0099\f\t\2\2\u0099\u009a\t\5\2\2\u009a\u00a5"+
		"\5\36\20\n\u009b\u009c\f\b\2\2\u009c\u009d\t\6\2\2\u009d\u00a5\5\36\20"+
		"\t\u009e\u009f\f\7\2\2\u009f\u00a0\7\25\2\2\u00a0\u00a5\5\36\20\b\u00a1"+
		"\u00a2\f\6\2\2\u00a2\u00a3\7\26\2\2\u00a3\u00a5\5\36\20\7\u00a4\u0092"+
		"\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4\u0098\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4"+
		"\u009e\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\37\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa"+
		"\t\7\2\2\u00aa!\3\2\2\2\u00ab\u00ac\t\b\2\2\u00ac#\3\2\2\2\17(\629CLN"+
		"^l\177\u0082\u0090\u00a4\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}