package com.ivanboyukliev.creationalpatterns.singleton.lazyevaluation;

public class TestSingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setData(7);

        System.out.println("First Singleton reference output : " + singleton + ", data = " + singleton.getData());

        Singleton singletonTest = Singleton.getInstance();
        System.out.println("Test singleton reference: " + singletonTest);
    }
}
