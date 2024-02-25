package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio1_cliente.model;

public interface Builder {

    void cedula(String cedula);
    void nombre(String nombre);
    void apellido(String apellido);
    void email(String email);
    void telefonoFijo(String telefonoFijo);
    void telefonoCelular(String telefonoCelular);
    void direccion(String direccion);
}
