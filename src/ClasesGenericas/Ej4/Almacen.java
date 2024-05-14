package ClasesGenericas.Ej4;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T> {
    private List<T> elementos;

    public Almacen() {
        elementos = new ArrayList<>();
    }

    public void aniadirElemento(T elemento) {
        elementos.add(elemento);
    }

    public void imprimirElementos() {
        System.out.println("Elementos en el almacén:");
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
