package ar.edu.unahur.obj2.ejercicio3;

public class Mostrar {
    Crear creador;
    public void recibirCreador(Crear unCreador)
    {
        creador = unCreador;
    }
    public void alumnosList(){
        int indice = 0;
        for(Alumno a: creador.alumnosList){
            System.out.printf("%d %s %s %s %s", indice,"|Nombre: "+a.getNombre(),"Apellido: "+a.getApellido(),"email: "+a.getEmail(),"|\n");
            indice++;
        }
    }

    public void asignaturasList(){
        int indice = 0;
        for(Asignatura m: creador.asignaturasList){
            System.out.printf("%d %s %d %s", indice,"|Nombre: "+m.getNombre(),"horas semanales: "+m.getHorasSemanales(),"|\n");
            indice++;
        }
    }
}
