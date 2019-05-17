package com.lisek.prototype;

public class Main {

    public static void main(String[] args) {
        BasicCarCashe.loadCache();

        BasicCar ford = BasicCarCashe.getCar("Ford");
        ford.carInfo();

        BasicCar toyota = BasicCarCashe.getCar("Toyota");
        toyota.carInfo();
    }
}
