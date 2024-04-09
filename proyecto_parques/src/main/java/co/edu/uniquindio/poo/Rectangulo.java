package co.edu.uniquindio.poo;

public class Rectangulo extends FiguraGeometrica {
   public static double ancho;
   public static double alto;

   public Rectangulo(double ancho, double alto) {
      assert ancho >= 0.0 : "El valor del ancho no puede ser negativo";

      assert alto >= 0.0 : "El valor del alto no puede ser negativo";

      Rectangulo.ancho = ancho;
      Rectangulo.alto = alto;
   }

   public static double getAncho() {
      return ancho;
   }

   public void setAncho(double ancho) {
      assert ancho >= 0.0 : "El valor del ancho no puede ser negativo";

      Rectangulo.ancho = ancho;
   }

   public static double getAlto() {
      return alto;
   }

   public void setAlto(double alto) {
      assert alto >= 0.0 : "El valor del alto no puede ser negativo";

      Rectangulo.alto = alto;
   }
}
