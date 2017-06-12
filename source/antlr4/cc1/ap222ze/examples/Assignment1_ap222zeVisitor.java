// Generated from Assignment1_ap222ze.g4 by ANTLR 4.5.1
    // Define output package. Replace jlnmsi with your lnu user (e.g. ab222cd)
    package cc1.ap222ze.examples;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Assignment1_ap222zeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Assignment1_ap222zeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Assignment1_ap222zeParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#main_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_class(Assignment1_ap222zeParser.Main_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#main_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_method(Assignment1_ap222zeParser.Main_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(Assignment1_ap222zeParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#class_inner_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_inner_body(Assignment1_ap222zeParser.Class_inner_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#field_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_declaration(Assignment1_ap222zeParser.Field_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Assignment1_ap222zeParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(Assignment1_ap222zeParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#method_inner_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_inner_body(Assignment1_ap222zeParser.Method_inner_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(Assignment1_ap222zeParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(Assignment1_ap222zeParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Assignment1_ap222zeParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Assignment1_ap222zeParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(Assignment1_ap222zeParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignArrayStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArrayStatement(Assignment1_ap222zeParser.AssignArrayStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(Assignment1_ap222zeParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(Assignment1_ap222zeParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(Assignment1_ap222zeParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(Assignment1_ap222zeParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(Assignment1_ap222zeParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(Assignment1_ap222zeParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newCallExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewCallExpression(Assignment1_ap222zeParser.NewCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(Assignment1_ap222zeParser.MinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(Assignment1_ap222zeParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCreateExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreateExpression(Assignment1_ap222zeParser.ArrayCreateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(Assignment1_ap222zeParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpression(Assignment1_ap222zeParser.MethodCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(Assignment1_ap222zeParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(Assignment1_ap222zeParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(Assignment1_ap222zeParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code braquetedExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraquetedExpression(Assignment1_ap222zeParser.BraquetedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringCharAtExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCharAtExpression(Assignment1_ap222zeParser.StringCharAtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(Assignment1_ap222zeParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substractionExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstractionExpression(Assignment1_ap222zeParser.SubstractionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableCallExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableCallExpression(Assignment1_ap222zeParser.VariableCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(Assignment1_ap222zeParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(Assignment1_ap222zeParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpression(Assignment1_ap222zeParser.LessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpression(Assignment1_ap222zeParser.SumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLengthExpression(Assignment1_ap222zeParser.ArrayLengthExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharExpression(Assignment1_ap222zeParser.CharExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLengthExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLengthExpression(Assignment1_ap222zeParser.StringLengthExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraySelectExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySelectExpression(Assignment1_ap222zeParser.ArraySelectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(Assignment1_ap222zeParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionExpression(Assignment1_ap222zeParser.DivisionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#call_a_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_a_method(Assignment1_ap222zeParser.Call_a_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(Assignment1_ap222zeParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(Assignment1_ap222zeParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#cha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCha(Assignment1_ap222zeParser.ChaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(Assignment1_ap222zeParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#type_of_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_of_variable(Assignment1_ap222zeParser.Type_of_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#int_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_type(Assignment1_ap222zeParser.Int_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#int_array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_array_type(Assignment1_ap222zeParser.Int_array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#char_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_type(Assignment1_ap222zeParser.Char_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#boolean_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_type(Assignment1_ap222zeParser.Boolean_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assignment1_ap222zeParser#string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_type(Assignment1_ap222zeParser.String_typeContext ctx);
}