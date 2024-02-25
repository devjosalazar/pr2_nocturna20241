package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio2_reserva.model;

import java.time.LocalDateTime;
import java.util.List;

public class ReservaDeViaje {

    private LocalDateTime fechaSalida;
    private int duracion;
    private String tipoAlojamiento;
    private TipoTransporte transporte;
    private List<String> actividades;
    private String dietaEspecial;

    public ReservaDeViaje(LocalDateTime fechaSalida, int duracion, String tipoAlojamiento, TipoTransporte transporte, List<String> actividades, String dietaEspecial) {
        this.fechaSalida = fechaSalida;
        this.duracion = duracion;
        this.tipoAlojamiento = tipoAlojamiento;
        this.transporte = transporte;
        this.actividades = actividades;
        this.dietaEspecial = dietaEspecial;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public TipoTransporte getTransporte() {
        return transporte;
    }

    public void setTransporte(TipoTransporte transporte) {
        this.transporte = transporte;
    }

    public List<String> getActividades() {
        return actividades;
    }

    public void setActividades(List<String> actividades) {
        this.actividades = actividades;
    }

    public String getDietaEspecial() {
        return dietaEspecial;
    }

    public void setDietaEspecial(String dietaEspecial) {
        this.dietaEspecial = dietaEspecial;
    }

    public static ReservaDeViajeBuilder builder(){
        return new ReservaDeViajeBuilder();
    }
}
