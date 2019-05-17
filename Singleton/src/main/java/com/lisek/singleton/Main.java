package com.lisek.singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.setData(2137);
        System.out.println(singleton);
        System.out.println(singleton.getData());

        singleton = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton.getData());
    }
}
