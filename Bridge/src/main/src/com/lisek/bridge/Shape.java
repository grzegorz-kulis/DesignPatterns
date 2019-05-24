package com.lisek.bridge;

public abstract class Shape {

    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract void drawShapes(int border);

    abstract void modifyBorder(int border, int increment);
}
