package ar.edu.unahur.obj2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Empresa {


    public String nombre;
    public String anioFundacion;

    List<Empleados> empleadosList = new ArrayList();

    public Empresa(String nombre, String anioFundacion) {
        this.setNombre(nombre);
        this.setAnioFundacion(anioFundacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(String anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    public void anotarEmpleadoEnLista(Empleados unEmpleado){
        empleadosList.add(unEmpleado);
    }
}

// AÑADIR UN METHOD QUE IMPRIMA CADA EMPLEADO DE LA LISTA.
