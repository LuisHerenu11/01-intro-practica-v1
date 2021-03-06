package ar.edu.unahur.obj2.ejercicio2;

public class Vendedor extends Empleado {
    private int porcenComision;
    private int totalVentas;


    public int getPorcenComision() {
        return porcenComision;
    }

    public void setPorcenComision(int porcenComision) {
        this.porcenComision = porcenComision;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    public Vendedor(int dni, String nombre, String apellido, String email, int sueldoBase, int porcenComision, int totalVentas) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.setPorcenComision(porcenComision);
        this.setTotalVentas(totalVentas);
    }

    @Override
    public double getSueldo(){
        return (this.getSueldoBase() + (this.getPorcenComision() * this.getTotalVentas() / 100));
    }
}
