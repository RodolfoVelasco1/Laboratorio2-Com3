package DependenciaPolimorfismo;

import java.util.ArrayList;

public class TiendaOnline {
    //Dependencia entre las clases Producto y TiendaOnline
    private ArrayList<Producto>carrito = new ArrayList<>();

    public TiendaOnline() {
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }

    // Polimorfismo Dinámico Paramétrico
    public <T extends Producto> void agregarProductoAlCarrito(T producto) {
        carrito.add(producto);
    }

    //Dependencia entre las clases Producto y TiendaOnline
    public double calcularTotal(ArrayList<Producto>carrito){
        double total = 0;
        for(Producto producto : carrito){
            total = total + producto.precioTotal();
        }
        return total;

    }
}
