public class Metodos {
    public static void main(String[] args) {

        //instanciação da conta
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.titular = "Paulo Silveira";
        //define o saldo inicial da conta do Paulo
        contaDoPaulo.saldo = 100;
        System.out.println("A conta do " + contaDoPaulo.titular + " começa com " + contaDoPaulo.saldo + " reais");

        //invoca o método deposita e define um valor
        contaDoPaulo.deposita(50);
        System.out.println("A conta do " + contaDoPaulo.titular + " recebe um depósito de 50 reais e fica com "
                + contaDoPaulo.saldo + " reais" + "\n");

        //a variável conseguiuRetirar guarda true ou false
        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.titular + " saca 20 reais e fica com o saldo de " + contaDoPaulo.saldo);

        //printa se o Paulo conseguiu efetuar o saque
        System.out.println(contaDoPaulo.titular + " conseguiu sacar o dinheiro? " + conseguiuRetirar + "\n");

        //cria uma conta nova, a conta da Marcela
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.titular = "Marcela Ramos";

        //conta da Marcela recebe um depósito de 5000 reais
        contaDaMarcela.deposita(5000);
        System.out.println("Saldo inicial da conta da " + contaDaMarcela.titular);

        //invoca o método transfere, passa o valor e uma referência para uma conta
        boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoPaulo);

        //analisa o resultado da booleana sucessoTransferencia e toma uma ação a partir disso
        System.out.print("A transferência obteve sucesso? ");
        if (sucessoTransferencia) {
            System.out.println("Transferência com sucesso" + "\n");
        } else {
            System.out.println("Faltou dinheiro" + "\n");
        }

        System.out.println("Saldo final da conta da " + contaDaMarcela.titular + ": " + contaDaMarcela.saldo);
        System.out.println("Saldo final da conta do " + contaDoPaulo.titular + ": "+ contaDoPaulo.saldo);
    }
}
