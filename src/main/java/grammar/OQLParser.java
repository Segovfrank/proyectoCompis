// Generated from /home/frank/IdeaProjects/proyecto_compiladores/src/main/java/grammar/OQL.g4 by ANTLR 4.7.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, SELECT=5, ID=6, INT=7, NEWLINE=8, WS=9;
	public static final int
		RULE_a = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"a"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'/'", null, null, "'select'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MUL", "DIV", "ADD", "SUB", "SELECT", "ID", "INT", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "OQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AContext extends ParserRuleContext {
		public List<TerminalNode> MUL() { return getTokens(OQLParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(OQLParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(OQLParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(OQLParser.DIV, i);
		}
		public List<TerminalNode> ADD() { return getTokens(OQLParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(OQLParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(OQLParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(OQLParser.SUB, i);
		}
		public List<TerminalNode> ID() { return getTokens(OQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OQLParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(OQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(OQLParser.INT, i);
		}
		public List<TerminalNode> SELECT() { return getTokens(OQLParser.SELECT); }
		public TerminalNode SELECT(int i) {
			return getToken(OQLParser.SELECT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(OQLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(OQLParser.NEWLINE, i);
		}
		public List<TerminalNode> WS() { return getTokens(OQLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(OQLParser.WS, i);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OQLListener ) ((OQLListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OQLListener ) ((OQLListener)listener).exitA(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_a);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << SELECT) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << SELECT) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(7);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\13\4\2\t\2\3\2"+
		"\7\2\6\n\2\f\2\16\2\t\13\2\3\2\2\2\3\2\2\3\3\2\3\13\2\n\2\7\3\2\2\2\4"+
		"\6\t\2\2\2\5\4\3\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2"+
		"\t\7\3\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}