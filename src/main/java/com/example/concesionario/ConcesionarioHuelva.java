package com.example.concesionario;

import java.lang.annotation.Annotation;

public class ConcesionarioHuelva implements IConcesionario {
    private int id; 
    private String name;

    public ConcesionarioHuelva(){}

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
