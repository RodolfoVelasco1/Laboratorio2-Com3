package Tp1Ej2;

public class Vuelo {
    private String origen;
    private String destino;
    private int numeroVuelo;


    public Vuelo(String origen, String destino, int numeroVuelo) {
        this.origen = origen;
        this.destino = destino;
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

}
