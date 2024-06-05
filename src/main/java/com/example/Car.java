package com.example;

public class Car {
    //private: solo se puede acceder dentro de la clase. 
    private int wheels; 
    protected String brand;
    private String color; 
    private boolean turnItOn;


    public Car(int wheels) {
        this.wheels = wheels;
        this.brand = brand;
        this.color = color; 
        this.turnItOn = turnItOn;
    } 

    
    //setters (establecer/añadir info) y getters (obtener). Encapsulamiento. El setter trae un valor de donde se llama ese valor, se le llama parámetro, por eso está vacío.

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color; 
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getBrand(){
        return brand;
    }

    public boolean turnItOn(){
        
        return true;}
    }
