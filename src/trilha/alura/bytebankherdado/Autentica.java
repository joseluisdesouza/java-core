package trilha.alura.bytebankherdado;

public abstract interface Autentica {

    public boolean autentica(int senha);

    /**
     *PROBLEMA 2 que é referente as outras classes e não a essa, repare nas classes que implementam
     * esta interface sempre teram que dar vida as esses dois metodos e ate ai tudo bem, porem
     * a mesma validação ou seja o mesmo corpo do metodo se repetira em todas as classes.
     * Para isso veja os exemplos nas classes que implementam esta para ver o resultado: Cliente,
     * Gerente e Administrador.
     */

    public void setSenha(int senha);

    /**
     * PROBLEMA1!!!
     * Agora imagine que vamos ter uma classe Cliente e o cliente por algum
     * motivo precisa se autenticar no sistema, passar uma senha, porem
     * quando Cliente herdar a classe abstrata Autentica ele tambem estara
     * herdando a classe Funcionario e ai que esta o problema, um cliente
     * não é um funcionario, ele não tem um salario ou bonificação.
     *
     * Então podemos pensar, vamos fazer com que Gerente e Administrador
     * não herde mais de Autetica perdendo seus privilegios e que a classe
     * autentica não herde mais de Funcionario, problema do Cliente resolvido
     * e o Gerente e ADM? Bom vamos fazer que ele herde de Autentica e Funcionario
     * fazendo heraça multipla e ai esta mais um problema, o java não permite
     * herança multipla, imagine se pudessemos, na classe Funcionario teriamos uma
     * senha e na autentica teriamos outra, como saber qual é prioridade?
     *
     * Para resolver esse problema iremos usar Interfaces, praticamente são
     * classes abstratas com metodos abstratos, é como se fosse um contrato
     * qualquer classe que a implementar devera implementar seus metodos e definir
     * suas regras.
     */
}
