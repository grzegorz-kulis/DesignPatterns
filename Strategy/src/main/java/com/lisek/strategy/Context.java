package com.lisek.strategy;

public class Context {


    public int executeStrategy(Strategy strategy, int a, int b) {
        return strategy.performOperation(a, b);
    }
}
