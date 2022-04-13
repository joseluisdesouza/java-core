package trilha.alura.bytebankherdado;

/**
 * No capitulo Classes e Metodos Abstratos foi dito que funcionario é um conceito, por exemplo
 * numa empresa existem varios funcionarios sendo eles gerente, editor, diretor, programador e etc... mas nunca
 * apenas uma pessoa com a função de funcionario. Por isso vamos definir essa classe com abstrata!!!
 *
 * Não pode instanciar objetos dessa classe, por que é abstrata
 */

public abstract class Funcionario {
    private String nome;
    private String cpf;
    protected double salario;
    private int tipo = 0;

    protected Funcionario() {
    }

    protected Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    protected Funcionario(String nome, String cpf, double salario, int tipo) {
        this(nome, cpf, salario);
        this.tipo = tipo;
    }

    /**
     * Perceba que todas as classes filhas tem esse metodo como padrão, cada um com sua implementação
     * e como essa classe é abstrata e não podemos mais instanciar objetos dela, não faz sentido termos essa validação
     * é mais facil deixar que cada filho mantenha sua propria implementação.
     *
     * Tornamos o metodo abstrato, metodos abstratos não contem corpo
     * Porem vale lembrar que se os metodos não forem abstratos, eles serão concretos normalmente
     * @return
     */

    public abstract double getBonificacao();

    //metodo da forma antiga, foi refatorado para que cada classe que herdar funcionario, implemenmte sua propria regra
//    public double getBonificacao() {
//        //salario vezes(*) 10%
//        System.out.println("Chamando a bonificacao do Funcionario");
//        return this.salario * 0.5;
//    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {

        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
