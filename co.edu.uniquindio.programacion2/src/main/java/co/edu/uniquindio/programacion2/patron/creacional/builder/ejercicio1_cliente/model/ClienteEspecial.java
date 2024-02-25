package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio1_cliente.model;

public class ClienteEspecial extends Cliente{
    private String tipoDeCliente;
    private String fechaDeRegistro;
    private String preferencias;

    public ClienteEspecial(String cedula, String nombre, String apellido, String email, String telefonoFijo, String telefonoCelular, String direccion, String tipoDeCliente, String fechaDeRegistro, String preferencias) {
        super(cedula, nombre, apellido, email, telefonoFijo, telefonoCelular, direccion);
        this.tipoDeCliente = tipoDeCliente;
        this.fechaDeRegistro = fechaDeRegistro;
        this.preferencias = preferencias;
    }

    public static ClienteEspecialBuilder builder(){
        return new ClienteEspecialBuilder();
    }

    // Getters para los nuevos campos
    public String getTipoDeCliente() {
        return tipoDeCliente;
    }

    public String getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public String getPreferencias() {
        return preferencias;
    }

}
