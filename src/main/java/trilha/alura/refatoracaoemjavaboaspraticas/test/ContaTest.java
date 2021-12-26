package trilha.alura.refatoracaoemjavaboaspraticas.test;

import org.junit.jupiter.api.Test;
import trilha.alura.refatoracaoemjavaboaspraticas.primeirospassos.Conta;

public class ContaTest {

    @Test
    public void teste() {
        Conta conta = new Conta(300d);
        conta.sacar(150);

        //assertThat(conta.getSaldo(), is(equalTo(150d)));
    }
}
