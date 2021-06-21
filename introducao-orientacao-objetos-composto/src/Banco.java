public class Banco {

    public static void main(String[] args) {

        //cria o cliente paulo e popula os dados
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        //cria uma conta para o paulo e deposita um valor
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        //associa o cliente Paulo à conta do Paulo
        contaDoPaulo.titular = paulo;

        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular);
        System.out.println(paulo);
    }
}
