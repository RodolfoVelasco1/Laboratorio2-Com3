package DependenciaPolimorfismo;

public class Producto {
    private double precio;
    private String marca;

    public Producto(double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Polimorfismo Estático por sobrecarga
    public double calcularPrecioEnvio(){
        return 2.5;
    }
    public double calcularPrecioEnvio(double peso){
        return peso * 0.5;
    }
    public double calcularPrecioEnvio(double peso, double altura){
        return (peso * 0.4) + (altura * 0.4);
    }

    public double precioTotal(){
        double total = 0;
        total = total + this.calcularPrecioEnvio() + this.calcularComision(1);
        return total;
    }

    // Polimorfismo Estático por cohersión
    public double calcularComision(int cantidad){
        return cantidad * 0.2;
    }

}
