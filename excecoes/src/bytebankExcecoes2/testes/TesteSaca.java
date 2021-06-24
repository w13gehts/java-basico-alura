package bytebankExcecoes2.testes;

import bytebankExcecoes2.modelos.Conta;
import bytebankExcecoes2.modelos.ContaCorrente;
import bytebankExcecoes2.modelos.SaldoInsuficienteException;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(200);

        try {
            conta.saca(250.0);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
