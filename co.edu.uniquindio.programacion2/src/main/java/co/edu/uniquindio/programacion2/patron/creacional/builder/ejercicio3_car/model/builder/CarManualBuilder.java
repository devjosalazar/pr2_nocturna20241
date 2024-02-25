package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.builder;

import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.Engine;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.GPSNavigator;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.Manual;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.TripComputer;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.enums.CarType;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.enums.Transmission;

public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
