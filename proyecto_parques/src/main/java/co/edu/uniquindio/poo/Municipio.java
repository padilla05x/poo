package co.edu.uniquindio.poo;

public enum Municipio {
   ARMENIA("ARMENIA", 0.0),
   CALARCA("CALARCA", 10000.0),
   MONTENEGRO("MONTENEGRO", 20000.0),
   QUIMBAYA("QUIMBAYA", 30000.0),
   TEBAIDA("TEBAIDA", 15000.0),
   CIRCASIA("CIRCASIA", 18000.0),
   FILANDIA("FILANDIA", 22000.0),
   GENOVA("GENOVA", 70000.0),
   SALENTO("SALENTO", 50000.0),
   PIJAO("PIJAO", 40000.0),
   CORDOBA("CORDOBA", 30000.0),
   BUENAVISTA("BUENAVISTA", 35000.0);

   private final String nombre;
   private final double sobrecosto;

   private Municipio(String nombre, double sobrecosto) {
      this.nombre = nombre;
      this.sobrecosto = sobrecosto;
   }

   public String getNombre() {
      return this.nombre;
   }

   public double getSobrecosto() {
      return this.sobrecosto;
   }

   public String toString() {
      return "Municipio{nombre='" + this.nombre + "', sobrecosto=" + this.sobrecosto + "}";
   }
}

