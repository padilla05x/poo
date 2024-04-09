package co.edu.uniquindio.poo;

public class FiguraGeometrica {
   public FiguraGeometrica() {
   }

//Metodo para calculara area del Triangulo.
   public double calcularAreaTriangulo(double base, double altura) {
      double areaTriangulo = 0.0;
      areaTriangulo = Triangulo.getBase() * Triangulo.getAltura() / 2.0;
      return areaTriangulo;
   }


//Metodo para calculara area del Rectangulo.
   public double calcularAreaRectangulo(double ancho, double lado) {
      double areaRectangulo = 0.0;
      areaRectangulo = Rectangulo.getAlto() * Rectangulo.getAncho();
      return areaRectangulo;
   }

//Metodo para calculara area del Cuadrado.
   public double calcularAreaCuadrado(double lado) {
      double areaCuadrado = 0.0;
      areaCuadrado = Cuadrado.getLado() * Cuadrado.getLado();
      return areaCuadrado;
   }

//Metodo para calculara area del Circulo.
   public double calcularAreaCirculo(double radio) {
      double areaCirculo = 0.0;
      areaCirculo = Circulo.getRadio() * 1.0;
      return areaCirculo;
   }
}
