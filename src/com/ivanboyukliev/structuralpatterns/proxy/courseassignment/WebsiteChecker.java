package com.ivanboyukliev.structuralpatterns.proxy.courseassignment;

import java.util.List;

public class WebsiteChecker {

    WebsitesManager websitesManager;

    public WebsiteChecker() {
        websitesManager = new WebsitesManager();
    }

    public boolean isSiteBanned(String url) {
        List<String> currentlyBannedSites = websitesManager.getBannedWebsites();
        for (String website : currentlyBannedSites) {
            if (website.equals(url)) {
                return true;
            }
        }
        return false;
    }
}
