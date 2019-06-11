package com.lisek.proxy;

public class Network implements Connection {

    public void connect(String site) {
        System.out.println("Connecting to " + site);
    }
}
