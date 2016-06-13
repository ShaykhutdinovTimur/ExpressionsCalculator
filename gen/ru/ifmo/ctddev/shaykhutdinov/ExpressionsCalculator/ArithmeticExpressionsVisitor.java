// Generated from /home/timur/mt/ExpressionsCalculator/src/ru/ifmo/ctddev/shaykhutdinov/ExpressionsCalculator/ArithmeticExpressions.g4 by ANTLR 4.5.1
package ru.ifmo.ctddev.shaykhutdinov.ExpressionsCalculator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithmeticExpressionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithmeticExpressionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ArithmeticExpressionsParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ArithmeticExpressionsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ArithmeticExpressionsParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionOnly}
	 * labeled alternative in {@link ArithmeticExpressionsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOnly(ArithmeticExpressionsParser.ExpressionOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionOrSubtract}
	 * labeled alternative in {@link ArithmeticExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionOrSubtract(ArithmeticExpressionsParser.AdditionOrSubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionOrSubtractTerm}
	 * labeled alternative in {@link ArithmeticExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionOrSubtractTerm(ArithmeticExpressionsParser.AdditionOrSubtractTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationOrDivision}
	 * labeled alternative in {@link ArithmeticExpressionsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationOrDivision(ArithmeticExpressionsParser.MultiplicationOrDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationOrDivisionDeg}
	 * labeled alternative in {@link ArithmeticExpressionsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationOrDivisionDeg(ArithmeticExpressionsParser.MultiplicationOrDivisionDegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorDeg}
	 * labeled alternative in {@link ArithmeticExpressionsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorDeg(ArithmeticExpressionsParser.FactorDegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleFactor}
	 * labeled alternative in {@link ArithmeticExpressionsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFactor(ArithmeticExpressionsParser.SimpleFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ArithmeticExpressionsParser#deg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ArithmeticExpressionsParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ArithmeticExpressionsParser#deg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ArithmeticExpressionsParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ArithmeticExpressionsParser#deg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(ArithmeticExpressionsParser.ParensContext ctx);
}