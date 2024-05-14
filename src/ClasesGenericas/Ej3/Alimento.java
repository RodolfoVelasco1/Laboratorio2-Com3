package ClasesGenericas.Ej3;

public class Alimento extends Producto {
    private String categoria;

    public Alimento(String nombre, double precio, String categoria) {
        super(nombre, precio);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + " (Categoría: " + categoria + ")";
    }
}
