package ClasesGenericas.Ej3;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();

        almacen.aniadirProducto(new Producto("Manzanas", 1.99));
        almacen.aniadirProducto(new Producto("Leche", 2.20));
        almacen.aniadirProducto(new Alimento("Pata de Pollo", 5.50, "Carnes"));
        almacen.aniadirProducto(new ClasesGenericas.Ej3.Electronico("Televisor", 325.00, 2));

        almacen.imprimirProductos();

    }
}
