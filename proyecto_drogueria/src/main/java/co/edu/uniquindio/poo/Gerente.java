package co.edu.uniquindio.poo;

public class Gerente extends Empleado {
    
    public Gerente(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, telefono, salario);

    }

    public void agregarProducto (Drogueria drogueria, Producto producto) {
        drogueria.agregarProducto(producto);

    }

    public void eliminarProducto (Drogueria drogueria, Producto producto){
        drogueria.eliminarProducto(producto);


    }
}
