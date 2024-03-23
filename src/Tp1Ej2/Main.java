package Tp1Ej2;

public class Main {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Graciela", "Perez", 36, 2, 15);
        PersonalAtencionAlCliente empleado1 = new PersonalAtencionAlCliente("Roberto", "Caseres", 45, 123);
        Reserva reserva1 = new Reserva(15);
        Vuelo vuelo1 = new Vuelo("Chile", "Uruguay", 348, 15);

        reserva1.reservar();

    }
}
