package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio2_reserva;

import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio2_reserva.model.ReservaDeViaje;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio2_reserva.model.TipoTransporte;

import java.time.LocalDateTime;
import java.util.List;

public class MainReserva {

    public static void main(String[] args) {
        ejemplo1();
    }

    private static void ejemplo1() {
        // Crear una reserva de viaje con solo la fecha de salida y destino
        ReservaDeViaje reserva1 = ReservaDeViaje.builder()
                .fechaSalida(LocalDateTime.of(2024, 3, 1, 10, 15))
                .duracion(7)
                .build();

        // Crear una reserva de viaje con detalles personalizados
        ReservaDeViaje reserva2 = ReservaDeViaje.builder()
                .fechaSalida(LocalDateTime.of(2024, 5, 15, 21, 7))
                .duracion(10)
                .tipoAlojamiento("Hotel de lujo")
                .transporte(TipoTransporte.TAXI)
                .actividades(List.of("Visita a museos", "excursiones"))
                .dietaEspecial("Vegetariana")
                .build();

        // Realizar operaciones con las instancias de reserva de viaje creadas
        System.out.println("Reserva 1: " + reserva1.getFechaSalida());
        System.out.println("Reserva 2: " + reserva2.getFechaSalida() + ", Duración: " + reserva2.getDuracion() + " días");
    }
}
