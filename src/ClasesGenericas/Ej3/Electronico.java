package ClasesGenericas.Ej3;

public class Electronico extends Producto {
    private int garantia;

    public Electronico(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return super.toString() + " (Garantía: " + garantia + " años)";
    }
}
