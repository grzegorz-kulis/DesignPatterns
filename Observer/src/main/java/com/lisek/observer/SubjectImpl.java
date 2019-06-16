package com.lisek.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubjectImpl implements Subject {
    private int runs;
    private int wickets;
    private float overs;

    private List<Observer> observerList;

    public SubjectImpl() {
        this.observerList = new ArrayList<Observer>();
    }

    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("obs is null");
        if (!this.observerList.contains(observer)) {
            this.observerList.add(observer);
        }
    }

    public void unregister(Observer observer) {
        if (observer == null) throw new NullPointerException("obs is null");
        this.observerList.remove(observer);
    }

    public void notifyAllObservers() {
        if (observerList.isEmpty()) {
            System.out.println("NO OBSERVERS!");
            return;
        }
        for (Iterator<Observer> it = this.observerList.iterator(); it.hasNext(); ) {
            Observer o = it.next();
            o.update(this.runs, this.wickets, this.overs);
        }
    }

    private int getLatestRuns() {
        return 21;
    }

    private int getLatestWickets() {
        return 3;
    }

    private float getLaterstOvers() {
        return (float) 21.37;
    }

    public void dataChanged() {
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLaterstOvers();

        notifyAllObservers();
    }
}
