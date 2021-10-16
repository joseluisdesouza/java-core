package trilha.alura.bytebankherdado;

public class TesteSistema {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(33333);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(adm);
        /**
         * não funciona por que o sistema interno só aceita gerente
         *         public void autentica(Gerente gerente)
         *
         * Alternatica 1 seria duplicar esse metodo que aceita gerente
         * para receber um administrador
         *          public void autentica(Administrador administrador)
         *   Mas estamos duplicando codigo e isso não é bom,
         *    tem que funcionar com
         *    um metodo sómente
         *
         * Alternatica 2 colocar esse codigo de autentica na classe
         * funcionario e assim todos irão herdar a função dela, porem
         * o problema é que agora o editor de video e o designer tambem
         * podem entrar no sistema ja que eles são filhos(subclasses) da
         * classe funcionario
         *
         * Alternativa 3 criar uma classe intermediaria
         * FuncionarioAutenticavel, dessa forma aumentando a hierarquia
         * e definindo regras para cada tipo, um designer é um funcionario
         * mas um gerente é um funcionario autenticavel
         * Veja diagrama
         */
    }
}
