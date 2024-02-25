package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.builder;

import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.Engine;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.GPSNavigator;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.TripComputer;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.enums.CarType;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.enums.Transmission;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
