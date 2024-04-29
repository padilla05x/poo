package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
    private final LocalDate fecha;
    private final int cantidad;
    private final Producto producto;
    private final Cliente cliente;

    
    public Pedido(LocalDate fecha, int cantidad, Producto producto, Cliente cliente){
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.producto = producto;
        this.cliente = cliente;
        assert producto.getCantidadStock() > 0;
    }

    
    public LocalDate getFecha (){
        return fecha;
    }

    
    public int getCantidad (){
        return cantidad;
    }

    
    public Producto getProducto (){
        return producto;
    }

   
    public Cliente getCliente (){
        return cliente;
    }

    
    public double calcularValorPedido (){
        return getCantidad() * producto.getPrecio();
    }
    
}
