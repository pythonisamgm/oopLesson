package com.example;
public class Animal extends SerVivo {
    private String animalType;

    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    
}
