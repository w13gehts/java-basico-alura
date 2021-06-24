package bytebankExcecoes.testes;

import bytebankExcecoes.modelos.Conta;
import bytebankExcecoes.modelos.ContaCorrente;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(200);
        conta.saca(250.0);
        System.out.println(conta.getSaldo());

    }
}
