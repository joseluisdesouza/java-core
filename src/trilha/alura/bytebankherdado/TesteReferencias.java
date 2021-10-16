package trilha.alura.bytebankherdado;

public class TesteReferencias {
    public static void main(String[] args) {
        //introdução ao polimorfismo
        /**
         * polimorfismo: temos duas referencias diferentes para o mesmo objeto
         *
         * Funcionario gerente = new Gerente();
         */


        Gerente gerente = new Gerente();
        gerente.setNome("Cardoso");
        gerente.setCpf("021-8766-90");
        gerente.setSalario(6000);
        gerente.setTipo(1);
        gerente.setSenha(2222);
        System.out.println(gerente.getNome());

        System.out.println("------------------------------------------------");

//        Funcionario funcionario = new Funcionario();
//        funcionario.setSalario(2000.0);
//        //System.out.println(funcionario.getNome());

        System.out.println("------------------------------------------------");

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setSalario(2500.0);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registro(gerente);
//        controleBonificacao.registro(funcionario);
        controleBonificacao.registro(editorVideo);

        System.out.println(controleBonificacao.getSoma());

    }

    //introdução ao polimorfismo
    static class ControleBonificacao {

        private double soma;

        //sempre repetindo esse trecho de codigo
//        public void registro(Gerente gerente) {
//            var bonificação = gerente.getBonificacao();
//            this.soma = this.soma + bonificação;
//        }

        //sempre repetindo esse trecho de codigo
        public void registro(Funcionario funcionario) {
            this.soma += funcionario.getBonificacao();
        }

        public double getSoma() {
            return soma;
        }

        /**
         * Os outros metodos de registro para EditorVideo e Gerente foram comentados
         * o que acontece é que os objetos pegam a referencia mais gerenerica, ou seja, a referencia de Funcionario
         * da linha 28 a 30 o metodo aceita qualquer objeto de gerente e editor devido a referencia generica de funcionario, isso por que
         * EditorVideo e Gerente herdan de Funcionario sendo a classe pai, a classe generica
         *
         * Essa é a real vantagem do polimorfismo, um metodo generico para gerenciar a bonificação.
         *
         * Referências de tipos de classes mais genéricas referenciam objetos mais específicos.
         *          Funcionario f = new Gerente();
         * @return
         */

        //sempre repetindo esse trecho de codigo
//        public void registro(EditorVideo editorVideo) {
//            var bonificação = editorVideo.getBonificacao();
//            this.soma = this.soma + bonificação;
//        }

    }

    //introdução ao polimorfismo
    static class EditorVideo extends Funcionario {

        @Override
        public double getBonificacao() {
            System.out.println("Chamando a bonificacao do Editor");
            return 200;
        }

//        public double getBonificacao() {
//            System.out.println("Chamando a bonificacao do Editor");
//            return super.getBonificacao() + 100;
//        }
    }
}
