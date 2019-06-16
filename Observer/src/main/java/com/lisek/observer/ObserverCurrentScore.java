package com.lisek.observer;

public class ObserverCurrentScore implements Observer {

    private int runs;
    private int wickets;
    private float overs;

    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }


    private void display() {
        System.out.println("avg score run rate: " + this.runs + ", wickets: " + this.wickets + ", overs: " + this.overs);
    }

}
