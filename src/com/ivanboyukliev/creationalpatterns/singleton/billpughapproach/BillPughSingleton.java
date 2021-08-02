package com.ivanboyukliev.creationalpatterns.singleton.billpughapproach;

public class BillPughSingleton {

    private BillPughSingleton() {
    }

    int data = 0;
    private static class SingletonHelper {
        private static final BillPughSingleton uniqueInstance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        // Here class loader loads SingletonHelper class, and therefore
        // uniqueInstance is created. Remember: Class is loaded only once,
        // when it is first referenced in source code.
        return SingletonHelper.uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
