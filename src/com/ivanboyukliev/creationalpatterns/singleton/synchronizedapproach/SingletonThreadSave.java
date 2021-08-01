package com.ivanboyukliev.creationalpatterns.singleton.synchronizedapproach;


public class SingletonThreadSave {

    private SingletonThreadSave() {
    }


    private static SingletonThreadSave uniqueThreadSaveInstance = null;

    private int data = 0;

    // Only one thread can execute getInstance() at a time. !!! Actually we
    // need getInstance() to be synchronized only when uniqueInstance is null
    // after that we do not need synchronization - that is way it is overhead
    // and could cause performance issues.

    public static synchronized SingletonThreadSave getInstance(){
        if(uniqueThreadSaveInstance == null){
            uniqueThreadSaveInstance = new SingletonThreadSave();
        }
        return uniqueThreadSaveInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
