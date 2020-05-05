package ar.edu.unahur.obj2.ejercicio3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crear {
    static List<Alumno> alumnosList = new ArrayList<>();
    static List<Asignatura> asignaturasList = new ArrayList<>();
    public static void instanciaAlumno(){
        Scanner lector = new Scanner(System.in);
        String nombre,apellido,email;
        lector.useDelimiter("\n");

        System.out.print("Ingrese nombre del alumno: \n");
        nombre = lector.next().toUpperCase();
        lector.nextLine();
        System.out.print("Ingrese apellido del alumno: \n");
        apellido = lector.next().toUpperCase();
        lector.nextLine();
        System.out.print("Ingrese email del alumno: \n");
        email = lector.next().toUpperCase();
        lector.nextLine();

       Alumno unAlumno = new Alumno(nombre,apellido,email);
       alumnosList.add(unAlumno);
    }

    public static void instanciaAsignatura(){
        Scanner lector = new Scanner(System.in);
        lector.useDelimiter("\n");
        String nombre;
        int horasSemanales;
        System.out.print("Ingrese nombre de la asignatura: \n");
        nombre = lector.next().toUpperCase();
        lector.nextLine();
        System.out.print("Ingrese horas semanales de la asignatura: \n");
        horasSemanales = lector.nextInt();
        lector.nextLine();

        Asignatura unaAsignatura = new Asignatura(nombre,horasSemanales);
        asignaturasList.add(unaAsignatura);
    }
}
