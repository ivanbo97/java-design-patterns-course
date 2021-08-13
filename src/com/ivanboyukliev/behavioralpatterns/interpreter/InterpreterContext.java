package com.ivanboyukliev.behavioralpatterns.interpreter;

// Context
public class InterpreterContext {
    public String getBinaryFormat(int number) {
        return Integer.toBinaryString(number);
    }

    public String getHexadecimalFromat(int number) {
        return Integer.toHexString(number);
    }

}
