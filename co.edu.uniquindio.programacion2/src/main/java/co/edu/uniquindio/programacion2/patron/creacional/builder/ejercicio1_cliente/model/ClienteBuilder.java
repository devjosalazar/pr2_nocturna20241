package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio1_cliente.model;

public class ClienteBuilder {
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String telefonoFijo;
    protected String telefonoCelular;
    protected String direccion;

    public ClienteBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuilder email(String email) {
        this.email = email;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuilder telefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuilder telefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public Cliente build() {
        return new Cliente(cedula, nombre, apellido, email, telefonoFijo, telefonoCelular, direccion);
    }
}
