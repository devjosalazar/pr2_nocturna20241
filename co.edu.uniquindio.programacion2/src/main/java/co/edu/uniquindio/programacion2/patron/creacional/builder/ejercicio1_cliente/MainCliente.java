package co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio1_cliente;

import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio1_cliente.model.Cliente;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio1_cliente.model.ClienteBuilder;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio1_cliente.model.ClienteEspecial;
import co.edu.uniquindio.programacion2.patron.creacional.builder.ejercicio1_cliente.model.ClienteEspecialBuilder;

public class MainCliente {

    public static void main(String[] args) {

        ejemplo1();
        ejemplo2();
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

    private static void ejemplo2() {
        Cliente cliente1 = Cliente.builder()
                .cedula("1094")
                .email("ariuas@gmail.com")
                .telefonoCelular("3147888")
                .telefonoFijo("606755")
                .direccion("armenia")
                .build();

//        ClienteEspecial clienteEspecial = ClienteEspecial.builder()
//                .cedula("123456789")
//                .nombre("Ana")
//                .apellido("Lopez")
//                .email("ana@example.com")
//                .telefonoFijo("02126666666")
//                .telefonoCelular("04146666666")
//                .direccion("Avenida Siempre Viva 742")
//                .tipoCliente("VIP")
////                .fechaRegistro("2023-01-01")
////                .preferencias("Preferencia 1, Preferencia 2")
//                .build();
    }

}
