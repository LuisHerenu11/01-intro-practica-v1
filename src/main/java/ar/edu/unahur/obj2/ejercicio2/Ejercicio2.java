package ar.edu.unahur.obj2.ejercicio2;
import java.util.*;

public class Ejercicio2 {
    public static void main(String [] args) {
        int num;

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un numero");
        num = lector.nextInt();

        //ARREGLAR.
        List ListaDeNumeros = new ArrayList();
        int numero = 0;

        Scanner lector2 = new Scanner(System.in);

        System.out.print("Ingrese numeros eh ingrese 0 al terminar");

        do {
            numero = lector2.nextInt();
            ListaDeNumeros.add(numero);
        } while (numero != 0);
        {
            System.out.println("los numeros de la lista son: "+ListaDeNumeros);
        }

        List listaDeNumerosMayores = new ArrayList();
        /*
        Iterator iter = ListaDeNumeros.iterator();
        while (iter.hasNext()){
            if(iter. >= num){
                listaDeNumerosMayores.add(iter.next());
            }
        }
        */
        List<Integer> unaLista = ListaDeNumeros;
        for (Integer unNumero : unaLista) {
            if (unNumero >= num) {
                listaDeNumerosMayores.add(unNumero);
            }
        }
        System.out.println("los numeros mayores a " +num+ " son : "+listaDeNumerosMayores);
    }
}
