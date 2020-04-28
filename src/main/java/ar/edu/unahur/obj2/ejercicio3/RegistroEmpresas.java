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

    public void buscarEmpresa(String nombre, Empleados unEmpleado){
        for(Empresa empresa: empresasList){
            if(nombre == empresa.getNombre()){
                empresa.anotarEmpleadoEnLista(unEmpleado);
            }
        }
    }
}
