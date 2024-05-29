package com.example;
import javax.swing.*;
import java.util.ArrayList;
/**
 * Hello world!
 */
public final class Main {
    
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

    }
}
