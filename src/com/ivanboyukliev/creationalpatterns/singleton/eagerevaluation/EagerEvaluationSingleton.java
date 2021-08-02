package com.ivanboyukliev.creationalpatterns.singleton.eagerevaluation;

public class EagerEvaluationSingleton {

    private EagerEvaluationSingleton(){}

    // This is thread safe, because class loader will execute bellow line only once
    // and we can be sure that it will happen before a thread calls getInstance() method.
    // !!!Drawback: A reference will be always created, without taking into consideration whether we need this instance
    // for now or not.
    private static EagerEvaluationSingleton uniqueInstance = new EagerEvaluationSingleton();

    public static EagerEvaluationSingleton getInstance(){
        return uniqueInstance;
    }


}
