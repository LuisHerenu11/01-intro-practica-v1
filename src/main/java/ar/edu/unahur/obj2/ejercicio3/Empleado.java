package ar.edu.unahur.obj2.ejercicio3;

public class Empleado implements Empleados {
    public String nombre;
    public String apellido;
    public String fechaNacimiento;
    public String fechaContrato;

    public Empleado(String nombre, String apellido, String fechaNacimiento, String fechaContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContrato = fechaContrato;
    }


    public void setNombre(String unNombre){
        nombre = unNombre;
    }

    public void setApellido(String unApellido){
        apellido = unApellido;
    }

    public void setfechaNacimiento(String unaFecha){
        fechaNacimiento = unaFecha;
    }

    public void setFechaContrato(String unaFecha){
        fechaContrato = unaFecha;
    }
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getFechaNacimiento(){
        return fechaNacimiento;
    }

    public String getFechaContrato(){
        return fechaContrato;
    }
}
