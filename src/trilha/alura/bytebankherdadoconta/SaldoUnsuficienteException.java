package trilha.alura.bytebankherdadoconta;

public class SaldoUnsuficienteException extends RuntimeException {

    public SaldoUnsuficienteException(String msg) {
        super(msg);
    }
}
