package co.edu.uniquindio.poo;

public enum Material {
    // valor por metro cuadrado
    ARENA(10000), 
    GRAMA_SINTETICA(35000),
    GRAMA_NATURAL(20000),
    ASFALTO(40000);

    private final double valorPorMetroCuadrado;

    Material(double valorPorMetroCuadrado) {
        this.valorPorMetroCuadrado = valorPorMetroCuadrado;
    }

    public double getValorPorMetroCuadrado() {
        return valorPorMetroCuadrado;
    }
}

