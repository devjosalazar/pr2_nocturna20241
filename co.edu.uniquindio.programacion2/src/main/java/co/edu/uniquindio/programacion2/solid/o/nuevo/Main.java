package co.edu.uniquindio.programacion2.solid.o.nuevo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Renault());
        listaCoches.add( new Audi());
        listaCoches.add( new Mercedes());
        imprimirPrecioMedioCoche(listaCoches);
    }

    public static void imprimirPrecioMedioCoche(List<Coche> listaCoches){
        for (Coche coche : listaCoches) {
            System.out.println(coche.precioMedioCoche());
        }
    }
}
