package ar.edu.unahur.obj2.ejercicio3;

public interface Empleados {
    public String nombre = null;
    public String apellido = null;
    public String fechaNacimiento = null;
    public String fechaContrato = null;

    public void setNombre(String unNombre);
    public void setApellido(String unApellido);
    public void setfechaNacimiento(String unaFecha);
    public void setFechaContrato(String unaFecha);

    public String getNombre();
    public String getApellido();
    public String getFechaNacimiento();
    public String getFechaContrato();
}
