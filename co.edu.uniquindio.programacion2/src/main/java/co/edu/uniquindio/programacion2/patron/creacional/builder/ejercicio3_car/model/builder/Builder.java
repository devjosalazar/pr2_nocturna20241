package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.builder;

import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.Engine;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.GPSNavigator;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.TripComputer;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.enums.CarType;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio3_car.model.enums.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
