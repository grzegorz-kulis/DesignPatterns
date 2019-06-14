package com.lisek.memento;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator("State #1");

        caretaker.add(originator.saveStateToMemento());
        System.out.println(originator.toString());
        originator.setState("State #2");
        System.out.println(originator.toString());
        originator.setState(caretaker.load(0).getState());
        System.out.println(originator.toString());
        originator.setState("State #3");
        System.out.println(originator.toString());
        caretaker.add(originator.saveStateToMemento());
        originator.setState("State #4");
        caretaker.add(originator.saveStateToMemento());
        System.out.println(originator.toString());
        originator.setState(caretaker.load(0).getState());
        System.out.println(originator.toString());


    }
}
