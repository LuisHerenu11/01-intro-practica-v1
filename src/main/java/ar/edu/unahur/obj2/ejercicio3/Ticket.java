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
    /*public void imprimirLinea2(){
        for(LineaTicket linea: lineasList){
            System.out.format("%s %.3f %d %s", linea.getNombre(), linea.getPrecioUnidad(), linea.getCantidad(), "|\n");
        }
    }*/

    public void imprimirLinea(){
        for(LineaTicket linea: lineasList){
            System.out.format("%s %s %d %.4f %s", linea.getNombre(),"x ", linea.getCantidad(), linea.precioTotal(), "|\n");
        }
    }

    public void imprimirTotalDeCompra(){
        double total = 0;
        for(LineaTicket linea: lineasList){
            total = total + linea.precioTotal();
        }
        System.out.format("%s %.4f %s","Total: ",total,"\n");
    }
}
