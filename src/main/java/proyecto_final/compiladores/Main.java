
package proyecto_final.compiladores;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = ".gj";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		SimpleUMGLexer lexer = new SimpleUMGLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SimpleUMGParser parser = new SimpleUMGParser(tokens);

		SimpleUMGParser.StartContext tree = parser.start();

		SimpleUMGCustomVisitor visitor = new SimpleUMGCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
