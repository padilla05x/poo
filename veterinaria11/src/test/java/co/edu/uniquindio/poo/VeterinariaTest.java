/**
 * Clase para probar el funcionamiento del código de veterinaria
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");
        
        Veterinaria mascota = new Veterinaria("Firulais", "Canino", "pincher", (byte) 12, "macho", "cafe", (byte) 10);

        assertEquals("Firulais", mascota.nombre());
        assertEquals("Canino", mascota.especie());
        assertEquals("pincher", mascota.raza());
        assertEquals((byte) 12, mascota.edad());
        assertEquals("macho", mascota.genero());
        assertEquals("cafe", mascota.color());
        assertEquals((byte) 10, mascota.peso());


        LOG.info("Finalizando test datos completos");
    }


    @Test
    public void datosNulos() {
        LOG.info("Iniciado test datos nulos");

        assertThrows(Throwable.class, () -> new Veterinaria(null, null, null, (byte)12, null, null, (byte)10) );

        LOG.info("Finalizando test datos nulos");
    }


    @Test
    public void edadNegativa() {
        LOG.info("Iniciado test edad negativa");

        assertThrows(Throwable.class, () -> new Veterinaria("Firulais", "Canino", "pincher", (byte) -12, "macho", "cafe", (byte) 10) );

        LOG.info("Finalizando test edad negativa:");

    }


    @Test
    public void pesoNegativo() {
        LOG.info("Iniciado test peso negativo ");

        assertThrows(Throwable.class, () -> new Veterinaria("Firulais", "Canino", "pincher", (byte) 12, "macho", "cafe", (byte) -10) );

        LOG.info("Finalizando test peso negativo:");

    }


    @Test
    public void datosIncompletos() {
        LOG.info("Iniciado test datos incompletos");

        assertThrows(Throwable.class, () -> new Veterinaria("", "", "", (byte)10, "", "", (byte)10));
  
        LOG.info("Finalizando test datos incompletos:");

    }


    @Test
    public void pruebaAgregarNuevaMascota() {
        LOG.info("Inicia test de prueba agregar nueva mascota");

        Veterinariaaa veterinariaaa = new Veterinariaaa();
        Mascota mascota = new Mascota(1, "Tommy", "Canino", "Pincher", 15, "Macho", "Café", 10);
        veterinariaaa.agregarMascota(mascota);
        assertEquals(1, veterinariaaa.getMascotas().size());

        LOG.info("Finaliza test de prueba agregar nueva mascota");
    }

    
    @Test
    public void pruebaAgregarVeterinariaNula() {
        LOG.info("Inicia test de prueba agregar veterinaria nula");

        Veterinariaaa veterinariaaa = new Veterinariaaa();
        assertThrows(Throwable.class, () -> veterinariaaa.agregarMascota(null));

        LOG.info("Finaliza test de prueba agregar veterinaria nula");
    }


    @Test
    public void pruebaAgregarMascotaYaExistente() {
    LOG.info("Inicia test de prueba agregar mascota ya existente");

    Veterinariaaa veterinariaaa = new Veterinariaaa();
    Mascota mascota1 = new Mascota(18, "Manolo", "Canino", "Pincher", 4, "Masculino", "Gris", 7);

    Mascota mascota2 = new Mascota(18, "Lucas", "Canino", "Pastor Alemán", 4, "Masculino", "Negro", 12);

    assertDoesNotThrow(() -> veterinariaaa.agregarMascotaUnica(mascota1));
    assertThrows(MascotaExistente.class, () -> veterinariaaa.agregarMascotaUnica(mascota2));

    LOG.info("Finaliza test de prueba agregar mascota ya existente");
    }

}
