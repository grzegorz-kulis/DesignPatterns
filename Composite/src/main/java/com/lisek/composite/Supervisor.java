package com.lisek.composite;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {

    private String name;
    private String department;

    private List<Faculty> faculties;

    public Supervisor(String name, String department) {
        this.name = name;
        this.department = department;
        faculties = new ArrayList<Faculty>();
    }

    public void add(Faculty faculty) {
        faculties.add(faculty);
    }

    public void remove(Faculty faculty) {
        faculties.remove(faculty);
    }

    public List<Faculty> getFaculty() {
        return this.faculties;
    }

    public String getDetails() {
        return this.name + " is head of " + this.department;
    }
}
