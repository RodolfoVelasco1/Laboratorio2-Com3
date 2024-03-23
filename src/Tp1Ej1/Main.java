package Tp1Ej1;

public class Main {
    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo("Argentina", "Brasil", 14);
        Avion avion1 = new Avion("PZT582", "Airbus 03", "Argentina");
        Flota flota1 = new Flota("Argentina");
        Reserva reserva1 = new Reserva(258);
        Piloto piloto1 = new Piloto("Pepe", "Gomez", 28, 3);




        avion1.setVuelo(vuelo1);
        System.out.println("El avión con matrícula " + avion1.getMatricula() + " tiene asignado el vuelo " + avion1.getVuelo().getNumeroVuelo());

        reserva1.agregarVuelo(vuelo1);
        System.out.println("La reserva " + reserva1.getNumeroReserva() + " tiene asignado el vuelo " + vuelo1.getNumeroVuelo());

        piloto1.volar();
        avion1.volar();

    }
}