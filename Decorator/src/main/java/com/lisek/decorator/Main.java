package com.lisek.decorator;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();

        Shape redShapeDecorator = new RedShapeDecorator(triangle);
        redShapeDecorator.draw();

        Shape greenShapeDecorator = new GreenShapeDecorator(rectangle);
        greenShapeDecorator.draw();
    }
}
