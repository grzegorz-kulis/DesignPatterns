package com.lisek.prototype;

public abstract class BasicCar implements Cloneable {

    protected String model;
    private int price;

    abstract void carInfo();

    public BasicCar(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    protected BasicCar clone() {
        BasicCar basicCar = null;
        try {
            basicCar = (BasicCar) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return basicCar;
    }
}
