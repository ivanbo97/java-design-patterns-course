package com.ivanboyukliev.behavioralpatterns.interpreter;

// AbstractExpression
public interface Expression {
    String interpret(InterpreterContext interpreterContext);
}
