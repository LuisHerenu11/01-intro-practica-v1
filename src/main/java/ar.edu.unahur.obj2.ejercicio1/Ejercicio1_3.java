package ar.edu.unahur.obj2.ejercicio1;

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
        System.out.println("Registro por hora");

        for(int j=0; j <arregloTamanio; j++){
            String a = graficador(array[j]);
            System.out.print(a+" "+array[j]+"\n ");
        }
        double min,max;

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
        double suma = 0.0;
        for(int h=0; h< arregloTamanio;h++){
            suma += array[h];
        }
        double promedio = 0.0;
        promedio = suma / arregloTamanio;
        System.out.print("La minima registrada es de: " +min);
        System.out.print("\nLa maxima registrada es de: "+max);
        System.out.print("\nEl promedio es de: " +promedio);
        // AGREGAR metodo MINIMA , MAXIMA, MEDIA.
    }

    public static String graficador(double algo) {

        String asterizcos = " ";

        for (int p = 0; p < algo; p++){
            asterizcos += "*";
        }
        return asterizcos;
    }
}
