package trilha.alura.bytebankherdado;

public class Cliente implements Autentica {

    private AutenticaUtil autenticador;

    public Cliente() {
        this.autenticador = new AutenticaUtil();
    }

    @Override
    public boolean autentica(int senha) {
        //delegando a senha ao metodo autentica da classe AutenticaUtil
        return this.autenticador.autentica(senha);
        /**
         * if (this.senha == senha) {
         *             return true;
         *         } else {
         *             return false;
         *         }
         * CONTINUAÇAÕ DO PROBLEMA
         * este trecho de codigo se repete em todas a classes que assinam o contrato da interface
         */
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
        /**
         * quem ira guardar diretamente a senha
         * não sera mais o cliente e sim o
         * AutenticaUtil
         */
    }
}
