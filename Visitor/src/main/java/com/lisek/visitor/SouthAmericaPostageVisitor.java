package com.lisek.visitor;

public class SouthAmericaPostageVisitor implements Visitor {

    private int totalPostage;

    @Override
    public void visit(Book element) {
        if (element.getPrice() < 30) {
            this.totalPostage += element.getWeight() * 2 * 2;
        }
    }

    @Override
    public void visit(CD element) {
        if (element.getPrice() < 30) {
            this.totalPostage += element.getWeight() * 3 * 2;
        }

    }

    @Override
    public void visit(DVD element) {
        if (element.getPrice() < 30) {
            this.totalPostage += element.getWeight() * 4 * 2;
        }
    }

    public int getTotalPostage() {
        return totalPostage;
    }
}
