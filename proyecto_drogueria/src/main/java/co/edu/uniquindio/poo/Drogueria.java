package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Drogueria {
    public String nombre;
    private List<Producto> listaProductos;
    private List<Pedido> listaPedidos;
    private List<Cliente> listaClientes;
    private List<Empleado> listaEmpleados;

    public Drogueria(String nombre) {
        this.nombre = nombre;
        listaProductos = new ArrayList<>();
        listaPedidos = new ArrayList<>();
        listaClientes = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
    }

    public String nombre(){
    return nombre;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public List<Producto> getProductosStockMayor100() {
        List<Producto> listaProductosStockMayor100 = new ArrayList<>();

        for (Producto producto : listaProductos) {
            if (producto.getCantidadStock() > 100) {
                listaProductosStockMayor100.add(producto);
            }
        }
        return listaProductosStockMayor100;
    }

    public void agregarProducto(Producto producto) {
        assert producto != null;
        listaProductos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        listaProductos.remove(producto);
    }
}
