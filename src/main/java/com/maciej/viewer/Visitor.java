package com.maciej.viewer;

public class Visitor implements AnimalAddedListener {

    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("Nowy dla visitor: "+animal.getName());
    }
}
