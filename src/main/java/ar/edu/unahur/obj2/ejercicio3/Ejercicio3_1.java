package ar.edu.unahur.obj2.ejercicio3;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Ticket nuevoTicket = new Ticket();

        System.out.print("Ingrese 1 para empezar a agregar productos al ticket: ");
        int decisión = lector.nextInt();

        while(decisión == 1){
            if(decisión == 1){
                System.out.print("ingrese nombre del producto: \n");
                String nombre = lector.next();
                System.out.print("ingrese el precio por unidad: \n");
                double precioUnidad = lector.nextDouble();
                System.out.print("Ingrese la cantidad: \n");
                int cantidad = lector.nextInt();

                Producto nuevoProducto = new Producto(nombre,precioUnidad,cantidad);
                LineaTicket nuevaLinea = new LineaTicket(nuevoProducto);
                nuevoTicket.cargarLinea(nuevaLinea);

                System.out.print("Ingrese 1 si quiere agregar otro producto al ticket o 2 para terminar: ");
                decisión = lector.nextInt();

                //nuevoTicket.cargarProducto(nuevaLinea);
            }else if(decisión == 2){
                System.out.print("Gracias por no comprar\n");
            }
        }

        nuevoTicket.imprimirLinea();
        System.out.print("Gracias por su compra\n");
    }
}

/*
 EXPLICACIÓN DEL EJERCICIO

 EN EL MAIN SOLO SE EJECUTARA LINEA DE TICKET Y TICKET


 EL TICKET TENDRA UNA COLECCION DEL TIPO LINEA DE TICKET (donde se agregara cada nueva instancia de lINEA DE TICKET)

 CADA INSTANCIA DE LINEA DE TICKET TENDRA EN SU INTERIOR 1 OBJETO DEL TIPO PRODUCTO

 LA INFORMACION DEL OBJETO SE GUARDA EN LINEA DEL TICKET

 Y LA LINEA DE TICKET SE GUARDA EN TICKET

 Y DESDE EL TICKET SE IMPRIME TOD0



 */