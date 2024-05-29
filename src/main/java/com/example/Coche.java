package com.example;

public class Coche {

//attributes: 
    public int cantidadRuedas;
    public boolean tieneVolante;
    public String marca; 
    public int asientos;
    public String modelo;
    
    
//constructors
    public Coche(int cantidadRuedas, boolean tieneVolante, String marca, int asientos, String modelo) {
        this.cantidadRuedas = cantidadRuedas;
        this.tieneVolante = tieneVolante;
        this.marca = marca;
        this.asientos = asientos;
        this.modelo = modelo; 
    }
//methods
    public String encender(String marca, String modelo){
        return "El coche" + marca + modelo + "está encendido";
        
    }
    public String encenderCocheDefinido(){
        return "Estoy encendido";
        
    }
    

}