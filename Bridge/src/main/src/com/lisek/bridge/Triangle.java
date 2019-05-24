package com.lisek.bridge;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    void drawShapes(int border) {
        System.out.print("Drawing triangle ");
        color.fillWithColor(border);
    }

    void modifyBorder(int border, int increment) {
        System.out.println("changing the border width by " + increment);
        border = border + increment;
        drawShapes(border);
    }
}
