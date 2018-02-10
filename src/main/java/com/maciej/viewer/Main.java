package com.maciej.viewer;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.registedAnimalAddedListener(
                new Visitor()
        );

        Visitor visitor = new Visitor();
        zoo.registedAnimalAddedListener(visitor);

        zoo.uregisterAnimalAddedListener(visitor);

        zoo.addAnimal(new Animal("Kot"));
        zoo.addAnimal(new Animal("dog"));


    }
}
