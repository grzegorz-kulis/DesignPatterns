package com.lisek.strategy;

public class Addition implements Strategy {

    @Override
    public int performOperation(int a, int b) {
        return a + b;
    }
}
