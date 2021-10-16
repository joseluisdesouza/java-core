package trilha.alura.bytebankherdado;

/**
 * depois que gerente extends FuncionarioAutentica ocorreu praticamente
 * todos estes comentarios, ficando apenas a bonificação
 * capitulo interfaces
 **/
public class Gerente extends Funcionario implements Autentica {

      private int senha;
      private AutenticaUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticaUtil();
    }
//
//    public Gerente() {
//
//    }
//
//    public Gerente(int senha) {
//        this.senha = senha;
//    }

//    public Gerente(String nome, String cpf, double salario, int tipo, int senha) {
//        super(nome, cpf, salario, tipo);
//        this.senha = senha;
//    }

//    public boolean autentica(int senha) {
//        /**
//         *MESMO METODO DA CLASSE ADMINISTRADOR
//         */
//        if (this.senha == senha) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    //reescrita de metodo perceba que este metodo é igual ao da classe pai
    //Repare que o método possui a mesma assinatura. Isto é, a mesma visibilidade, mesmo retorno, mesmo nome e os mesmos parâmetros.
    @Override
    public double getBonificacao() {
        //salario vezes(*) 10%
        System.out.println("Chamando a bonificacao do Gerente");
        return super.getSalario();
        //Mas agora o gerente ira ganhar mais os 10% então ao inves de duplicarmos o codigo dessa forma-> (this.salario * 0.1) + super.salario, devemos chamar desta forma -> super.getBonificacao + super.salario
        //super significa que esse atributo esta deifinido na classe pai e não nesta classe
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
         * não sera mais o gerente e sim o
         * AutenticaUtil
         */
    }

//    public void setSenha(int senha) {
//        this.senha = senha;
//    }
//
//    public int getSenha() {
//        return senha;
//    }
}
