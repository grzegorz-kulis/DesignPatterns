package com.lisek.visitor;

public class USPostageVisitor implements Visitor {

    private int totalPostage = 0;

    @Override
    public void visit(Book element) {
        if (element.getPrice() < 20) {
            this.totalPostage += element.getWeight() * 2;
        }
    }

    @Override
    public void visit(CD element) {
        if (element.getPrice() < 20) {
            this.totalPostage += element.getWeight() * 3;
        }
    }

    @Override
    public void visit(DVD element) {
        if (element.getPrice() < 20) {
            this.totalPostage += element.getWeight() * 4;
        }
    }

    public int getTotalPostage() {
        return totalPostage;
    }
}
