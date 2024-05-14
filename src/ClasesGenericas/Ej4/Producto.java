package ClasesGenericas.Ej4;

public class Producto extends Articulo {
    private String categoria;

    public Producto(String nombre, double precio, String categoria) {
        super(nombre, precio);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + " (Categoría: " + categoria + ")";
    }
}