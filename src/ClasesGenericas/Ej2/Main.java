package ClasesGenericas.Ej2;

public class Main {
    public static void main(String[] args) {
        PilaArray<String> pilaString = new PilaArray<>(3);
        pilaString.primero();
        pilaString.aniadir("Hola");
        pilaString.aniadir("a");
        pilaString.aniadir("todos");
        pilaString.aniadir("ustedes");
        pilaString.primero();

        System.out.println("Pila de cadenas: " + pilaString);

        String elementoExtraido = pilaString.extraer();
        System.out.println("Elemento extraído: " + elementoExtraido);
        System.out.println("Pila de cadenas después de extraer: " + pilaString);

    }
}
