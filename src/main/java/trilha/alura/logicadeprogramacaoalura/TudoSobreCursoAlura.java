package trilha.alura.logicadeprogramacaoalura;

public class TudoSobreCursoAlura {
    public static void main(String[] args) {
        int idade = 18;
        int quantidadePessoas = 3;

        if (idade >= 18 && quantidadePessoas >= 1) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente não pode entrar");
        }
    }

    static class TestaEscopo {
        public static void main(String[] args) {
            boolean foiPromovido = true;

            if (foiPromovido) {
                double salario = 4200.0;
            } else {
                double salario = 3800.0;
            }

            //System.out.println(salario);
        }

    }

    static class TesteIR2 {
        public static void main(String[] args) {

            // De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
            // De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
            // De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636

            double salario = 3300.0;

            if (salario >= 1900.0 && salario <= 2800.0) {
                System.out.println("A sua aliquota é de 7%");
                System.out.println("Você pode deduzir até R$ 142");
            } else if (salario >= 2800.01 && salario <= 3751.0) {
                System.out.println("A sua aliquota é de 15%");
                System.out.println("Você pode deduzir até R$ 350");
            } else if (salario >= 3751.01 && salario <= 4664.0) {
                System.out.println("A sua aliquota é de 22.5%");
                System.out.println("Você pode deduzir até R$ 636");
            }

        }
    }

    static class TestaMes {
        public static void main(String[] args) {

            int mes = 10;

            switch (mes) {
                case 1:
                    System.out.println("O mês é Janeiro");
                    break;
                case 2:
                    System.out.println("O mês é Fevereiro");
                    break;
                case 3:
                    System.out.println("O mês é Março");
                    break;
                case 4:
                    System.out.println("O mês é Abril");
                    break;
                case 5:
                    System.out.println("O mês é Maio");
                    break;
                case 6:
                    System.out.println("O mês é Junho");
                    break;
                case 7:
                    System.out.println("O mês é Julho");
                    break;
                case 8:
                    System.out.println("O mês é Agosto");
                    break;
                case 9:
                    System.out.println("O mês é Setembro");
                    break;
                case 10:
                    System.out.println("O mês é Outubro");
                    break;
                case 11:
                    System.out.println("O mês é Novembro");
                    break;
                case 12:
                    System.out.println("O mês é Dezembro");
                    break;
                default:
                    System.out.println("Mês inválido");
                    break;
            }
        }
    }

    static class TestaWhile {
        public static void main(String[] args) {
            int contador = 0;
            while (contador <= 10) {
                System.out.println(contador);
                contador = contador + 1;
            }
            System.out.println(contador);
        }
    }

    static class TestaSomatoria {
        public static void main(String[] args) {
            int contador = 0;
            int total = 0;
            while (contador <= 10) {

                total += contador;

                System.out.println(total);
                contador++; //mais usado!
            }
        }
    }

    static class TestaFor {
        public static void main(String[] args) {
            for (int i = 0; i < 50; i++) {
                System.out.println(i);
            }
        }
    }

    static class LacosEncadeados {
        public static void main(String[] args) {
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                for (int contador = 0; contador <= 10; contador++) {
                    System.out.print(contador * multiplicador);
                    System.out.print(" ");
                }
                System.out.println();
                //tabuada
            }
        }
    }

    static class TestaLacos2 {
        public static void main(String[] args) {
            for (int linha = 0; linha < 10; linha++) {
                for (int coluna = 0; coluna < 10; coluna++) {
                    if (coluna > linha) {
                        break;
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    static class ProgramaComBreak {
        public static void main(String args[]) {
            for (int linha = 0; linha < 5; linha++) {
                for (int coluna = 0; coluna < 5; coluna++) {
                    if (coluna > linha) {
                        break;
                    }
                    System.out.print(coluna + 1);
                }
                System.out.println();
            }
        }
    }

    static class MultiplosDeTresAteCem {
        public static void main(String[] args) {
            for (int i = 1; i < 100; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    static class Fatorial {
        public static void main(String[] args) {
            int fatorial = 1;
            for (int i = 1; i < 11; i++) {
                fatorial *= i;
                System.out.println("Fatorial de " + i + " = " + fatorial);
            }
        }
    }

    static class NumerosDe150A300 {
        public static void main(String[] args) {

            for (int i = 150; i < 300; i++) {
                System.out.println(i);
            }
        }
    }

    static class SomaDe1A1000 {
        public static void main(String[] args) {

            int resultado = 0;
            int ultimoValor;
            for (int x = 0; x <= 1000; x++) {
                ultimoValor = resultado;
                resultado += x;
                System.out.printf("%d = %d + %d\n", resultado, ultimoValor, x);
            }
        }
    }
}
























