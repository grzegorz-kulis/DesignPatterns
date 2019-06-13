package com.lisek.iterator;

import java.util.ArrayList;
import java.util.List;

public class Science implements Subject {

    private List<String> subjects;

    public Science() {
        this.subjects = new ArrayList<String>();
        subjects.add("Math");
        subjects.add("Chemistry");
        subjects.add("Physics");
    }

    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }
}
