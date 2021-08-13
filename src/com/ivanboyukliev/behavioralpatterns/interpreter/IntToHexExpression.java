package com.ivanboyukliev.behavioralpatterns.interpreter;

public class IntToHexExpression implements Expression {
    private int num;

    public IntToHexExpression(int num) {
        this.num = num;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexadecimalFromat(num);
    }
}
