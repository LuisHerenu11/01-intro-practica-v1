package ar.edu.unahur.obj2.ejercicio3;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
    //List<Producto> productosList = new ArrayList();

    List<LineaTicket> lineasList = new ArrayList();

    public void cargarLinea(LineaTicket unaLinea){
        lineasList.add(unaLinea);
    }
/*
    public void imprimir(){
        for (Producto Producto: productosList){
            System.out.format("%s %.4f %d", Producto.getNombre(), Producto.getPrecioUnidad(), Producto.getCantidad());
            //System.out.printf("nom = %s  %f d %", Producto.getNombre(), Producto.getPrecioUnidad(), Producto.getCantidad());
        }
    }
*/
    public void imprimirLinea(){
        for(LineaTicket linea: lineasList){
            System.out.format("%s %.4f %d %s", linea.getNombre(), linea.getPrecioUnidad(), linea.getCantidad(), "|\n");
        }
    }
}
