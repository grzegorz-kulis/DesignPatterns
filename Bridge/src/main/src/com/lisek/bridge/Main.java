package com.lisek.bridge;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new GreenColor());
        triangle.drawShapes(30);
        triangle.modifyBorder(30, 2);

        Shape rectangle = new Rectangle(new RedColor());
        rectangle.drawShapes(10);
        rectangle.modifyBorder(1, 1);
    }
}
