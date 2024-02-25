package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car;

import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.Car;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.Manual;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.builder.CarBuilder;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.builder.CarManualBuilder;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.builder.Director;

public class MainCar {

    public static void main(String[] args) {
        ejemplo1();
    }

    private static void ejemplo1() {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
