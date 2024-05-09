package DependenciaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Telefono t1 = new Telefono(10, "Samsung", "S12");
        Computadora c1 = new Computadora(15, "Philips", 5);
        Televisor tv1 = new Televisor(25, "Sony", 7, 0.7);
        TiendaOnline tienda = new TiendaOnline();
        tienda.agregarProductoAlCarrito(t1);
        tienda.agregarProductoAlCarrito(c1);
        tienda.agregarProductoAlCarrito(tv1);
        double precio = tienda.calcularTotal(tienda.getCarrito());
        System.out.println("El precio del carrito es de $" + precio);
    }
}
