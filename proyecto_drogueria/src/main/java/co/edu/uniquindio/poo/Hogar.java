package co.edu.uniquindio.poo;

public class Hogar extends Producto {
    String indicacione;

    private final String indicaciones;

   
    public Hogar (String codigoProducto, String nombre, String descripcion, int precio, int cantidadStock, String proveedor, String indicaciones){
        super(codigoProducto, nombre, descripcion, precio, cantidadStock, proveedor);
        this.indicaciones = indicaciones;
    }

    public String getIndicaciones(){
        return indicaciones;
    }

    
}
