package com.lisek.state;

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void alert() {
        this.state.alert(this);
    }
}
