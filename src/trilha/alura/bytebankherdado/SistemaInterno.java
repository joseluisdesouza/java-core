package trilha.alura.bytebankherdado;

public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autentica autentica) {
        /**
         * se a senha recebida for igual a senha ja inicia pode entrar caso
         * contrario não pode!
         */
        boolean autenticou = autentica.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode entrar no sistema!");
        } else {
            System.out.println("Não pode entrar no sistema!");
        }
    }
}
