package co.edu.uniquindio.programacion2.empresaTransporte;

import co.edu.uniquindio.programacion2.empresaTransporte.model.Asociado;
import co.edu.uniquindio.programacion2.empresaTransporte.model.VehiculoCarga;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTransporteTest {

    Asociado asociado;
    VehiculoCarga vehiculoCarga;
    @BeforeEach
    void init(){
        asociado = new Asociado("Juan", "12345678", "juan@example.com", "3001234567", null);
        vehiculoCarga = new VehiculoCarga();
    }

    @Test
    void crearAsociado() {
        Asociado asociado = new Asociado("Juan", "12345678", "juan@example.com", "3001234567", null);
        assertEquals("Juan Pérez", asociado.getNombre());
    }

    @Test
    void capacidadCargaTest() {
        VehiculoCarga vehiculo = new VehiculoCarga();
        vehiculo.setCapacidadCarga(1000.5);
        assertEquals(1000.5, vehiculo.getCapacidadCarga());
    }


    @Test
    void asociarVehiculoAsociadoTest(){
        asociado.setVehiculo(vehiculoCarga);

    }

}