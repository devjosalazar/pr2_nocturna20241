package co.edu.uniquindio.programacion2.builder;

public class Main {

    public static void main(String[] args) {
        creareCliente();
    }

    private static void creareCliente() {
        Cliente cliente = new Cliente("juan","arias","12122",23,50.3,174);
        Cliente cliente2 = new Cliente("juan","arias","12122");

        Cliente cliente3 = new Cliente();
        cliente3.setNombre("Ana");
        cliente3.setApellido("perez");
        cliente3.setCedula("1099");

        Cliente cliente4 = new Cliente();
        cliente4.setNombre("Ana");
        cliente4.setApellido("perez");
        cliente4.setCedula("1099");
        cliente4.setEdad(23);
        cliente4.setEstatura(22);
        cliente4.setPeso(22);




    }
}
