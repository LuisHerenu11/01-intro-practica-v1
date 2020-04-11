package ar.edu.unahur.obj2.ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String [] args){

        Scanner lector = new Scanner(System.in);
        int a,i,aux,b;
        int array[] = new int[20];
        System.out.print("Ingrese el tamaño del array ");
        a = lector.nextInt();
        for (i=0; i<a;i++) {
            System.out.print("X["+(i + 1)+"]= ");
            array[i]=lector.nextInt();
        }
        System.out.println("Array normal");
        for(int j=0; j <a; j++){
            System.out.print(array[j]+", ");
        }
        b = a;
        for(i = 0;i<=b/2; i++){
            aux= array[i];
            array[i] = array[b - 1];
            array[b-1] = aux;
            b--;
        }
        System.out.println("array invertido");
        for(i =0; i<a;i++){
            System.out.print(array[i]+", ");
        }
    }
}