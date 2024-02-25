package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio4_cliente_generic.builder;

import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio4_cliente_generic.model.ClientePremium;

public class ClientePremiumBuilder extends ClienteBuilder<ClientePremiumBuilder> {
    private String nivelDeMembresia;

    public ClientePremiumBuilder nivelDeMembresia(String nivelDeMembresia) {
        this.nivelDeMembresia = nivelDeMembresia;
        return this;
    }

    @Override
    public ClientePremium build() {
        return new ClientePremium(nombre, email, telefono, nivelDeMembresia);
    }

    @Override
    protected ClientePremiumBuilder self() {
        return this;
    }
}
