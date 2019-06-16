package com.lisek.observer;

public class ObserverAvgScore implements Observer {

    private float runRate;
    private int predictedScore;

    public void update(int runs, int wickets, float overs) {
        this.runRate = (float) runs/overs;
        this.predictedScore = (int) (this.runRate * 50);
        display();
    }

    private void display() {
        System.out.println("avg score run rate: " + this.runRate + ", predicted score: " + this.predictedScore);
    }


}
