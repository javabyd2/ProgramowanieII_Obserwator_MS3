package com.maciej.viewer;

public class CTO implements AnimalAddedListener{
    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("Nowy dla szefa: "+animal.getName());
    }
}
