package ru.ifmo.ctddev.shaykhutdinov.ExpressionsCalculator;

import org.antlr.v4.runtime.*;

/**
 * Created by timur on 09.05.16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ANTLRInputStream inputStream = new ANTLRInputStream(System.in);
            ArithmeticExpressionsLexer lexer = new ArithmeticExpressionsLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            ArithmeticExpressionsParser parser = new ArithmeticExpressionsParser(tokenStream);

             parser.prog();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
