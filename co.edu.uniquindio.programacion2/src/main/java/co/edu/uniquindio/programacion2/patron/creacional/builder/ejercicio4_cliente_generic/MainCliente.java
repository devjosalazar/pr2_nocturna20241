package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio4_cliente_generic;

import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio4_cliente_generic.builder.ClienteBuilder;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio4_cliente_generic.builder.ClientePremiumBuilder;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio4_cliente_generic.builder.ClienteVIPBuilder;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio4_cliente_generic.model.Cliente;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio4_cliente_generic.model.ClientePremium;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio4_cliente_generic.model.ClienteVIP;

public class MainCliente {

    public static void main(String[] args) {
        ejemplo1();
    }

    private static void ejemplo1() {
        Cliente clienteBasico = new ClienteBuilder()
                .nombre("Juan Perez")
                .email("juan@example.com")
                .telefono("123456789")
                .build();

        ClientePremium clientePremium = new ClientePremiumBuilder()
                .nombre("Ana López")
                .email("ana@example.com")
                .telefono("987654321")
                .nivelDeMembresia("Oro")
                .build();

        ClienteVIP clienteVIP = new ClienteVIPBuilder()
                .nombre("Carlos Martínez")
                .email("carlos@example.com")
                .telefono("555555555")
                .asesorAsignado("Roberto Gómez")
                .build();
    }
}
