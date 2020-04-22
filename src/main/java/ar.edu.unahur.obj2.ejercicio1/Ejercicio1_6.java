package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio1_6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("ingrese valores de la matriz 3 x 3 : \n");
        int matriz [][] = new int [3][3];

        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.println("Introduzca valores [" + x + "," + y + "]");
                matriz[x][y] = lector.nextInt();
            }
        }


        /*for(int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                matriz[i][j] = lector.nextInt();
            }
        }*/

        System.out.print("resultado: ");

        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.println ("[" + x + "," + y + "] = " + matriz[x][y]);
            }
        }

        /*for (int k=0; k < x.length; k++){
            System.out.format(String.valueOf(x[k]));
        }*/

       /* for(int k=0; k < 3; k++){
            System.out.format(x);
        }
*/

//        System.out.format("%c %d %s", Character.valueOf('a'), Integer.valueOf(10), "string");
    }

}
