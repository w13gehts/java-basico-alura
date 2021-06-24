package bytebankExcecoes2.testes;

import bytebankExcecoes2.modelos.CalculadorDeImposto;
import bytebankExcecoes2.modelos.ContaCorrente;
import bytebankExcecoes2.modelos.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
