package praticandoCondicionais;

import java.util.Scanner;

public class TesteIR {
    public static void main(String[] args) {

        System.out.println("Verificação do Imposto de Renda");

        double salario;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor do salário: ");
            salario = scanner.nextDouble();
        }

            if (salario >= 1903.99 && salario <= 2826.65) {
                salario = salario - 142.80;
                System.out.println("A dedução na declaração do imposto de renda é de 7.5%, no valor de R$142.80. " +
                        "O salário líquido é de " + salario);

            } else if (salario >= 2826.66 && salario <= 3751.05) {
                salario = salario - 350.80;
                System.out.println("A dedução na declaração do imposto de renda é de 15%, no valor de R$350.80. " +
                        "O salário líquido é de " + salario);

            } else if (salario >= 3751.06 && salario <= 4664.68){
                salario = salario - 636.13;
            System.out.println("A dedução na declaração do imposto de renda é de 22.5%, no valor de R$636.13. " +
                    "O salário líquido é de " + salario);
            } else if (salario >= 4664.68) {
                salario = salario - 869.36;
                System.out.println("A dedução na declaração do imposto de renda é de 27.5%, no valor de R$869.36. " +
                        "O salário líquido é de " + salario);
            } else {
                System.out.println("O valor de R$" + salario + " é isento do IR");
            }
        }
}
