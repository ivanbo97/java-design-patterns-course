package com.ivanboyukliev.structuralpatterns.proxy.courseassignment;

public class LibraryWebSiteConnector implements WebSiteConnector {

    @Override
    public void connect(String url) {
        System.out.println("Connecting to the internet from library to : " + url);
    }
}
