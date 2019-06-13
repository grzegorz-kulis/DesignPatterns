package com.lisek.iterator;

import java.util.List;

public class ScienceIterator implements Iterator {
    private List<String> subjects;
    private int position;

    public ScienceIterator(List<String> subjects) {
        this.subjects = subjects;
        this.position = 0;
    }

    public void first() {
        this.position = 0;
    }

    public String next() {
        return this.subjects.get(this.position++);
    }

    public boolean isDone() {
        return this.position >= this.subjects.size();
    }

    public String currentItem() {
        return this.subjects.get(this.position);
    }
}

