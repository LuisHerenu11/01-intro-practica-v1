package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        ArrayList<Persona> ListaDePersonas = new ArrayList();
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






