package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio1_cliente.model;

public class ClienteEspecialBuilder extends ClienteBuilder{

    private String tipoDeCliente;
    private String fechaDeRegistro;
    private String preferencias;

    // Métodos setters para los campos adicionales, retornan ClienteEspecialBuilder
    // para permitir encadenamiento
    public ClienteEspecialBuilder tipoCliente(String tipoDeCliente) {
        this.tipoDeCliente = tipoDeCliente;
        return this;
    }

    public ClienteEspecialBuilder fechaRegistro(String fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
        return this;
    }

    public ClienteEspecialBuilder preferencias(String preferencias) {
        this.preferencias = preferencias;
        return this;
    }

    // Sobrescribir el método build() para devolver un ClienteEspecial
//    @Override
//    public ClienteEspecial build() {
//        return new ClienteEspecial(cedula, nombre, apellido, email, telefonoFijo, telefonoCelular, direccion, tipoDeCliente, fechaDeRegistro, preferencias);
//    }

//    @Override
//    public ClienteEspecial build() {
//        return new ClienteEspecial(cedula, nombre, apellido, email, telefonoFijo, telefonoCelular, direccion, tipoDeCliente, fechaDeRegistro, preferencias);
//    }

    public ClienteEspecial build() {
        Cliente cliente = super.build();
        return new ClienteEspecial(
                cliente.getCedula(),
                cliente.getNombre(),
                cliente.getApellido(),
                cliente.getEmail(),
                cliente.getTelefonoFijo(),
                cliente.getTelefonoCelular(),
                cliente.getDireccion(),
                tipoDeCliente,
                fechaDeRegistro,
                preferencias
        );
    }
}
