package com.example.concesionario;

import java.lang.annotation.Annotation;

public class ConcesionarioSevilla implements IConcesionario {
//se puede crecer en vertical u horizontal: crear mas concesionarios o vender otro tipo de vehiculos. 
    private int id; 
    private String name; 

    

    public ConcesionarioSevilla(int id, String name) {
        this.id = id;
        this.name = name;
    }



    @Override
    public String VenderVehiculos() {
        // TODO Auto-generated method stub
        return "string";
        
    }



    @Override
    public void ComprarVehiculos() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public Class<? extends Annotation> annotationType() {
        // TODO Auto-generated method stub
        return null;
    }

    
}
