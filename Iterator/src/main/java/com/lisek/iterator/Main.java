package com.lisek.iterator;

public class Main {
    public static void main(String[] args) {

        Subject arts = new Arts();
        Subject science = new Science();

        Iterator artsIterator = arts.createIterator();
        Iterator scienceIterator = science.createIterator();

        print(artsIterator);

        print(scienceIterator);
    }

    private static void print(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
