package praticandoCondicionais;

public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 22;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        System.out.println("valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo!");
        } else {
                System.out.println("Infelizmente você não pode entrar");
        }


    }
}
