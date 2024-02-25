package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio2_reserva.model;

import java.time.LocalDateTime;
import java.util.List;

public class ReservaDeViajeBuilder{

    private LocalDateTime fechaSalida;
    private int duracion;
    private String tipoAlojamiento;
    private TipoTransporte transporte;
    private List<String> actividades;
    private String dietaEspecial;

    ReservaDeViajeBuilder(){}

    public ReservaDeViajeBuilder fechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
        return this;
    }

    public ReservaDeViajeBuilder duracion(int duracion) {
        this.duracion = duracion;
        return this;
    }

    public ReservaDeViajeBuilder tipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
        return this;
    }

    public ReservaDeViajeBuilder transporte(TipoTransporte transporte) {
        this.transporte = transporte;
        return this;
    }

    public ReservaDeViajeBuilder actividades(List<String> actividades) {
        this.actividades = actividades;
        return this;
    }

    public ReservaDeViajeBuilder dietaEspecial(String dietaEspecial) {
        this.dietaEspecial = dietaEspecial;
        return this;
    }

    public ReservaDeViaje build(){
        return new ReservaDeViaje(fechaSalida, duracion, tipoAlojamiento, transporte, actividades, dietaEspecial);
    }

}