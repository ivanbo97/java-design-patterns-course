package com.ivanboyukliev.structuralpatterns.proxy.courseassignment;

import java.util.ArrayList;
import java.util.List;

public class ProxyLibraryWebsiteConnector implements WebSiteConnector {

    private WebSiteConnector libraryWebSiteConnector;

    private List<String> bannedWebsites;

    private WebsiteChecker websiteChecker;

    ProxyLibraryWebsiteConnector() {
        bannedWebsites = new ArrayList<>();
        websiteChecker = new WebsiteChecker();
    }

    @Override
    public void connect(String url) throws Exception {
        if (url == null) {
            throw new Exception("You have not provided any url...");
        }

        if (websiteChecker.isSiteBanned(url)) {
            throw new Exception("The website you are trying to connect is banned!!!");
        }
        if (libraryWebSiteConnector == null) {
            libraryWebSiteConnector = new LibraryWebSiteConnector();
        }
        libraryWebSiteConnector.connect(url);
    }

}
