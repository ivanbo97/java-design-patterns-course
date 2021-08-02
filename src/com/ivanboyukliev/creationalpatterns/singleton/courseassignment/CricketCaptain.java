package com.ivanboyukliev.creationalpatterns.singleton.courseassignment;

public class CricketCaptain {

    private CricketCaptain() {
    }

    private static class SingletonHelper {
        private static final CricketCaptain uniqueInstance = new CricketCaptain();
    }

    public static CricketCaptain getInstance() {
        return SingletonHelper.uniqueInstance;
    }
}
