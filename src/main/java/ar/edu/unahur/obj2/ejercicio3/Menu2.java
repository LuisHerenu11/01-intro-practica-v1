package ar.edu.unahur.obj2.ejercicio3;

import java.util.Scanner;

public class Menu2 {



    // PUNTO 1 Y 2 FUNCIONA BIEN, ARREGLAR PUNTO 3 EN ADELANTE.

    public void desplegar(){
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

        while(decisión != 7){

            if (decisión == 1) {
                crear.instanciaAlumno();

                System.out.print("Eliga que quiere hacer ahora: \n");
                decisión = lector.nextInt();

            } else if (decisión == 2) {
                crear.instanciaAsignatura();

                System.out.print("Eliga que quiere hacer ahora: \n");
                decisión = lector.nextInt();

            } else if (decisión == 3) {
                System.out.print("a que alumno quiere matricular: \n");
                mostrar.alumnosList();
                int numEnElIndiceAlumnos = lector.nextInt();
                lector.nextLine();
                Alumno alumnoAMatricular = crear.alumnosList.get(numEnElIndiceAlumnos);
                System.out.print("en que asignatura: \n");
                mostrar.asignaturasList();
                int numEnElIndiceAsignatura = lector.nextInt();
                Asignatura asignaturaDondeSeMatricula = crear.asignaturasList.get(numEnElIndiceAsignatura);
                alumnoAMatricular.matricular(asignaturaDondeSeMatricula);
                System.out.print("el alumno fue matriculado. \n");

                System.out.print("Eliga que quiere hacer ahora: \n");
                decisión = lector.nextInt();

            } else if (decisión == 4) {
                System.out.print("Listado de alumnos matriculados en una asignatura: \n");
                mostrar.asignaturasList();
                System.out.print("ingrese el numero de indice de la asignatura que quiere ver: \n");
                int num = lector.nextInt();

                Asignatura asignatura = crear.asignaturasList.get(num);
                asignatura.listadoDeAlumnosMatriculados();

                System.out.print("Eliga que quiere hacer ahora: \n");
                decisión = lector.nextInt();

            } else if (decisión == 5) {
                System.out.print("Listado de asignaturas donde esta Matriculado un Alumno: \n");
                mostrar.alumnosList();
                System.out.print("ingrese el numero de indice de alumno que quiere ver: \n");
                int num = lector.nextInt();

                Alumno alumno = crear.alumnosList.get(num);
                alumno.listadoDeAsignaturasMatriculadas();

                System.out.print("Eliga que quiere hacer ahora: \n");
                decisión = lector.nextInt();

            } else if (decisión == 6) {
                System.out.print("Gracias por usar este programa");
                System.exit(0);
            }
        }
    }
}
