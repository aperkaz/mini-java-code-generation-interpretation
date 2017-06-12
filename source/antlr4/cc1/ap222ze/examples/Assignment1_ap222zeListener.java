// Generated from Assignment1_ap222ze.g4 by ANTLR 4.5.1
    // Define output package. Replace jlnmsi with your lnu user (e.g. ab222cd)
    package cc1.ap222ze.examples;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Assignment1_ap222zeParser}.
 */
public interface Assignment1_ap222zeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Assignment1_ap222zeParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Assignment1_ap222zeParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#main_class}.
	 * @param ctx the parse tree
	 */
	void enterMain_class(Assignment1_ap222zeParser.Main_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#main_class}.
	 * @param ctx the parse tree
	 */
	void exitMain_class(Assignment1_ap222zeParser.Main_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#main_method}.
	 * @param ctx the parse tree
	 */
	void enterMain_method(Assignment1_ap222zeParser.Main_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#main_method}.
	 * @param ctx the parse tree
	 */
	void exitMain_method(Assignment1_ap222zeParser.Main_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(Assignment1_ap222zeParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(Assignment1_ap222zeParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#class_inner_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_inner_body(Assignment1_ap222zeParser.Class_inner_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#class_inner_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_inner_body(Assignment1_ap222zeParser.Class_inner_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void enterField_declaration(Assignment1_ap222zeParser.Field_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void exitField_declaration(Assignment1_ap222zeParser.Field_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Assignment1_ap222zeParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Assignment1_ap222zeParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(Assignment1_ap222zeParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(Assignment1_ap222zeParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#method_inner_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_inner_body(Assignment1_ap222zeParser.Method_inner_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#method_inner_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_inner_body(Assignment1_ap222zeParser.Method_inner_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(Assignment1_ap222zeParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(Assignment1_ap222zeParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(Assignment1_ap222zeParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(Assignment1_ap222zeParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(Assignment1_ap222zeParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(Assignment1_ap222zeParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Assignment1_ap222zeParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Assignment1_ap222zeParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(Assignment1_ap222zeParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(Assignment1_ap222zeParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignArrayStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignArrayStatement(Assignment1_ap222zeParser.AssignArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignArrayStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignArrayStatement(Assignment1_ap222zeParser.AssignArrayStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(Assignment1_ap222zeParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(Assignment1_ap222zeParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(Assignment1_ap222zeParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link Assignment1_ap222zeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(Assignment1_ap222zeParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(Assignment1_ap222zeParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(Assignment1_ap222zeParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(Assignment1_ap222zeParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(Assignment1_ap222zeParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(Assignment1_ap222zeParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(Assignment1_ap222zeParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Assignment1_ap222zeParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Assignment1_ap222zeParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newCallExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewCallExpression(Assignment1_ap222zeParser.NewCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newCallExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewCallExpression(Assignment1_ap222zeParser.NewCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(Assignment1_ap222zeParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(Assignment1_ap222zeParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(Assignment1_ap222zeParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(Assignment1_ap222zeParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayCreateExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreateExpression(Assignment1_ap222zeParser.ArrayCreateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayCreateExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreateExpression(Assignment1_ap222zeParser.ArrayCreateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(Assignment1_ap222zeParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(Assignment1_ap222zeParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(Assignment1_ap222zeParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(Assignment1_ap222zeParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(Assignment1_ap222zeParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(Assignment1_ap222zeParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpression(Assignment1_ap222zeParser.MultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpression(Assignment1_ap222zeParser.MultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(Assignment1_ap222zeParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(Assignment1_ap222zeParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braquetedExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBraquetedExpression(Assignment1_ap222zeParser.BraquetedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braquetedExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBraquetedExpression(Assignment1_ap222zeParser.BraquetedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringCharAtExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringCharAtExpression(Assignment1_ap222zeParser.StringCharAtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringCharAtExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringCharAtExpression(Assignment1_ap222zeParser.StringCharAtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(Assignment1_ap222zeParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(Assignment1_ap222zeParser.IntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substractionExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubstractionExpression(Assignment1_ap222zeParser.SubstractionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substractionExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubstractionExpression(Assignment1_ap222zeParser.SubstractionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableCallExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableCallExpression(Assignment1_ap222zeParser.VariableCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableCallExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableCallExpression(Assignment1_ap222zeParser.VariableCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(Assignment1_ap222zeParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(Assignment1_ap222zeParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(Assignment1_ap222zeParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(Assignment1_ap222zeParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(Assignment1_ap222zeParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(Assignment1_ap222zeParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSumExpression(Assignment1_ap222zeParser.SumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSumExpression(Assignment1_ap222zeParser.SumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthExpression(Assignment1_ap222zeParser.ArrayLengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthExpression(Assignment1_ap222zeParser.ArrayLengthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCharExpression(Assignment1_ap222zeParser.CharExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCharExpression(Assignment1_ap222zeParser.CharExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLengthExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLengthExpression(Assignment1_ap222zeParser.StringLengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLengthExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLengthExpression(Assignment1_ap222zeParser.StringLengthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraySelectExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArraySelectExpression(Assignment1_ap222zeParser.ArraySelectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraySelectExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArraySelectExpression(Assignment1_ap222zeParser.ArraySelectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(Assignment1_ap222zeParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(Assignment1_ap222zeParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpression(Assignment1_ap222zeParser.DivisionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionExpression}
	 * labeled alternative in {@link Assignment1_ap222zeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpression(Assignment1_ap222zeParser.DivisionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#call_a_method}.
	 * @param ctx the parse tree
	 */
	void enterCall_a_method(Assignment1_ap222zeParser.Call_a_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#call_a_method}.
	 * @param ctx the parse tree
	 */
	void exitCall_a_method(Assignment1_ap222zeParser.Call_a_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(Assignment1_ap222zeParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(Assignment1_ap222zeParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(Assignment1_ap222zeParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(Assignment1_ap222zeParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#cha}.
	 * @param ctx the parse tree
	 */
	void enterCha(Assignment1_ap222zeParser.ChaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#cha}.
	 * @param ctx the parse tree
	 */
	void exitCha(Assignment1_ap222zeParser.ChaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(Assignment1_ap222zeParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(Assignment1_ap222zeParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#type_of_variable}.
	 * @param ctx the parse tree
	 */
	void enterType_of_variable(Assignment1_ap222zeParser.Type_of_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#type_of_variable}.
	 * @param ctx the parse tree
	 */
	void exitType_of_variable(Assignment1_ap222zeParser.Type_of_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#int_type}.
	 * @param ctx the parse tree
	 */
	void enterInt_type(Assignment1_ap222zeParser.Int_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#int_type}.
	 * @param ctx the parse tree
	 */
	void exitInt_type(Assignment1_ap222zeParser.Int_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#int_array_type}.
	 * @param ctx the parse tree
	 */
	void enterInt_array_type(Assignment1_ap222zeParser.Int_array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#int_array_type}.
	 * @param ctx the parse tree
	 */
	void exitInt_array_type(Assignment1_ap222zeParser.Int_array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#char_type}.
	 * @param ctx the parse tree
	 */
	void enterChar_type(Assignment1_ap222zeParser.Char_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#char_type}.
	 * @param ctx the parse tree
	 */
	void exitChar_type(Assignment1_ap222zeParser.Char_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_type(Assignment1_ap222zeParser.Boolean_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_type(Assignment1_ap222zeParser.Boolean_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assignment1_ap222zeParser#string_type}.
	 * @param ctx the parse tree
	 */
	void enterString_type(Assignment1_ap222zeParser.String_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment1_ap222zeParser#string_type}.
	 * @param ctx the parse tree
	 */
	void exitString_type(Assignment1_ap222zeParser.String_typeContext ctx);
}