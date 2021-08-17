package com.ivanboyukliev.behavioralpatterns.strategy.courseassignment;

public class Client {
    public static void main(String[] args) {
        Context solveTask = new Context();
        MathOperation addOperation = new MultiplicationOperation();
        solveTask.executeOperation(addOperation,3,4);

        solveTask.executeOperation(new MultiplicationOperation(),5,6);
        solveTask.executeOperation(new SubtractionOperation(),8,9);

    }
}
