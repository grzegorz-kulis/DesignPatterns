package com.lisek.strategy;

public class Substraction implements Strategy {

    @Override
    public int performOperation(int a, int b) {
        return a - b;
    }
}
