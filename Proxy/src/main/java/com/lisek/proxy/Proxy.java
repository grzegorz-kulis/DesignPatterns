package com.lisek.proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements Connection {

    private Network network = new Network();

    private static List<String> bannedSites = new ArrayList<>();

    static {
        bannedSites.add("gambling");
        bannedSites.add("malware");
        bannedSites.add("hazard");
    }

    public void connect(String site) throws Exception {
        if (bannedSites.contains(site)) {
            throw new Exception(site + " is not allowed");
        }
        else {
            network.connect(site);
        }

    }
}
