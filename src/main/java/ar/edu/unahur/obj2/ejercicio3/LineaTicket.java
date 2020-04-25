package ar.edu.unahur.obj2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class LineaTicket {

    Producto producto;

    public double precioTotal(){
        return (this.getPrecioUnidad() * this.getCantidad());
    }

    public LineaTicket(Producto unProducto) {
        this.producto = unProducto;
    }


    public void cargarProducto(Producto unProducto){
        producto = unProducto;
    }


    public String getNombre() {
        return producto.getNombre();
    }

    public double getPrecioUnidad() {
        return producto.getPrecioUnidad();
    }

    public int getCantidad() {
        return producto.getCantidad();
    }
}
