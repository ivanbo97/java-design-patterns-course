package com.ivanboyukliev.structuralpatterns.decorator.iodecoratorexample;

import java.io.*;

public class DecoratorClient {
    public static void main(String[] args) {
        int c;
        StringBuffer stringBuffer = new StringBuffer("DUMMY TEXT ASFASFASFAS");
        byte[] bufferContent = stringBuffer.toString().getBytes();
        try {
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bufferContent));
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
