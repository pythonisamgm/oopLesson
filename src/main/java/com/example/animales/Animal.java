package com.example;
public class Animal extends SerVivo {
    private String animalType;

    public static String respirar(){
        return "puede respirar";
    }

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
