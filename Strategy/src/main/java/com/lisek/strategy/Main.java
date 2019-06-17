package com.lisek.strategy;

public class Main {
    public static void main(String[] args) {

        Context context = new Context();
        int result = context.executeStrategy(new Addition(), 1, 2);
        System.out.println("The result is: " + result);

        result = context.executeStrategy(new Multiplication(), 2, 3);
        System.out.println("The result is: " + result);

    }
}
