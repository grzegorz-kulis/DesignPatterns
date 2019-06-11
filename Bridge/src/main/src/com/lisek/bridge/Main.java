package com.lisek.bridge;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> test = new HashMap<String, String>();
        test.put("test", "test");

        String qq = test.get("tet");
        System.out.println(qq);

        Shape triangle = new Triangle(new GreenColor());
        triangle.drawShapes(30);
        triangle.modifyBorder(30, 2);

        Shape rectangle = new Rectangle(new RedColor());
        rectangle.drawShapes(10);
        rectangle.modifyBorder(1, 1);
    }
}
