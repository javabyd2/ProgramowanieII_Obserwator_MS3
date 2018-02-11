package com.maciej.viewer;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        //zoo.registedAnimalAddedListener(new Visitor());

        CTO cto = new CTO();
        zoo.registedAnimalAddedListener(cto);

        Friend friend = new Friend();
        zoo.registedAnimalAddedListener(friend);

        Visitor visitor = new Visitor();
        zoo.registedAnimalAddedListener(visitor);

        zoo.uregisterAnimalAddedListener(visitor);

        zoo.addAnimal(new Animal("Kot"));
        zoo.uregisterAnimalAddedListener(cto);
        zoo.addAnimal(new Animal("dog"));


    }
}
