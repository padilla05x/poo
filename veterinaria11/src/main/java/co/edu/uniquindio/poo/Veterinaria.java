package co.edu.uniquindio.poo;

public record Veterinaria(String nombre, String especie, String raza, byte edad, String genero, String color,
float peso) { 

    public Veterinaria {
        assert nombre != null;
        assert especie != null;
        assert raza != null;
        assert genero != null;
        assert color != null;
        assert edad >= (byte) 0;
        assert peso >= (byte) 0;
    }

}