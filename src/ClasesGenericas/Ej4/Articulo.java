package ClasesGenericas.Ej4;

public class Articulo {
    protected String nombre;
    protected double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}
