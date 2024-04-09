package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class ParqueInfantil {
    private String nombre;
    private String descripcion;
    private List<Zona> zonas;
    private Municipio municipio;

public ParqueInfantil(String nombre, String descripcion, Municipio municipio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.zonas = new ArrayList<>();
        this.municipio = municipio;
    }

    public void agregarZona(Zona zona) {
        if (!zonas.contains(zona)) {
            zonas.add(zona);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Municipio getMunicipio() {
        return municipio;
    }
}
    