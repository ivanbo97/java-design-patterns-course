package com.ivanboyukliev.creationalpatterns.singleton.billpughapproach;

public class Client {
    public static void main(String[] args) {
        BillPughSingleton singletonObj1 = BillPughSingleton.getInstance();
        System.out.println("singletonObj1 reference = " + singletonObj1);

        singletonObj1 = null;

        BillPughSingleton singletonObj2 = BillPughSingleton.getInstance();
        System.out.println("singletonObj2 reference = " + singletonObj2);
    }
}
