package com.lisek.prototype;

import java.util.HashMap;

public class BasicCarCash {

    private static HashMap<String, BasicCar> basicCarCache = new HashMap<String, BasicCar>();

    //TODO implement deep copy strategy

    public static BasicCar getCar(String model) {
        BasicCar basicCar = basicCarCache.get(model);
        return basicCar.clone();
    }

    public static void loadCache() {
        Ford ford = new Ford();
        ford.setPrice(100);
        basicCarCache.put(ford.getModel(), ford);

        Toyota toyota = new Toyota();
        toyota.setPrice(110);
        basicCarCache.put(toyota.getModel(), toyota);
    }
}
