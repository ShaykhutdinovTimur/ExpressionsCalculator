package ru.ifmo.ctddev.shaykhutdinov.ExpressionsCalculator;

import org.antlr.v4.runtime.*;

/**
 * Created by timur on 09.05.16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ANTLRInputStream inputStream = new ANTLRInputStream(System.in);
            ExpressionsCalculatorLexer lexer = new ExpressionsCalculatorLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            ExpressionsCalculatorParser parser = new ExpressionsCalculatorParser(tokenStream);

             parser.prog();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
