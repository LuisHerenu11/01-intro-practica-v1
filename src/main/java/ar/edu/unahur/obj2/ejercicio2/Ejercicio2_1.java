package ar.edu.unahur.obj2.ejercicio2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio2_1 {

    public static void main(String[] args) {
        List<Empleado> empleadoList = new ArrayList();
        String nombre,apellido,email;
        int dni,sueldoBase,tipo = 0;
        Empleado unEmpleado;
        Administrativo unAdministrativo;
        Vendedor unVendedor;
        Scanner lector = new Scanner(System.in);

        System.out.print("Agregar empleados a la lista: \n");

        for (int i=0; i<20;i++){
            System.out.print("Igrese 1 para cargar un Administrativo o 2 para un Vendedor\n");

            tipo = lector.nextInt();
            System.out.print("Empleado["+(i + 1)+"]=\n");
            System.out.print("Ingrese dni: \n");
            dni = lector.nextInt();
            System.out.print("Ingrese nombre: \n");
            nombre = lector.next();
            System.out.print("Ingrese apellido: \n");
            apellido = lector.next();
            System.out.print("Ingrese email: \n");
            email = lector.next();
            System.out.print("Ingrese sueldo base: \n");
            sueldoBase = lector.nextInt();

            if(tipo == 1){
                System.out.print("Ingrese horas Extra: \n");
                int hsExtra = lector.nextInt();
                System.out.print("Ingrese horas Mes: \n");
                int hsMes = lector.nextInt();

                unAdministrativo = new Administrativo(dni,nombre,apellido,email,sueldoBase,hsExtra,hsMes);
                empleadoList.add(i,unAdministrativo);
            }else if(tipo == 2){
                System.out.print("Ingrese porcentaje de comision: \n");
                int porcenComision = lector.nextInt();
                System.out.print("Ingrese total de ventas: \n");
                int totalVentas = lector.nextInt();

                unVendedor = new Vendedor(dni,nombre,apellido,email,sueldoBase,porcenComision,totalVentas);
                empleadoList.add(i,unVendedor);
            }
        }
        int indice = 0;

        for(Empleado unEmpleade : empleadoList) //FOR EACH IN JAVA.
        {
            if(unEmpleade instanceof Administrativo){
                System.out.println("Empleado num: "+indice+" |dni: "+unEmpleade.getDni()+" |nombre: "+unEmpleade.getNombre()+" |apellido: "+unEmpleade.getApellido()+" |sueldo: "+unEmpleade.getSueldo());
                indice = indice + 1;
            }else if(unEmpleade instanceof Vendedor){
                System.out.println("Empleado num: "+indice+" |dni: "+unEmpleade.getDni()+" |nombre: "+unEmpleade.getNombre()+" |apellido: "+unEmpleade.getApellido()+" |sueldo: "+unEmpleade.getSueldo());
                indice = indice + 1;
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