package ar.edu.unahur.obj2.ejercicio1_2;

import java.util.Scanner;

public class Ejercicio1_3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int i;
        double arregloTamanio;
        double array[] = new double[24];
        System.out.print("Ingrese el tamaño del array: ");
        arregloTamanio = lector.nextInt();
        for (i=0; i<arregloTamanio;i++) {
            System.out.print("X["+(i + 1)+"]= ");
            array[i]=lector.nextDouble();
        }
        System.out.println("Array normal");
        for(int j=0; j <arregloTamanio; j++){
            System.out.print(array[j]+"\n ");
        }
        double min,max,promedio;

        max = min = array[0];
        for(int l=0; l< arregloTamanio;l++){
            if(array[l] > max)
            {
                max = array[l];
            }
            if(array[l] < min)
            {
                min = array[l];
            }
        }
        System.out.print("La minima registrada es de: " +min);
        System.out.print("\nLa maxima registrada es de: "+max);

        // AGREGAR metodo MINIMA , MAXIMA, MEDIA.
    }
}
