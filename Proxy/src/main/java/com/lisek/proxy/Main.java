package com.lisek.proxy;

public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        try {
            proxy.connect("gambling");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            proxy.connect("cats");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
