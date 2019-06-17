package com.lisek.state;

public class Main {
    public static void main(String[] args) {
        Context phone = new Context(new Vibration());

        phone.alert();

        phone.alert();
    }
}
