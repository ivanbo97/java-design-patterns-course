package com.ivanboyukliev.behavioralpatterns.interpreter.courseassignment;

public class Client {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new OrExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        Context context = new Context("John");
        System.out.println("John is male?" + isMale.interpret(context));

        Context context1 = new Context("Married Julie");
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret(context1));
    }
}
