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
      if (!this.zonas.contains(zona)) {
         this.zonas.add(zona);
      }

   }

   public String getNombre() {
      return this.nombre;
   }

   public String getDescripcion() {
      return this.descripcion;
   }

   public Municipio getMunicipio() {
      return this.municipio;
   }
}
