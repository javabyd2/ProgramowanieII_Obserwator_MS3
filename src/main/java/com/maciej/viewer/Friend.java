package com.maciej.viewer;

public class Friend implements AnimalAddedListener {
    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("Nowy dla friend: "+animal.getName());

    }
}
