import org.antlr.v4.runtime.Lexer;

public enum Language {
    SPANISH (spanishLexer.class);
    
    private final Class<? extends Lexer> lex;
    
    Language(Class<? extends Lexer> lex) {
        this.lex = lex;
    }
    
    public Class<? extends Lexer> getLexer() {
        return lex;
    }
    
    public static Language languageOfString(String l) {
        if (l.equals("spanish")) {
            return Language.SPANISH;
        } else {
            return null;
        }
    }
}
