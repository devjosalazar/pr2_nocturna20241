package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio1_cliente;

import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio1_cliente.model.Cliente;

public class MainCliente {

    public static void main(String[] args) {
        ejemplo1();
    }


    private static void ejemplo1() {
        Cliente cliente1 = Cliente.builder()
                .cedula("1094")
                .email("ariuas@gmail.com")
                .telefonoCelular("3147888")
                .telefonoFijo("606755")
                .direccion("armenia")
                .build();


        Cliente cliente2 = Cliente.builder()
                .cedula("1094")
                .nombre("juan")
                .apellido("arias")
                .direccion("armenia")
                .build();
    }

}
