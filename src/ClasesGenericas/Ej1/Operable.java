package ClasesGenericas.Ej1;

public interface Operable<E> {
    E suma(E operando);
    E resta(E operando);
    E producto(E operando);
    E division(E operando);
}
