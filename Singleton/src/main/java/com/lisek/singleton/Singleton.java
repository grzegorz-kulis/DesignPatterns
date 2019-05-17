package com.lisek.singleton;

public class Singleton {

    private Singleton() {}

    private int data;

    private static class SingletonHelper {

        private static final Singleton singletonInstance = new Singleton();

        private static Singleton getInstance() {
            return singletonInstance;
        }
    }

    public static Singleton getInstance() {
        return SingletonHelper.getInstance();
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
}
