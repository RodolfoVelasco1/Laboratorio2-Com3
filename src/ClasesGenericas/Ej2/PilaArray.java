package ClasesGenericas.Ej2;

import java.util.NoSuchElementException;

public class PilaArray<E> {
    private E[] array;
    private int contador;

    public PilaArray(int tamanio) {
        this.array = (E[]) new Object[tamanio];
        this.contador = 0;
    }

    public boolean estaVacia() {
        if(contador == 0){
            return true;
        }
        return false;
    }

    public boolean aniadir(E elemento) {
        if (contador == array.length) {
            System.out.println("No se puede añadir el elemento '" + elemento + "'. La pila está llena.");
            return false;
        }
        array[contador++] = elemento;
        System.out.println("Se añadio el elemento '" + elemento + "' a la pila. ");
        return true;
    }

    public E primero() {
        try {
            if (estaVacia()) {
                throw new NoSuchElementException();
            } else {
                System.out.println("La pila no está vacía.");
                System.out.println("Último elemento en el contador: " + this.contador);
            }
        } catch (NoSuchElementException e){
            System.out.println("NoSuchElementException. La pila está vacía.");
        }
        return null;
    }

    public E extraer() {
        try {
            if (estaVacia()) {
                throw new NoSuchElementException();
            } else {
                E elemento = array[--contador];
                array[contador] = null;
                return elemento;
            }
        } catch (NoSuchElementException e){
            System.out.println("NoSuchElementException. La pila está vacía.");
        }
        E elemento = array[--contador];
        array[contador] = null;
        return elemento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < contador; i++) {
            sb.append(array[i]);
            if (i < contador - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
