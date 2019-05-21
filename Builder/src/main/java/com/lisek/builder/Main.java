package com.lisek.builder;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.builder().firstname("Name")
                                            .lastname("Surname")
                .age(21)
                .height(180)
                .weight(80)
                .homecity("City")
                .nationality("Country")
                .build();
        System.out.println(person);
    }
}
