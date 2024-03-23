package Tp1Ej2;

public class Reserva {
    private int numeroReserva;

    public Reserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public void reservar(){
        System.out.println("Reserva realizada con éxito.");
    }

}
