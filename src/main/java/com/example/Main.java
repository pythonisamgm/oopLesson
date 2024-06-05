package com.example;
import javax.swing.*;
import java.util.ArrayList;
/**
 * Hello world!
 */
public final class main {
    
    public static void main(String[] args) {
        
        /*ArrayList<Integer> listanumeros = new ArrayList<>();
        System.out.println(listanumeros);

        
        Edificio edificioDonBoscoSevilla = new Edificio(0, null, 0, false);
        Edificio edificioDonBoscoHuelva = new Edificio(0, null, 0, false);
        Edificio edificioDonBoscoJerez = new Edificio(0, null, 0, false);*/

        //instanciar: crear desde la abstraccion/clase/molde/concepto un objeto real, dentro de la ruta package com.example;
        Coche fiatTipo = new Coche(4, true, "fiat", 4, "tipo");
        Coche fordFiesta = new Coche(4, true, "Ford", 4, "fiesta");
        Coche seatIbiza = new Coche(4, true, "Seat", 4, "ibiza");

        String cocheEncendido = seatIbiza.encender(seatIbiza.marca, seatIbiza.modelo);

        System.out.println("marca de coche" + seatIbiza.marca);
        System.out.println(cocheEncendido);

        
        Car car1 = new Car(2);
        //para llamar a setter no hay que poner la variable primero porque esta vacio. Se guarda en el objeto (car1). 
        car1.setBrand("coche");
        String brandCar1 = car1.getBrand();
        car1.setColor("pink");
        String car1Color = car1.getColor();

        //herencia

        Pet conejo = new Pet("blanco", "belier", "hembra", "bolita");
        conejo.setAnimalType("lagomorfo");
        Pet gato = new Pet("gris", "straycat", "macho", "biru");
        gato.setAnimalType("felino");

    }
}

//modificadores de acceso: public, protected or private. Una vez que se constriyet el objeto se puede accededr a cualquier funcion o propiedad porque es publico. 