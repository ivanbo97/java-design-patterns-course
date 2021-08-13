package com.ivanboyukliev.behavioralpatterns.interpreter;

// TerminalExpression

public class IntToBinaryExpression implements Expression {
    private int num;

    public IntToBinaryExpression(int num) {
        this.num = num;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(num);
    }
}
