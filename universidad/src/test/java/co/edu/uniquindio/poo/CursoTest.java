/**
 * Clase para probar el funcionamiento del código de un curso
 * @author Área de programación UQ
 * @since 2024-01
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CursoTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * Prueba para verificar que los datos de un estudiante estén completos
     */
    @Test
    public void datosCompletos() {
        LOG.info("Inicio datosCompletos");

        var curso = new Curso("Programación I");

        assertEquals("Programación I", curso.getNombre());

        LOG.info("Finalización datosCompletos");
    }

    /**
     * Prueba para verificar que se agregue un estudiante
     */
    @Test
    public void agregarEstudiante() {
        LOG.info("Inicio agregarEstudiante");

        var curso = new Curso("Programación I");
        Estudiante estudiante = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674", 18);

        curso.registrarEstudiante(estudiante);

        Estudiante estudiante2 = new Estudiante("Camila", "Alzate Rios", "1094532643333", "camila@uniquindio.edu.co", "315635674", 18);

        curso.registrarEstudiante(estudiante2);


        //assertEquals(1,curso.getEstudiantes().contains(estudiante));


        assertTrue(curso.getEstudiantes().contains(estudiante));
        assertEquals(2, curso.getEstudiantes().size());

        LOG.info("Finalización agregarEstudiante");
    }

    /**
     * Prueba para verificar que los datos de un curso no estén nulos
     */
    @Test
    public void datosNulos() {
        LOG.info("Inicio datosNulos");

        assertThrows(Throwable.class, () -> new Curso(null));

        LOG.info("Finalización datosNulos");
    }

    /**
     * Prueba para verificar que no se agregue un estudiante repetido
     */
    @Test
    public void agregarEstudianteRepetido() {
        LOG.info("Inicio agregarEstudianteRepetido");

        var curso = new Curso("Programación I");

        var estudiante1 = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co", "315635674",
                18);
        var estudiante2 = new Estudiante("Rodrigo", "Calderon", "109453264", "rodrigo@uniquindio.edu.co", "3223451278",
                19);

        curso.registrarEstudiante(estudiante1);

        assertThrows(Throwable.class, () -> curso.registrarEstudiante(estudiante2));

        LOG.info("Finalización agregarEstudianteRepetido");
    }

   
}
