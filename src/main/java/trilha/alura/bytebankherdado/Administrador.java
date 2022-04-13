package trilha.alura.bytebankherdado;

public class Administrador extends Funcionario implements Autentica {

    /**
     * Essa classe esta repetindo codigo exatamente iguais ao do gerente e isso esta se tornando um problema,
     * neste capitulo sobre Interfaces vamos ter a solução
     */

    private AutenticaUtil autenticador;

    public Administrador() {
        this.autenticador = new AutenticaUtil();
    }
//
//    public void setSenha(int senha) {
//        this.senha = senha;
//    }
//
//    public boolean autentica(int senha) {
//        /**
//         *MESMO METODO DA CLASSE GERENTE
//         */
//        if (this.senha == senha) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
        /**
         *  * if (this.senha == senha) {
         *             return true;
         *        } else {
         *            return false;
         *        }
         * CONTINUAÇAÕ DO PROBLEMA
         * este trecho de codigo se repete em todas a classes que assinam o contrato da interface
         *
         * depois resolvemos o problema delegando a chamado ao autenticador
         */
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
        /**
         * quem ira guardar diretamente a senha
         * não sera mais o administrador e sim o
         * AutenticaUtil
         */
    }
}
