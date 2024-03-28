package Tp1Ej2;

public class Main {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Graciela", "Perez", 36, 2);
        PersonalAtencionAlCliente empleado1 = new PersonalAtencionAlCliente("Roberto", "Caseres", 45, 123);
        Vuelo vuelo1 = new Vuelo("Chile", "Uruguay", 348);
        Reserva reserva1 = new Reserva(15, "Graciela", "Perez", 36, 2, "Chile", "Uruguay", 348);

        reserva1.reservar();

    }
}
