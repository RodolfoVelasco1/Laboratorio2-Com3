package ClasesGenericas.Ej4;

public class Electrodomestico extends Producto {
    private int garantia;
    public Electrodomestico(String nombre, double precio, String categoria, int garantia) {
        super(nombre, precio, categoria);
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return super.toString() + " (Garantía: " + garantia + " años)";
    }
}
