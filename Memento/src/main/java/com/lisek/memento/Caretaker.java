package com.lisek.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Originator.Memento> originatorList;

    public Caretaker() {
        this.originatorList = new ArrayList<Originator.Memento>();
    }

    public void add(Originator.Memento memento) {
        originatorList.add(memento);
    }

    public Originator.Memento load(int stateNumber) {
        return originatorList.get(stateNumber);
    }

}
