package com.lisek.flyweight;

public class CounterTerrorist implements Player {

    private String weapon;
    private String task;

    public CounterTerrorist() {
        this.task = "Defuse the bomb";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("Counter Terrorist with " + this.weapon + ". Task is: " + this.task);
    }
}
