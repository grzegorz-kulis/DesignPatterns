package com.lisek.factorymethod;

public class FactoryMethod {

    public static Animal getAnimal(String animalType) throws Exception {

        if (animalType == null || animalType.isEmpty()) {
            return null;
        }

        if (animalType.equalsIgnoreCase("duck")) {
            return new Duck();
        }
        else if (animalType.equalsIgnoreCase("tiger")) {
            return new Tiger();
        }
        else if (animalType.equalsIgnoreCase("cow")) {
            return new Cow();
        }
        else {
            throw new Exception("Animal type : " + animalType + " cannot be instantiated");
        }
    }
}
