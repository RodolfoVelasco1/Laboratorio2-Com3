package DependenciaPolimorfismo;

public class Televisor extends Producto{
    private double peso;
    private double altura;

    public Televisor(double precio, String marca, double peso, double altura) {
        super(precio, marca);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Polimorfismo Dinámico por herencia
    @Override
    public double precioTotal(){
        double total = 0;
        total = total + this.getPrecio() + this.calcularPrecioEnvio(peso, altura) + this.calcularComision(1);
        return total;
    }

    @Override
    public double calcularPrecioEnvio(double peso, double altura){
        return (peso * 0.2) + (altura * 0.2);
    }
}
