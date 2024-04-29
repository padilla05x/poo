package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class DrogueriaTest {
    private static final Logger LOG = Logger.getLogger(DrogueriaTest.class.getName());

    @Test
    public void ProductosStock100 (){
        LOG.info("Inicio test obtener productos con stock mayor a 100");
        var drogueria = new Drogueria("FARMATODO");

        CuidadoPersonal producto1 = new CuidadoPersonal("0009", "Crema", "descripcion", 15000, 99, "CREMAS SAS", "ingredientes secretos");
        Hogar producto2 = new Hogar("0010", "Detergente", "descripcion", 18000, 102, "productos hogar SAS", "no beber");
        Medicamento producto3 = new Medicamento("0008", "Acetaminofen", "descripcion", 1000, 101, "hospital", 1);

        drogueria.agregarProducto(producto1);
        drogueria.agregarProducto(producto2);
        drogueria.agregarProducto(producto3);

        Collection<Producto> listaEsperada = List.of(producto2, producto3);

        assertIterableEquals(listaEsperada, drogueria.getProductosStockMayor100());

        LOG.info("Fin test obtener productos con stock mayor a 100");
    }

}
