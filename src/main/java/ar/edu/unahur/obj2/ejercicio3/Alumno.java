package ar.edu.unahur.obj2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Alumno implements Matricula {
    private String nombre;
    private String apellido;
    private String email;

    List<Asignatura> asignaturasMatriculadasList = new ArrayList<>();

    // LA LISTA DE ASIGNATURAS SERA USADA PARA EL PUNTO 5.

    public Alumno(String nombre, String apellido, String email) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEmail(email);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void matricular(Alumno unAlumno, Asignatura unaAsignatura){
        asignaturasMatriculadasList.add(unaAsignatura);
        unaAsignatura.alumnosMatriculadosList.add(unAlumno);
    }

    public void listadoDeAsignaturasMatriculadas(){
        int horasTotales = 0;
        for(Asignatura a: asignaturasMatriculadasList){
            System.out.printf("%s %s %d %s","|Nombre: "+a.getNombre(),"|Hs Sem: "+a.getHorasSemanales(),"|\n");
            horasTotales = horasTotales + a.getHorasSemanales();
        }
        System.out.print("Horas Totales: "+horasTotales);
    }
}
