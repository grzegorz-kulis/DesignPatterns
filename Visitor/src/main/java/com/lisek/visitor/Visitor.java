package com.lisek.visitor;

public interface Visitor {
    void visit(Book element);
    void visit(CD element);
    void visit(DVD element);
    int getTotalPostage();
}
