package com.lisek.composite;

public class Professor implements Faculty {

    private String name;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDetails() {
        return this.name + " teaches in department " + this.department;
    }
}
