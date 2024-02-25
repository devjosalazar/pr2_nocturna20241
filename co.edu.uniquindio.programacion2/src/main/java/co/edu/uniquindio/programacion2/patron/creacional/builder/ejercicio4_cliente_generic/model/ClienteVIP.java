package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio4_cliente_generic.model;

public class ClienteVIP extends Cliente {
    private String asesorAsignado;

    public ClienteVIP(String nombre, String email, String telefono, String asesorAsignado) {
        super(nombre, email, telefono);
        this.asesorAsignado = asesorAsignado;
    }

    // Getter
    public String getAsesorAsignado() { return asesorAsignado; }
}
