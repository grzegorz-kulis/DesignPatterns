package com.lisek.iterator;

public class ArtsIterator implements Iterator {

    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        this.position = 0;
    }

    public void first() {
        this.position = 0;
    }

    public String next() {
        return this.subjects[this.position++];
    }

    public boolean isDone() {
        return this.position >= this.subjects.length;
    }

    public String currentItem() {
        return this.subjects[this.position];
    }
}
