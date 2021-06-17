package condicionais;
import java.util.Scanner;

public class TesteIR {
    public static void main(String[] args) {

        System.out.println("Verificação do Imposto de Renda");

        double salario;
        double aliquota;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor do salário: ");
            salario = scanner.nextDouble();
        }

        boolean categoriaA = salario >= 1903.99 && salario <= 2826.65;
        boolean categoriaB = salario >= 2826.66 && salario <= 3751.05;
        boolean categoriaC = salario >= 3751.06 && salario <= 4664.68;
        boolean categoriaD = salario >= 4664.68;

           if (categoriaA) {
                aliquota = 142.80;
                salario = salario - aliquota;
                System.out.println("A dedução na declaração do imposto de renda é de 7.5%, no valor de R$"
                        + aliquota + ". O salário líquido é de R$" + salario);

            } else if (categoriaB) {
                aliquota = 354.80;
                salario = salario - aliquota;
                System.out.println("A dedução na declaração do imposto de renda é de 15%, no valor de R$"
                        + aliquota + ". O salário líquido é de R$" + salario);

            } else if (categoriaC){
                aliquota = 636.13;
                salario = salario - aliquota;
            System.out.println("A dedução na declaração do imposto de renda é de 22.5%, no valor de R$"
                    + aliquota + ". O salário líquido é de R$" + salario);
            } else if (categoriaD) {
                aliquota = 869.36;
                salario = salario - aliquota;
                System.out.println("A dedução na declaração do imposto de renda é de 27.5%, no valor de R$"
                        + aliquota + ". O salário líquido é de R$" + salario);
            } else {
                System.out.println("O valor de R$" + salario + " é isento do IR");
            }
        }
}
