package Tp1Ej1;

public class Avion implements Volador {
    private String matricula;
    private String modelo;
    private Vuelo vuelo;
    private Flota flota;

    public Avion(String matricula, String modelo, String ubicacion) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.flota = new Flota(ubicacion);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }

    @Override
    public void volar(){
        System.out.println("El avión modelo " + modelo + " con matrícula " + matricula + " está volando.");
    }

}
