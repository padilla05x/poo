package co.edu.uniquindio.poo;

public class CuidadoPersonal extends Producto {
    String ingredientes;

    public CuidadoPersonal (String codigoProducto, String nombre, String descripcion, int precio, int cantidadStock, String proveedor, String ingredientes){
        super(codigoProducto, nombre, descripcion, precio, cantidadStock, proveedor);
        this.ingredientes = ingredientes;
    }

    
    public String getIngredientes (){
        return ingredientes;
    }
    
}
