package com.lisek.memento;

public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(this.state);
    }

    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }

    @Override
    public String toString() {
        return this.state;
    }

    public class Memento {

        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return this.state;
        }
    }
}
