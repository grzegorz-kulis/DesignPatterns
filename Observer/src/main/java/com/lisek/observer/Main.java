package com.lisek.observer;

public class Main {
    public static void main(String[] args) {

        Observer obs1 = new ObserverAvgScore();
        Observer obs2 = new ObserverCurrentScore();

        SubjectImpl subject = new SubjectImpl();

        subject.register(obs1);
        subject.register(obs2);

        subject.dataChanged();

        subject.unregister(obs1);

        subject.dataChanged();

        subject.unregister(obs2);

        subject.dataChanged();
    }
}
