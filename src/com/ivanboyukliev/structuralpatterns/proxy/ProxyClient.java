package com.ivanboyukliev.structuralpatterns.proxy;

public class ProxyClient {
    public static void main(String[] args) {
        Image image = new ProxyImage("someFilename.jpg");

        // image will be loaded from disk

        image.display();
        System.out.println("");
        image.display();
    }
}
