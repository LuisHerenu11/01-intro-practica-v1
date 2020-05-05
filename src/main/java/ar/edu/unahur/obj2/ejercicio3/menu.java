package ar.edu.unahur.obj2.ejercicio3;

import java.util.Scanner;

public class menu {
    public static void desplegar(){
        System.out.print("MENU \n");
        System.out.print("1.Crear Nueva empresa \n");
        System.out.print("2.Añadir Empleado a empresa ya existente \n");
        System.out.print("3.Listado de empresas \n");
        System.out.print("4.Listado detallado de empresas y empleados \n");
        System.out.print("5.Salir \n");

    }

    public static void operar(){
        int decisión;
        String nombre;
        String anioFundacion;

        Scanner lector = new Scanner(System.in);
        lector.useDelimiter("\n");
        RegistroEmpresas registro = new RegistroEmpresas();
        System.out.print("decisión: ");
        decisión = lector.nextInt();

        while(decisión != 6){
            if(decisión == 1){
                System.out.print("Ingrese nombre de la empresa: \n");
                nombre = lector.next().toUpperCase();
                lector.nextLine();
                System.out.print("Ingrese año de fundacion de la empresa: \n");
                anioFundacion = lector.next();
                lector.nextLine();

                Empresa nuevaEmpresa = new Empresa(nombre,anioFundacion);
                registro.agregarEmpresa(nuevaEmpresa);
                System.out.print("la empresa a sido registrada \n");
                menu.desplegar();
                System.out.print("Eliga que quiere hacer ahora: \n");
                decisión = lector.nextInt();

            }else if(decisión ==2){
                registro.mostrarRegistro();
                System.out.print("escriba el numero del indice de la empresa a la cual quiere añadir un empleado: \n");
                int posIndice = lector.nextInt();
                lector.nextLine();
                System.out.print("escriba el nombre del empleado: \n");
                String nombreDeEmpleado = lector.next();
                lector.nextLine();
                System.out.print("escriba el apellido del empleado: \n");
                String apellido = lector.next();
                lector.nextLine();
                System.out.print("escriba la fecha de nacimiento del empleado (acepta espacios): \n");
                String fechaNacimiento = lector.next();
                lector.nextLine();
                System.out.print("escriba la fecha de contrato del empleado: \n");
                String fechaContrato = lector.next();
                lector.nextLine();

                Empleados unEmpleado = new Empleado(nombreDeEmpleado,apellido,fechaNacimiento,fechaContrato);
                registro.buscarEmpresa(posIndice, unEmpleado);
                System.out.print("se a registrado con exito\n");
                System.out.print("Eliga que quiere hacer ahora: \n");
                menu.desplegar();
                decisión = lector.nextInt();

            }else if(decisión == 3){
                registro.mostrarRegistro();

                System.out.print("Eliga que quiere hacer ahora: \n");
                menu.desplegar();
                decisión = lector.nextInt();
            }else if(decisión == 4){
                registro.mostrarRegistro();
                System.out.print("Por favor ingrese el numero del indice de la empresa para ver su información detallada: \n");
                int posicionEnIndice = lector.nextInt();
                registro.mostrarRegistroDetallado(posicionEnIndice);
                menu.desplegar();
                System.out.print("Eliga que quiere hacer ahora: \n");

                decisión = lector.nextInt();
            }else if(decisión == 5){
                menu.finalizar();
            }
        }
    }

    public static void finalizar(){
        System.exit(0);
    }
}