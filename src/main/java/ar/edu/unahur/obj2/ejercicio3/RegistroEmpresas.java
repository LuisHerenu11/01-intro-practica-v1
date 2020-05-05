package ar.edu.unahur.obj2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class RegistroEmpresas {
    List<Empresa> empresasList = new ArrayList();

    public void agregarEmpresa(Empresa unaEmpresa){
        empresasList.add(unaEmpresa);
    }

    public void mostrarRegistro(){
        int indice = 0;
        for(Empresa empresa: empresasList){
            System.out.printf("%d %s %s",indice,"NOMBRE: "+empresa.getNombre(),"|AÑO FUNDACION: "+empresa.getAnioFundacion()+"\n");
            indice++;
        }
    }

    public void mostrarRegistroDetallado(int posicionEnIndice){
        System.out.printf("%d %s %s",posicionEnIndice,"NOMBRE: "+empresasList.get(posicionEnIndice).getNombre(),"|AÑO FUNDACION: "+empresasList.get(posicionEnIndice).getAnioFundacion()+"\n");
        System.out.print("Los empleados en la empresa son: \n");
        //int numerador = 0;
        for(int i=0; i < empresasList.get(posicionEnIndice).empleadosList.size(); i++){
            //System.out.printf("%d %s %s %s %s %s",numerador,"NOMBRE: "+empleado.getNombre(),"|APELLIDO: "+empleado.getApellido(),"|NACIMIENTO:"+empleado.getFechaNacimiento(),"|CONTRATO:"+empleado.getFechaContrato()+"\n");
            System.out.print("|NOMBRE: "+empresasList.get(posicionEnIndice).empleadosList.get(i).getNombre()+"|APELLIDO: "+empresasList.get(posicionEnIndice).empleadosList.get(i).getApellido()+"|NACIMIENTO: "+empresasList.get(posicionEnIndice).empleadosList.get(i).getFechaNacimiento()+"|CONTRATO: "+empresasList.get(posicionEnIndice).empleadosList.get(i).getFechaContrato()+"|\n");
            //numerador++;
        }
    }

    public void buscarEmpresa(int indice, Empleados unEmpleado){
        empresasList.get(indice).anotarEmpleadoEnLista(unEmpleado);
    }
}
