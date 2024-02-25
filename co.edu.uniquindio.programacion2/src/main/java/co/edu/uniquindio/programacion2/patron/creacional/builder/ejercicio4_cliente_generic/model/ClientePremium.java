package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio4_cliente_generic.model;

public class ClientePremium extends Cliente {
    private String nivelDeMembresia;

    public ClientePremium(String nombre, String email, String telefono, String nivelDeMembresia) {
        super(nombre, email, telefono);
        this.nivelDeMembresia = nivelDeMembresia;
    }

    // Getter
    public String getNivelDeMembresia() { return nivelDeMembresia; }
}
