package Tp1Ej2;

public class Pasajero extends Persona {
    private int cantidadEquipaje;

    public Pasajero(String nombre, String apellido, int edad, int cantidadEquipaje) {
        super(nombre, apellido, edad);
        this.cantidadEquipaje = cantidadEquipaje;
    }

    public int getCantidadEquipaje() {
        return cantidadEquipaje;
    }

    public void setCantidadEquipaje(int cantidadEquipaje) {
        this.cantidadEquipaje = cantidadEquipaje;
    }

}
