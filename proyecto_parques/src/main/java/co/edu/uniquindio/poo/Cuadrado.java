package co.edu.uniquindio.poo;

public class Cuadrado extends FiguraGeometrica {
   public static double lado;

   public Cuadrado(double lado) {
      assert lado >= 0.0 : "El valor del lado no puede ser negativo";

      Cuadrado.lado = lado;
   }

   public static double getLado() {
      return lado;
   }

   public void setLado(double lado) {
      assert lado >= 0.0 : "El valor del lado no puede ser negativo";

      Cuadrado.lado = lado;
   }
}
