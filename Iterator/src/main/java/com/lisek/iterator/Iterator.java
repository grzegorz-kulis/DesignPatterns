package com.lisek.iterator;

public interface Iterator {
    void first();
    String next();
    boolean isDone();
    String currentItem();
}
