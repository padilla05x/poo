package co.edu.uniquindio.poo;

public class Circulo extends FiguraGeometrica {
   public static double radio;

   public Circulo(double radio) {
      assert radio >= 0.0 : "El valor del radio no puede ser nativo";

      Circulo.radio = radio;
   }

   public static double getRadio() {
      return radio;
   }

   public void setRadio(double radio) {
      assert radio >= 0.0 : "El valor del radio no puede ser nativo";

      Circulo.radio = radio;
   }
}
