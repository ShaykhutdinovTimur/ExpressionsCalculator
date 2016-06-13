// Generated from /home/timur/mt/ExpressionsCalculator/src/ru/ifmo/ctddev/shaykhutdinov/ExpressionsCalculator/ArithmeticExpressions.g4 by ANTLR 4.5.1
package ru.ifmo.ctddev.shaykhutdinov.ExpressionsCalculator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticExpressionsParser}.
 */
public interface ArithmeticExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ArithmeticExpressionsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ArithmeticExpressionsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ArithmeticExpressionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ArithmeticExpressionsParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ArithmeticExpressionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ArithmeticExpressionsParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionOnly}
	 * labeled alternative in {@link ArithmeticExpressionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOnly(ArithmeticExpressionsParser.ExpressionOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionOnly}
	 * labeled alternative in {@link ArithmeticExpressionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOnly(ArithmeticExpressionsParser.ExpressionOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionOrSubtract}
	 * labeled alternative in {@link ArithmeticExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionOrSubtract(ArithmeticExpressionsParser.AdditionOrSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionOrSubtract}
	 * labeled alternative in {@link ArithmeticExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionOrSubtract(ArithmeticExpressionsParser.AdditionOrSubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionOrSubtractTerm}
	 * labeled alternative in {@link ArithmeticExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionOrSubtractTerm(ArithmeticExpressionsParser.AdditionOrSubtractTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionOrSubtractTerm}
	 * labeled alternative in {@link ArithmeticExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionOrSubtractTerm(ArithmeticExpressionsParser.AdditionOrSubtractTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationOrDivision}
	 * labeled alternative in {@link ArithmeticExpressionsParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationOrDivision(ArithmeticExpressionsParser.MultiplicationOrDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationOrDivision}
	 * labeled alternative in {@link ArithmeticExpressionsParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationOrDivision(ArithmeticExpressionsParser.MultiplicationOrDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationOrDivisionDeg}
	 * labeled alternative in {@link ArithmeticExpressionsParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationOrDivisionDeg(ArithmeticExpressionsParser.MultiplicationOrDivisionDegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationOrDivisionDeg}
	 * labeled alternative in {@link ArithmeticExpressionsParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationOrDivisionDeg(ArithmeticExpressionsParser.MultiplicationOrDivisionDegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorDeg}
	 * labeled alternative in {@link ArithmeticExpressionsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorDeg(ArithmeticExpressionsParser.FactorDegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorDeg}
	 * labeled alternative in {@link ArithmeticExpressionsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorDeg(ArithmeticExpressionsParser.FactorDegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleFactor}
	 * labeled alternative in {@link ArithmeticExpressionsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFactor(ArithmeticExpressionsParser.SimpleFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleFactor}
	 * labeled alternative in {@link ArithmeticExpressionsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFactor(ArithmeticExpressionsParser.SimpleFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ArithmeticExpressionsParser#deg}.
	 * @param ctx the parse tree
	 */
	void enterInt(ArithmeticExpressionsParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ArithmeticExpressionsParser#deg}.
	 * @param ctx the parse tree
	 */
	void exitInt(ArithmeticExpressionsParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ArithmeticExpressionsParser#deg}.
	 * @param ctx the parse tree
	 */
	void enterVar(ArithmeticExpressionsParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ArithmeticExpressionsParser#deg}.
	 * @param ctx the parse tree
	 */
	void exitVar(ArithmeticExpressionsParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ArithmeticExpressionsParser#deg}.
	 * @param ctx the parse tree
	 */
	void enterParens(ArithmeticExpressionsParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ArithmeticExpressionsParser#deg}.
	 * @param ctx the parse tree
	 */
	void exitParens(ArithmeticExpressionsParser.ParensContext ctx);
}