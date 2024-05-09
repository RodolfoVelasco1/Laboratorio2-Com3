package DependenciaPolimorfismo;

public class Computadora extends Producto {
    private double peso;

    public Computadora(double precio, String marca, double peso) {
        super(precio, marca);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Polimorfismo Dinámico por herencia
    @Override
    public double precioTotal(){
        double total = 0;
        total = total + this.getPrecio() + this.calcularPrecioEnvio(peso) + this.calcularComision(1);
        return total;
    }

    @Override
    public double calcularPrecioEnvio(double peso){
        return peso * 0.3;
    }
}
