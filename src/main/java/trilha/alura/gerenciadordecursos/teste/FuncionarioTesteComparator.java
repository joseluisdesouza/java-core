package trilha.alura.gerenciadordecursos.teste;

import trilha.alura.gerenciadordecursos.Funcionario;
import trilha.alura.gerenciadordecursos.OrdenaPorIdade;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Criando o comparator
 */

public class FuncionarioTesteComparator {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Barney", 12);
        Funcionario funcionario1 = new Funcionario("Jonatan", 9);
        Funcionario funcionario2 = new Funcionario("Guaraciara", 13);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(funcionario);
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        Iterator<Funcionario> iterador = funcionarios.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        }
    }
}
