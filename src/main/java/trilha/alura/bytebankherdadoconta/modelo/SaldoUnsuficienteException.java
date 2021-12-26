package trilha.alura.bytebankherdadoconta.modelo;

public class SaldoUnsuficienteException extends RuntimeException {

    public SaldoUnsuficienteException(String msg) {
        super(msg);
    }
}
