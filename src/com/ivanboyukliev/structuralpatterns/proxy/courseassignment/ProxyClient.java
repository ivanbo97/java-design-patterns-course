package com.ivanboyukliev.structuralpatterns.proxy.courseassignment;

public class ProxyClient {
    public static void main(String[] args) {
        WebSiteConnector webSiteConnector = new ProxyLibraryWebsiteConnector();
        try {
            webSiteConnector.connect("wiki.org");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
