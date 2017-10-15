import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
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
    
    // english keyword translations
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
    
    /**
     * Construct a tree of translatable method calls, then transpile the given files
     * under the specified language.
     * 
     * @param args first element in language choice, remaining arguments are file
     *             names without .cafe extensions
     * @throws Exception if there is an error reading the translation txt
     */
    public static void main(String[] args) throws Exception {
    	Map<String, String> methodMap = new TreeMap<String, String>();
    	ClassLoader.getSystemClassLoader();
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("resources/" + args[0] + ".txt");
    	BufferedReader r = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        @SuppressWarnings("unchecked")
        Class<? extends Lexer> c = (Class<? extends Lexer>) Class.forName(args[0] + "Lexer");
        
    	// get method translations
    	for (int i = 1; i < 107; i++) {
        	String line = r.readLine();
        	if (52 < i) {
        		int divInd = line.indexOf('=');
                methodMap.put(line.substring(divInd + 1),
                              line.substring(0, divInd));
        	}
        }
        r.close();
	
        // transpile every token in the file
        for (int fnum = 1; fnum < args.length; fnum++) {
            CharStream s = new ANTLRFileStream(args[fnum] + ".cafe");
            TokenStream t = new CommonTokenStream(c.getConstructor(CharStream.class).newInstance(s));
            StringBuilder output = new StringBuilder();
            
            int i = 1;
            boolean dotSeen = false;
            while (true) {
                int id = t.LA(i); // get token id number
                
                // end of stream
                if (id < 1) {
                    break;
                    
                // transpile method
                } else if (dotSeen) {
                    String token = methodMap.get(t.LT(i).getText());
                    if (token != null) {
                        output.append(token);   
                    } else {
                        output.append(t.LT(i).getText());   
                    }
                    dotSeen = false;
                    
                // transpile keyword
                } else if (id < ENGLISH.length - 6 || id == ENGLISH.length - 1) {
                    output.append(ENGLISH[id] + " ");
                
                // not a keyword or method token, use original
                } else {
                    if (id == 65) {
                        dotSeen = true;
                    }
                    output.append(t.LT(i).getText() + " ");
                }
                i++;
            }
            
            // format and write transpiled file as java
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[fnum] + ".java"));
            writer.write(new Formatter().formatSource(output.toString()));
            writer.close();
        }
    }
}
