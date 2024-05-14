package ClasesGenericas.Ej3;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T extends Producto> {
    private List<T> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public void aniadirProducto(T producto) {
        productos.add(producto);
    }

    public void imprimirProductos() {
        System.out.println("Productos en el almacén:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
