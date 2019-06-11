package com.lisek.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        redBorder();
    }

    private void redBorder() {
        System.out.println("Border color: red");
    }
}
