package com.example;
public class Pet extends Animal{
    private String color = "black"; 
    private String raza;
    private String sexo;
    private String name;
    public Pet(String color, String raza, String sexo, String name) {
        super();
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public String getRaza() {
        return raza;
    }
    public String getSexo() {
        return sexo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Pet(String animalType, String name) {
        super(animalType);
        this.name = name;
    }

    
}
