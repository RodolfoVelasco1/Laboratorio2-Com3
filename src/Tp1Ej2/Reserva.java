package Tp1Ej2;

public class Reserva {
    private int numeroReserva;
    private Pasajero pasajero;
    private Vuelo vuelo;

    public Reserva(int numeroReserva,String nombre, String apellido, int edad, int cantidadEquipaje, String origen, String destino, int numeroVuelo ) {
        this.numeroReserva = numeroReserva;
        this.pasajero = new Pasajero(nombre, apellido, edad, cantidadEquipaje);
        this.vuelo = new Vuelo(origen, destino, numeroVuelo);
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void reservar(){
        System.out.println("Reserva realizada con éxito.");
    }

}
