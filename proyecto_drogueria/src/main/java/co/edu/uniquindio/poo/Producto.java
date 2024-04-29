package co.edu.uniquindio.poo;

public class Producto {
    private final String codigoProducto;
    private final String nombre;
    private final String descripcion;
    private final int precio;
    private final int cantidadStock;
    private final String proveedor;

    
    public Producto (String codigoProducto, String nombre, String descripcion, int precio, int cantidadStock, String proveedor){
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.proveedor = proveedor;
        assert cantidadStock > 0;
    }

   
    public String getIdProducto() {
        return codigoProducto;
    }

    
    public String getNombre() {
        return nombre;
    }

   
    public String getDescripcion() {
        return descripcion;
    }

   
    public int getPrecio() {
        return precio;
    }

    
    public int getCantidadStock() {
        return cantidadStock;
    }

    
    public String getIdProveedor() {
        return proveedor;
    }

}