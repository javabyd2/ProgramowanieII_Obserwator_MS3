package com.maciej.viewer;

import java.util.ArrayList;
import java.util.List;

public class Zoo {



    private List<Animal>animals = new ArrayList<Animal>();
    private List<AnimalAddedListener>listeners = new ArrayList<AnimalAddedListener>();

    public void addAnimal(Animal animal){
        // dodawanie obiektu animal do listy
        this.animals.add(animal);
        this.notifyAnimal(animal);
    }


    public void registedAnimalAddedListener(AnimalAddedListener animalAddedListener){
        this.listeners.add(animalAddedListener);
    }

    public  void uregisterAnimalAddedListener(AnimalAddedListener animalAddedListener){

        this.listeners.remove(animalAddedListener);

    }

    public void notifyAnimal(Animal animal){
        this.listeners.forEach((listener->listener.onAnimalAdded(animal)));
    }



}
