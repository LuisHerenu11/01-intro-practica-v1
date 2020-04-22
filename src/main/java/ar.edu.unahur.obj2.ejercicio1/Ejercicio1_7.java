package ar.edu.unahur.obj2.ejercicio1;

import java.util.Random;

public class Ejercicio1_7 {
    public static void main(String[] args) {
        int matriz [][] = new int [10][10];
        Random r = new Random();


        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                int aleatorio = r.nextInt(100);
                matriz[x][y] = aleatorio;
            }
        }

        System.out.print("resultado: \n");

        for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }






     /*   for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.println ("[" + x + "," + y + "] = " + matriz[x][y]);
            }
        }*/

    }
}
