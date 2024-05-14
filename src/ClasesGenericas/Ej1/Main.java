package ClasesGenericas.Ej1;

public class Main {
    public static void main(String[] args) {
        NumeroEntero num1 = new NumeroEntero(20);
        NumeroEntero num2 = new NumeroEntero(2);

        System.out.println("Suma: " + num1.suma(num2.getValor()));
        System.out.println("Resta: " + num1.resta(num2.getValor()));
        System.out.println("Producto: " + num1.producto(num2.getValor()));
        System.out.println("División: " + num1.division(num2.getValor()));

    }
}
