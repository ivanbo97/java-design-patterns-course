package com.ivanboyukliev.behavioralpatterns.interpreter.courseassignment;

// NonterminalExpression
public class AndExpression implements Expression{
    private Expression firstExp;
    private Expression secondExp;

    public AndExpression(Expression firstExp, Expression secondExp) {
        this.firstExp = firstExp;
        this.secondExp = secondExp;
    }

    @Override
    public boolean interpret(Context context) {
        return firstExp.interpret(context) && secondExp.interpret(context);
    }
}
