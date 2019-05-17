package com.lisek.prototype;

public class Toyota extends BasicCar {

    public Toyota() {
        super("Toyota");
    }

    @Override
    void carInfo() {
        System.out.println("Just a Japanese " + this.getModel() + " for " + this.getPrice());
    }

    @Override
    protected Toyota clone() {
        return (Toyota) super.clone();
    }
}
