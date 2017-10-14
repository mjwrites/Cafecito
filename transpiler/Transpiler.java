import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Map;
import java.util.TreeMap;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;

import com.google.googlejavaformat.java.Formatter;

@SuppressWarnings("deprecation")
public class Transpiler {
    private static final String[] ENGLISH = new String[] {
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
	        "next", "push", "pop", "copyOfRange", "addAll", "contains", "get", "indexOf",
	        "isEmpty", "size", "length", "set", "peek", "search"
	    };
    
    public static void main(String[] args) throws Exception {
    	Map<String, String> methodMap = new TreeMap<String, String>();
    	BufferedReader r = new BufferedReader(new FileReader(args[1] + ".txt"));

        for (int i = 1; i < 107; i++) {
        	String line = r.readLine();
        	if (52 < i) {
        		int divInd = line.indexOf('=');
                methodMap.put(line.substring(divInd + 1),
                              line.substring(0, divInd));
        	}
        }
	
        CharStream s = new ANTLRFileStream(args[0] + ".cafe");
        TokenStream t;
        try {
            Class<? extends Lexer> c = Language.languageOfString(args[1]).getLexer();
            t = new CommonTokenStream(c.getConstructor(CharStream.class).newInstance(s));
        } catch (Exception e) {
            throw e;
        }
        StringBuilder output = new StringBuilder();
        
        int i = 1;
        boolean dotSeen = false;
        while (true) {
            int id = t.LA(i);
            if (id < 1) {
                break;
            } else if (dotSeen) {
            	String token = methodMap.get(t.LT(i).getText());
            	if (token != null) {
            		output.append(token);	
            	} else {
            		output.append(t.LT(i).getText());	
            	}
            	dotSeen = false;
            } else if (id < ENGLISH.length - 6 || id == ENGLISH.length - 1) {
                output.append(ENGLISH[id] + " ");
            } else if (id == 65) {
            	dotSeen = true;
            	output.append(t.LT(i).getText() + " ");
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
