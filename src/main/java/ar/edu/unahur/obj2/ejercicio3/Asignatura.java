package ar.edu.unahur.obj2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombre;
    private int horasSemanales;

    List<Alumno> alumnosMatriculadosList = new ArrayList<>();

    public Asignatura(String nombre, int horasSemanales) {
        this.setNombre(nombre);
        this.setHorasSemanales(horasSemanales);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public void listadoDeAlumnosMatriculados(){
        for(Alumno d: alumnosMatriculadosList){
            System.out.printf("%s %s %s %s", "| nombre: "+d.getNombre(),"| apellido: "+d.getApellido(),"| email: "+d.getEmail(),"|\n");
        }
    }
}
