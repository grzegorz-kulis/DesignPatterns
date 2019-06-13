package com.lisek.iterator;

public class Arts implements Subject {
    private String[] subjects;

    public Arts() {
        this.subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}
