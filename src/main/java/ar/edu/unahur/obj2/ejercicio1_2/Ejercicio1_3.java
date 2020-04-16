package ar.edu.unahur.obj2.ejercicio1_2;

import java.util.Scanner;

public class Ejercicio1_3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int i;
        double arreglo;
        double array[] = new double[24];
        System.out.print("Ingrese el tamaño del array: ");
        arreglo = lector.nextInt();
        for (i=0; i<arreglo;i++) {
            System.out.print("X["+(i + 1)+"]= ");
            array[i]=lector.nextDouble();
        }
        System.out.println("Array normal");
        for(int j=0; j <arreglo; j++){
            System.out.print(array[j]+"\n ");
        }
        double min,max,promedio;

        // AGREGAR metodo MINIMA , MAXIMA, MEDIA.
    }
}
