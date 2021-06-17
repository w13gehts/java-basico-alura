package variaveis;

public class TestaFlutuante {
    public static void main(String[] args) {

        double salario;
        salario = 1250.70;
        System.out.println("Meu salário é: " + salario);

        double idade = 37;

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        int outraDivisao = 5 / 2;
        System.out.println(outraDivisao);

        //se os valores forem dados como inteiros, o resultado é inteiro
        double novaTentativa = 5 / 2;
        System.out.println(novaTentativa);

        //se um dos valores iniciar como double, a conta da divisão sai exata
        double novaTentativa2 = 5.0 / 2;
        System.out.println(novaTentativa2);
    }
}
