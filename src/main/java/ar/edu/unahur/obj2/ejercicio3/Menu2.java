package ar.edu.unahur.obj2.ejercicio3;

import java.util.Scanner;

public class Menu2 {

    // FALTA IMPLEMENTAR


    // IDEA: ESTE MENU DEBE RECIBIR LOS DATOS (AL IGUAL QUE EL MENU DEL EJ 3_2) PERO como un extra,
    // en este menu solamente se recibira datos pero no se haran los procesos, los datos seran pasados por parametro
    // a methodos de clases encargadas de realizar dichos procesos.

    public static void desplegar(){
        System.out.print("MENU \n");
        System.out.print("1.Crear nuevo alumno \n");
        System.out.print("2.Crear nueva asignatura \n");
        System.out.print("3.Matricular alumno en asignatura \n");
        System.out.print("4.Listado de alumnos matriculados en una asignatura \n");
        System.out.print("5.Listado de asignaturas en las que está matriculado un alumno y total de horas. \n");
        System.out.print("6.Salir.\n");
    }


    public static void operar(){
        int decisión;
        String nombre,apellido,email;
        Crear crear = new Crear();
        Mostrar mostrar = new Mostrar();
        mostrar.recibirCreador(crear);
        Scanner lector = new Scanner(System.in);
        lector.useDelimiter("\n");
        System.out.print("decisión: ");
        decisión = lector.nextInt();


        if (decisión == 1){
            crear.instanciaAlumno();
        }else if(decisión == 2){
            crear.instanciaAsignatura();
        }else if(decisión == 3){
            System.out.print("a que alumno quiere matricular: \n");
            mostrar.alumnosList();
            int numEnElIndiceAlumnos = lector.nextInt();
            lector.nextLine();
            System.out.print("en que asignatura: \n");
            mostrar.asignaturasList();
            int numEnElIndiceAsignatura = lector.nextInt();

        }else if(decisión ==4){

        }
    }
}
