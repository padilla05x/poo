package co.edu.uniquindio.poo;

public class Triangulo extends FiguraGeometrica {
    public static double base;
    public static double altura;

    public Triangulo(double base, double altura) {
        assert base >= 0 : "El valor de la base no puede ser negativo";
        assert altura >= 0 : "El valor de la altura no puede ser negativo";
        Triangulo.base = base;
        Triangulo.altura = altura;
    }

    public static double getBase() {
        return base;
    }

    public void setBase(double base) {
        assert base >= 0 : "El valor de la base no puede ser negativo";
        Triangulo.base = base;
    }

    public static double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        assert altura >= 0 : "El valor de la altura no puede ser negativo";
        Triangulo.altura = altura;
    }
}

