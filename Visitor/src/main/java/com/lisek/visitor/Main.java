package com.lisek.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Element> items = new ArrayList<>();

    public static void main(String[] args) {
        Element book = new Book(1, 1);
        Element cd = new CD(2,2);
        Element dvd = new DVD(3,3);

        items.add(book);
        items.add(cd);
        items.add(dvd);

        Visitor us = new USPostageVisitor();
        int usPostage = calculatePostage(us);
        System.out.println("us total: " + usPostage);

        Visitor sa = new SouthAmericaPostageVisitor();
        int saPostage = calculatePostage(sa);
        System.out.println("south america total: " + saPostage);

    }

    private static int calculatePostage(Visitor visitor) {
        for (Element item : items) {
            item.accept(visitor);
        }
        return visitor.getTotalPostage();
    }
}
