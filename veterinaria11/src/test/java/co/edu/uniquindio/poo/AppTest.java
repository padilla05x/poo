/**
 * Clase para probar el funcionamiento del código de veterinaria
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");
        
        Veterinaria veterinaria = new Veterinaria("Firulais", "Terrier", "pincher", (byte) 12, "macho", "cafe", (byte) 10);

        assertEquals("Firulais", veterinaria.nombre());
        assertEquals("Terrier", veterinaria.especie());
        assertEquals("pincher", veterinaria.raza());
        assertEquals((byte) 12, veterinaria.edad());
        assertEquals("macho", veterinaria.genero());
        assertEquals("cafe", veterinaria.color());
        assertEquals((byte) 10, veterinaria.peso());


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

        assertThrows(Throwable.class, () -> new Veterinaria("Firulais", "Terrier", "pincher", (byte) -12, "macho", "cafe", (byte) 10) );

        LOG.info("Finalizando test edad negativa:");

    }


    @Test
    public void pesoNegativo() {
        LOG.info("Iniciado test peso negativo ");

        assertThrows(Throwable.class, () -> new Veterinaria("Firulais", "Terrier", "pincher", (byte) 12, "macho", "cafe", (byte) -10) );

        LOG.info("Finalizando test peso negativo:");

    }


    @Test
    public void datosIncompletos() {
        LOG.info("Iniciado test datos incompletos");

        assertThrows(Throwable.class, () -> new Veterinaria(null, null, null, (byte)10, null, null, (byte)10));
  
        LOG.info("Finalizando test datos incompletos:");

    }

}
