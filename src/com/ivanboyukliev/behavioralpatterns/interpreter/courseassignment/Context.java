package com.ivanboyukliev.behavioralpatterns.interpreter.courseassignment;

public class Context {
    private String input;

    public Context(String input) {
        this.input = input;
    }

    public boolean getResult(String data){
        if(input.contains(data)){
            return true;
        }
        return false;
    }
}
