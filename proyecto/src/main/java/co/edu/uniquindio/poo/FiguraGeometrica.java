package co.edu.uniquindio.poo;

public class FiguraGeometrica {
    
    //Metodo para calcular el area de Triangulo.
    public double calcularAreaTriangulo(double base, double altura){
        double areaTriangulo = 0;

        areaTriangulo = (Triangulo.getBase() * Triangulo.getAltura())/2;
        return areaTriangulo;

    }


    //Metodo para calcular el area de Rectangulo
    public double calcularAreaRectangulo(double ancho, double lado){
        double areaRectangulo= 0;

        areaRectangulo = (Rectangulo.getAlto() * Rectangulo.getAncho());
        return areaRectangulo;

    }


    //Metodo para calcular el area de Cuadrado
    public double calcularAreaCuadrado(double lado){
        double areaCuadrado= 0;

        areaCuadrado = (Cuadrado.getLado() * Cuadrado.getLado());
        return areaCuadrado;
    }


     //Metodo para calcular el area de Circulo.
    public double calcularAreaCirculo(double radio){
        double areaCirculo= 0;

        areaCirculo = (Circulo.getRadio() * 1);
        return areaCirculo;
    }

}
