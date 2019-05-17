package com.lisek.prototype;

public class Ford extends BasicCar {

    public Ford() {
        super("Ford");
    }

    @Override
    void carInfo() {
        System.out.println("American automobile " + this.getModel() + " for " + this.getPrice());
    }

    @Override
    protected Ford clone() {
        return (Ford) super.clone();
    }
}
