import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import cc1.ap222ze.examples.Assignment1_ap222zeLexer;
import cc1.ap222ze.examples.Assignment1_ap222zeParser;
import codeGeneration.CodeGenerationVisitor;
import misc.FileUtils;
import symbolTable.SymbolTable;
import symbolTable.TypeCheckVisitor;

/*
 * Helper class that execute the type analysis and
* the file to compile is passed as args[]
 */

public class CodeGenerationMain {

	static String fullFileName = ""; // ex. Main.java
	static String fileName = ""; // ex. Main
	static boolean error = false;

	public static void main(String[] args) {

		// presentation
		System.out.println("\n*** CC1 - PA3 - ap222ze ***");
		System.out.println(
				"\nThe following program does: \n\t ->Syntax Tree build \n\t ->Symbol Table construction \n\t ->Type checking \n\t ->Code Generation ");

		// get file name
		try {
			fullFileName = args[0];
		} catch (Exception e) {
			System.out.println("\nIntroduce the file name as args[0]");
			System.exit(0);
		}

		// test .java file
		if (!validJavaFile(fullFileName)) {
			System.out.println("\nOnly generate .java files valid");
			System.exit(0);
		}

		fileName = fullFileName.substring(0, fullFileName.indexOf("."));
		
		System.out.println("\nProcessing file: " + fullFileName);
		
		Path filePath = Paths.get(fullFileName);
		codeGeneration(filePath);

		if (error)
			System.err.println("ERROR ON FILE");
		
		System.exit(0);
	}

	private static void codeGeneration(Path filePath) {
		String filePathString = filePath.toString();

		// Parse input program
		Assignment1_ap222zeLexer lexer = null;
		try {
			lexer = new Assignment1_ap222zeLexer(new ANTLRFileStream(filePathString));
		} catch (IOException e) {
			System.out.println("File '"+filePath.getFileName()+"' not found");
			return;
		}
		Assignment1_ap222zeParser parser = new Assignment1_ap222zeParser(new BufferedTokenStream(lexer));
		Assignment1_ap222zeParser.ProgContext tree = parser.prog();

		SymbolTable symbolTable = new SymbolTable();

		// symbol table construction
		ParseTreeWalker walker = new ParseTreeWalker();
		SymbolListener symbolListener = new SymbolListener(symbolTable);
		walker.walk(symbolListener, tree);

		// print the symbol table
		symbolTable.printTable();

		// type checking visitor
		TypeCheckVisitor typeCheckerVisitor = new TypeCheckVisitor();
		symbolTable.resetTable();
		typeCheckerVisitor.setSymbolTable(symbolTable);
		typeCheckerVisitor.visit(tree);
		
		// code generation + hdd storing
		symbolTable.resetTable();
		System.out.println("\nGenerated code");
		System.out.println("==============");
		CodeGenerationVisitor codeGenerationVisitor = new CodeGenerationVisitor(symbolTable);
		codeGenerationVisitor.visit(tree);		
		// store the generated code to disk
		codeGenerationVisitor.getClassfile().print();
		FileUtils.objectToFile(codeGenerationVisitor.getClassfile(), fileName+".tjc");
	}
	
	private static boolean validJavaFile(String fileName) {
		return fileName.toLowerCase().endsWith(".java");
	}

}
