package ClasesGenericas.Ej1;

public class NumeroEntero implements Operable<Integer> {
    private int valor;

    public NumeroEntero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public Integer suma(Integer operando) {
        return valor + operando;
    }

    @Override
    public Integer resta(Integer operando) {
        return valor - operando;
    }

    @Override
    public Integer producto(Integer operando) {
        return valor * operando;
    }

    @Override
    public Integer division(Integer operando) {
        return valor / operando;
    }
}