package ru.ifmo.ctddev.shaykhutdinov.ExpressionsCalculator;

/**
 * Created by timur on 14.05.16.
 */

import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

public class EvaluativeVisitor extends ArithmeticExpressionsBaseVisitor<Integer> {
    private final Map<String, Integer> memory = new HashMap<String, Integer>();

    /**
     * VAR '=' expr NEWLINE
     */
    @Override
    public Integer visitAssign(ArithmeticExpressionsParser.AssignContext ctx) {
        String var = ctx.VAR().getText();
        int value = visit(ctx.expr());
        memory.put(var, value);
        System.out.println("" + var + " = " + value);
        return value;
    }

    /**
     * INT
     */
    @Override
    public Integer visitInt(ArithmeticExpressionsParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /**
     * VAR
     */
    @Override
    public Integer visitVar(ArithmeticExpressionsParser.VarContext ctx) {
        String var = ctx.VAR().getText();
        return (memory.containsKey(var) ? memory.get(var) : 0) * (ctx.SUB() != null ? -1 : 1);
    }

    /**
     * term op=('*'|'/') factor
     */
    @Override
    public Integer visitMultiplicationOrDivision(@NotNull ArithmeticExpressionsParser.MultiplicationOrDivisionContext ctx) {
        int left = visit(ctx.term());
        int right = visit(ctx.factor());
        return ctx.op.getType() == ArithmeticExpressionsParser.MUL ? left * right : left / right;
    }

    /**
     * expr op=('+'|'-') term
     */
    @Override
    public Integer visitAdditionOrSubtract(ArithmeticExpressionsParser.AdditionOrSubtractContext ctx) {
        int left = visit(ctx.expr());
        int right = visit(ctx.term());
        return ctx.op.getType() == ArithmeticExpressionsParser.ADD ? left + right : left - right;
    }

    /**
     * '(' expr ')'
     */
    @Override
    public Integer visitParens(ArithmeticExpressionsParser.ParensContext ctx) {
        return visit(ctx.expr()) * (ctx.SUB() != null ? -1 : 1);
    }

    /**
     * term
     */
    @Override
    public Integer visitAdditionOrSubtractTerm(@NotNull ArithmeticExpressionsParser.AdditionOrSubtractTermContext ctx) {
        return visit(ctx.term());
    }

    /**
     * deg
     */
    @Override
    public Integer visitMultiplicationOrDivisionDeg(@NotNull ArithmeticExpressionsParser.MultiplicationOrDivisionDegContext ctx) {
        return visit(ctx.factor());
    }

    /**
     * expr
     */
    @Override
    public Integer visitExpressionOnly(@NotNull ArithmeticExpressionsParser.ExpressionOnlyContext ctx) {
        int result = visit(ctx.expr());
        System.out.println(result);
        return result;
    }

    /**
     * degree
     */
    @Override
    public Integer visitFactorDeg(@NotNull ArithmeticExpressionsParser.FactorDegContext ctx) {
        int base = visit(ctx.deg());
        int deg = visit(ctx.factor());
        return (int) Math.pow(base, deg);
    }

    /**
     * simple factor
     */
    @Override
    public Integer visitSimpleFactor(@NotNull ArithmeticExpressionsParser.SimpleFactorContext ctx) {
        return visit(ctx.deg());
    }

}
