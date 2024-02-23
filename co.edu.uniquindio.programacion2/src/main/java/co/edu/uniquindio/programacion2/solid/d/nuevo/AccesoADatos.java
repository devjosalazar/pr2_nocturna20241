package co.edu.uniquindio.programacion2.solid.d.nuevo;

public class AccesoADatos {
    Conexion conexion;

    public AccesoADatos(){

    }

    Dato getDatos(){
        return conexion.getDatos();
    }
}
