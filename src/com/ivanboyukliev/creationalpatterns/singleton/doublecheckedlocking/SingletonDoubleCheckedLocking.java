package com.ivanboyukliev.creationalpatterns.singleton.doublecheckedlocking;

public class SingletonDoubleCheckedLocking {

    private SingletonDoubleCheckedLocking() {
    }

    // volatile means changes in instance data will be synchronized in all threads
    private volatile static SingletonDoubleCheckedLocking uniqueInstance = null;

    private int data = 0;

    public static SingletonDoubleCheckedLocking getInstance(){
        if(uniqueInstance == null){
            synchronized (SingletonDoubleCheckedLocking.class){
                if (uniqueInstance == null){
                    uniqueInstance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
