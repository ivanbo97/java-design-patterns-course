package com.ivanboyukliev.behavioralpatterns.interpreter;

public class Client {
    public InterpreterContext interpreterContext;

    public Client(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public String interpret(String stringToParse) {
        Expression expression;
        if (stringToParse.contains("Hexadecimal")) {
            expression = new IntToHexExpression(Integer.parseInt(stringToParse.substring(0, stringToParse.indexOf(" "))));
            return expression.interpret(interpreterContext);
        }
        if (stringToParse.contains("Binary")) {
            expression = new IntToBinaryExpression(Integer.parseInt(stringToParse.substring(0, stringToParse.indexOf(" "))));
            return expression.interpret(interpreterContext);
        }
        return stringToParse;
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";


        Client ec = new Client(new InterpreterContext());
        System.out.println(str1+"= "+ec.interpret(str1));
        System.out.println(str2+"= "+ec.interpret(str2));
    }
}
