package com.example;

import java.lang.annotation.Annotation;

public class Perro extends Animal implements IAnimalTerrerstre  {

    public String ladrar(){
        return "guau";
    }

    @Override
    public String caminar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String respirar() {
        // No se puede hacer override pq es estatico en la clase parent. 
        return "puede respirar";
    }
    

   

    
}
