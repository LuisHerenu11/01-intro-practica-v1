package ar.edu.unahur.obj2.ejercicio3;

public class Producto {
    private String nombre;
    private double precioUnidad;
    private int cantidad;

    public Producto(String nombre, double precioUnidad, int cantidad) {
        this.setNombre(nombre);
        this.setPrecioUnidad(precioUnidad);
        this.setCantidad(cantidad);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
