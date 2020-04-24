package ar.edu.unahur.obj2.ejercicio2;
import ar.edu.unahur.obj2.ejercicio1.Ejercicio1_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio2_1 {

    public static void main(String[] args) {
        List<Empleado> empleadoList = new ArrayList();
        String nombre,apellido,email;
        int dni,sueldoBase,tipo;
        Empleado unEmpleado;

        Scanner lector = new Scanner(System.in);

        System.out.print("Agregar empleados a la lista: ");

        for (int i=0; i<20;i++){
            System.out.print("Igrese 1 para cargar un Administrativo o 2 para un Vendedor\n");

            tipo = lector.nextInt();
            System.out.print("Empleado["+(i + 1)+"]=\n");
            System.out.print("Ingrese dni: \n");
            dni = lector.nextInt();
            System.out.print("Ingrese nombre: \n");
            nombre = lector.nextLine();
            System.out.print("Ingrese apellido: \n");
            apellido = lector.nextLine();
            System.out.print("Ingrese email: \n");
            email = lector.nextLine();
            System.out.print("Ingrese sueldo base: \n");
            sueldoBase = lector.nextInt();

            if(tipo == 1){
                System.out.print("Ingrese horas Extra: \n");
                int hsExtra = lector.nextInt();
                System.out.print("Ingrese horas Mes: \n");
                int hsMes = lector.nextInt();

                unEmpleado = new Administrativo(dni,nombre,apellido,email,sueldoBase,hsExtra,hsMes);
                empleadoList.add(i,unEmpleado);
            }else if(tipo == 2){
                System.out.print("Ingrese porcentaje de comision: \n");
                int porcenComision = lector.nextInt();
                System.out.print("Ingrese total de ventas: \n");
                int totalVentas = lector.nextInt();

                unEmpleado = new Vendedor(dni,nombre,apellido,email,sueldoBase,porcenComision,totalVentas);
                empleadoList.add(i,unEmpleado);
            }
        }

    }

}



// SUPER CLASS EMPLEADO
// SUB CLAS ADMINISTRATIVO HERENCIA DE EMPLEADO
// SUB CLASS VENDEDOR HERENCIA DE EMPLEADO
// A FUTURO IMPLEMENTAR UNA INTERFACE (para facilitar nuevas insert en el codigo)
// CONSTRUCTORES EN LAS CLASES
// ETC.