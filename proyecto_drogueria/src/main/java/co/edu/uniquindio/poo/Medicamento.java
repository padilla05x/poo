package co.edu.uniquindio.poo;

public class Medicamento extends Producto {
    private final double dosis;

    public Medicamento (String codigoProducto, String nombre, String descripcion, int precio, int cantidadStock, String proveedor, double dosis){
        super(codigoProducto, nombre, descripcion, precio, cantidadStock, proveedor);
        this.dosis = dosis;
    }

    public double getDosis (){
        return dosis;
    }
}
