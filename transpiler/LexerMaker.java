import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.antlr.v4.Tool;

public class LexerMaker {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader(args[0] + ".txt"));
        Path path = Paths.get("Java8.g4");
        Charset charset = StandardCharsets.UTF_8;
        String content = new String(Files.readAllBytes(path), charset);
        
        for (int i = 0; i < 51; i++) {
            String line = r.readLine();
            int divInd = line.indexOf('=');
            content = content.replaceAll("'" + line.substring(0, divInd) + "'", 
                                         "'" + line.substring(divInd + 1) + "'");
        }
        content = content.replaceFirst("grammar Java8", "grammar " + args[0]);
        r.close();
        
        Files.write(Paths.get(args[0] + ".g4"), content.getBytes(charset));
        
        Tool.main(new String[] {args[0] + ".g4"});
    }
}
