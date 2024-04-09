package co.edu.uniquindio.poo;

public enum Municipio {
    // Municipios y sus respectivos sobrecostos
    ARMENIA("ARMENIA", 0),
    CALARCA("CALARCA", 10000),
    MONTENEGRO("MONTENEGRO", 20000),
    QUIMBAYA("QUIMBAYA", 30000),
    TEBAIDA("TEBAIDA", 15000),
    CIRCASIA("CIRCASIA", 18000),
    FILANDIA("FILANDIA", 22000),
    GENOVA("GENOVA", 70000),
    SALENTO("SALENTO", 50000),
    PIJAO("PIJAO", 40000),
    CORDOBA("CORDOBA", 30000),
    BUENAVISTA("BUENAVISTA", 35000);

    private final String nombre;
    private final double sobrecosto;

    Municipio(String nombre, double sobrecosto) {
        this.nombre = nombre;
        this.sobrecosto = sobrecosto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSobrecosto() {
        return sobrecosto;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "nombre='" + nombre + '\'' +
                ", sobrecosto=" + sobrecosto +
                '}';
    }
}

