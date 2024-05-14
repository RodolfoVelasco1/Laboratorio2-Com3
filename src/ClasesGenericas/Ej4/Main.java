package ClasesGenericas.Ej4;

public class Main {
    public static void main(String[] args) {
        Almacen<Object> almacen = new Almacen<>();
        almacen.aniadirElemento(new Producto("Manzanas", 2.99, "Frutas"));
        almacen.aniadirElemento(new Electrodomestico("Televisor", 325.00, "Electrodomestico", 2));
        almacen.aniadirElemento(new Articulo("Libro", 15.99));

        almacen.imprimirElementos();
    }
}
