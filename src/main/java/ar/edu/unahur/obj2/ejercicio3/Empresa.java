package ar.edu.unahur.obj2.ejercicio3;

public class Empresa {
    private String nombre;
    private String anioFundacion;

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
}
