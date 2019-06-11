package com.lisek.flyweight;

public class Terrorist implements Player {

    // intrinsic
    private String task;
    // extrinsic
    private String weapon;

    public Terrorist() {
        this.task = "Plant the bomb";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("Terrorist with " + this.weapon + ". Task is: " + this.task);
    }
}
