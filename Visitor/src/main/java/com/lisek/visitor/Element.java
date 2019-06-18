package com.lisek.visitor;

public interface Element {
    void accept(Visitor visitor);
}
