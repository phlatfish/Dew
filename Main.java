import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("input.txt");
        dewLexer lexer = new dewLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        dewParser parser = new dewParser(tokens);
        ParseTree tree = parser.program();
        dewCustomVisitor visitor = new dewCustomVisitor();
        visitor.visit(tree);
    }
}
