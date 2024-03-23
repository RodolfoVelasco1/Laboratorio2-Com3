package Tp1Ej1;

public class Piloto extends Persona implements Volador {
    private int rango;

    public Piloto(String nombre, String apellido, int edad, int rango) {
        super(nombre,apellido, edad);
        this.rango = rango;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    @Override
    public void volar() {
        System.out.println("El Piloto " + super.getNombre() + " " + super.getApellido() + " de " + super.getEdad() + " años, con rango " + this.rango + " está volando en el avión.");
    }
}
