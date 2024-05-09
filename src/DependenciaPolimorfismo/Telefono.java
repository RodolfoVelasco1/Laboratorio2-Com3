package DependenciaPolimorfismo;

import java.util.ArrayList;

public class Telefono extends Producto {
    private String modelo;

    public Telefono(double precio, String marca, String modelo) {
        super(precio, marca);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    // Polimorfismo Dinámico por herencia
    @Override
    public double precioTotal(){
        double total = 0;
        total = total + this.getPrecio() + this.calcularPrecioEnvio() + this.calcularComision(1);
        return total;
    }

    @Override
    public double calcularPrecioEnvio(){
        return 1.5;
    }
}
