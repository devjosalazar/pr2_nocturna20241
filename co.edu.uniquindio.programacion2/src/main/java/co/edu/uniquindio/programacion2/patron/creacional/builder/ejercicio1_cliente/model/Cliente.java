package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio1_cliente.model;

public class Cliente {

    private String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private String telefonoFijo;
    private String telefonoCelular;
    private String direccion;

    public Cliente(String cedula,
                   String nombre,
                   String apellido,
                   String email,
                   String telefonoFijo,
                   String telefonoCelular,
                   String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
    }


    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public String getDireccion() {
        return direccion;
    }
}
