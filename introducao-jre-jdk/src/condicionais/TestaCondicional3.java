package condicionais;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestaCondicional3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite a sua idade: ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idade = Integer.parseInt(st.nextToken());

        System.out.println("Digite o número de acompanhantes: ");
        st = new StringTokenizer(br.readLine());
        int quantidadePessoas = Integer.parseInt(st.nextToken());

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Seja bem vindo!");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("Você não tem 18 mas pode entrar pois está acompanhado");
            } else {
                System.out.println("Infelizmente você não pode entrar");
            }

        }
    }
}
