import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;

@SuppressWarnings("deprecation")
public class Translator {
    private static final String[] ENGLISH = {
            null, "abstract", "assert", "boolean", "break", "byte", "case", 
            "catch", "char", "class", "const", "continue", "default", 
            "do", "double", "else", "enum", "extends", "final", "finally", 
            "float", "for", "if", "goto", "implements", "import", "instanceof", 
            "int", "interface", "long", "native", "new", "package", "private", 
            "protected", "public", "return", "short", "static", "strictfp", 
            "super", "switch", "synchronized", "this", "throw", "throws", 
            "transient", "try", "void", "volatile", "while", null, null, 
            null, null, null, "null"
        };

    private static final String[] ENGLISH_METHODS = {
        null, "clone", "equals", "finalize", "getClass", "hashCode", "notify",
        "notifyAll", "toString", "wait", "new", "arraycopy", "exit", 
        "setErr", "setIn", "setOut", "append", "checkError", "clearError",
        "close", "flush", "format", "print", "println", "write", "add", "remove",
        "next", "push", "pop", "copyOfrange", "addAll", "contains", "get", "indexOf",
        "isEmpty", "size", "length", "set", "peek", "search"
    };


    
    public static void main(String[] args) throws IOException, FormatterException {
        CharStream s = new ANTLRFileStream(args[0] + ".cafe");
        TokenStream t = new CommonTokenStream(new Java8Lexer(s));
        StringBuilder output = new StringBuilder();
        int i = 1;
        while (true) {
            int id = t.LA(i);
            if (id < 1) {
                break;
            } else if (id < ENGLISH.length) {
                output.append(ENGLISH[t.LA(i)] + " ");
            } else {
                output.append(t.LT(i).getText() + " ");
            }
            i++;
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[0] + ".java"));
        writer.write(new Formatter().formatSource(output.toString()));
        writer.close();

        
    }
}