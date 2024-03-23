package Tp1Ej2;

public class Pasajero extends Persona {
    private int cantidadEquipaje;
    private Reserva reserva;

    public Pasajero(String nombre, String apellido, int edad, int cantidadEquipaje, int numeroReserva) {
        super(nombre, apellido, edad);
        this.cantidadEquipaje = cantidadEquipaje;
        this.reserva = new Reserva(numeroReserva);
    }

    public int getCantidadEquipaje() {
        return cantidadEquipaje;
    }

    public void setCantidadEquipaje(int cantidadEquipaje) {
        this.cantidadEquipaje = cantidadEquipaje;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
