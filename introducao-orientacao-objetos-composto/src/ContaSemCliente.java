public class ContaSemCliente {

    public static void main(String[] args) {
        //cria uma conta e imprime o saldo
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.getSaldo());

        //o titular da conta é um novo cliente
        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);

        //define o nome do titular da conta
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);
    }
}
