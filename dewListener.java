// Generated from dew.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dewParser}.
 */
public interface dewListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dewParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(dewParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dewParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(dewParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(dewParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(dewParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dewParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(dewParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dewParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(dewParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dewParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(dewParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dewParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(dewParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dewParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(dewParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dewParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(dewParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link dewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(dewParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(dewParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dewParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(dewParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link dewParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(dewParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link dewParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(dewParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dewParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(dewParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link dewParser#methodCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallArguments(dewParser.MethodCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dewParser#methodCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallArguments(dewParser.MethodCallArgumentsContext ctx);
}