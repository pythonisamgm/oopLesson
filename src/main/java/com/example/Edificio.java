package com.example;

public class Edificio {
    //attributes: caracteristicas, valores, datos, propiedades. public: para que sea visible desde otras clases. 
    public int cantidadPuertas;
    public String tipoVentanas;
    public int cantidadEscalera;
    public boolean madera;

    

//constructors: para inicializar objetos, establecer propiedades y recibir parametros. 
public Edificio(int cantidadPuertas, String tipoVentanas, int cantidadEscalera, boolean madera) {
    this.cantidadPuertas = cantidadPuertas;
    this.tipoVentanas = tipoVentanas;
    this.cantidadEscalera = cantidadEscalera;
    this.madera = madera;
}

    //methods: en java, todas las funciones son metodos porque están dentro de clases. 
    public void alquilarse(){
         
    }
}
