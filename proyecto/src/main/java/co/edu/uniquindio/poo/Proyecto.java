package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    public String nombre;
    public double costoTotal;
    private List<ParqueInfantil> parques;

   
   
     public Proyecto(String nombre) {
        this.nombre = nombre;
        this.costoTotal = 0.0;
        this.parques = new ArrayList<>();
    }

    
    public ParqueInfantil obtenerParquePorNombre(String nombre) {
        for (ParqueInfantil parque : parques) {
            if (parque.getNombre().equals(nombre)) {
                return parque;
            }
        }
        return null;
    }

    public List<ParqueInfantil> obtenerParquesPorMunicipio(Municipio municipio) {
        List<ParqueInfantil> parquesMunicipio = new ArrayList<>();
        for (ParqueInfantil parque : parques) {
            if (parque.getMunicipio() == municipio) {
                parquesMunicipio.add(parque);
            }
        }
        return parquesMunicipio;
    }


    public double calcularCostoTotal() {
        return costoTotal;
    }
}

