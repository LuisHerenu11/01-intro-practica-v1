package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre,apellido;
        int cantidad;
        Persona unaPersona;
        ArrayList<Persona> ListaDePersonas = new ArrayList();
        System.out.print("Ingrese la cantidad de alumnos: ");
        cantidad = lector.nextInt();

        for (int i=0; i<cantidad;i++) {
            System.out.print("Alumno["+(i + 1)+"]=\n");
            System.out.print("Ingrese nombre: ");
            nombre = lector.next();
            System.out.print("Ingrese apellido: ");
            apellido = lector.next();
            unaPersona = new Persona(nombre,apellido);
            ListaDePersonas.add(i,unaPersona);
        }

        System.out.print("Los alumnos son: ");

        for(int j=0; j <ListaDePersonas.size(); j++){
            System.out.println(j+" "+ ListaDePersonas.get(j).getNombre()+" "+ListaDePersonas.get(j).getApellido()+"\n ");
        }
    }

    public static class Persona {
        private String nombre = " ";
        private String apellido = " ";

        public Persona(String unNombre, String unApellido) {

            this.setNombre(unNombre);
            this.setApellido(unApellido);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
    }






}






