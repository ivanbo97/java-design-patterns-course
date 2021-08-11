package com.ivanboyukliev.structuralpatterns.proxy.courseassignment;

import java.util.ArrayList;
import java.util.List;

public class WebsitesManager {
    private List<String> bannedWebsites;

    public WebsitesManager() {
        bannedWebsites = new ArrayList<>();
        banSitesByDefault();
    }

    private void banSitesByDefault() {
        bannedWebsites.add("wiki.org");
        bannedWebsites.add("youtube.com");
        bannedWebsites.add("bitcoin.com");
    }

    public List<String> getBannedWebsites() {
        return bannedWebsites;
    }
}
