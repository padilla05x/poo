package co.edu.uniquindio.poo;

public class Zona {
   private String nombre;

   public Zona(String nombre) {
      this.nombre = nombre;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String toString() {
      return "Zona{nombre='" + this.nombre + "'}";
   }
}
