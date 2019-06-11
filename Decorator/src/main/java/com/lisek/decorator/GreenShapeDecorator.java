package com.lisek.decorator;

public class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        greenBorder();
    }

    private void greenBorder() {
        System.out.println("Border color: red");
    }
}
