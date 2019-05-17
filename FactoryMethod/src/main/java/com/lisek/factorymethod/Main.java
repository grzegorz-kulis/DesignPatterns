package com.lisek.factorymethod;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal duck = FactoryMethod.getAnimal("duck");
        duck.makeSound();
        Animal tiger = FactoryMethod.getAnimal("tiger");
        tiger.makeSound();
        Animal cow = FactoryMethod.getAnimal("cow");
        cow.makeSound();
        Animal unknown = FactoryMethod.getAnimal("unknown");
        unknown.makeSound();
    }
}
