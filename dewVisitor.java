// Generated from dew.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dewParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dewVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dewParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(dewParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link dewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(dewParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dewParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(dewParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dewParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(dewParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dewParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(dewParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link dewParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(dewParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dewParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(dewParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link dewParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(dewParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link dewParser#methodCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallArguments(dewParser.MethodCallArgumentsContext ctx);
}