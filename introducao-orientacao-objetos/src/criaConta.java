public class criaConta {
    public static void main(String[] args) {

        //criação da primeira conta
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        primeiraConta.agencia = 69;
        primeiraConta.numero = 123456;
        primeiraConta.titular = "Juliana Santos";

        System.out.println("O titular da primeira conta é: " + primeiraConta.titular);
        System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);
        System.out.println("A agência da primeira conta é: " + primeiraConta.agencia);
        System.out.println("O número da primeira conta é: " + primeiraConta.numero + "\n");

        primeiraConta.saldo += 100;
        System.out.println("O saldo alterado da primeira conta é: " + primeiraConta.saldo);

        //criação da segunda conta
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        segundaConta.agencia = 65;
        segundaConta.numero = 654321;
        segundaConta.titular = "Santos Juliana";

        System.out.println("O titular da segunda conta é: " + segundaConta.titular);
        System.out.println("O saldo da segunda conta é: " + segundaConta.saldo);
        System.out.println("A agência da segunda conta é: " + segundaConta.agencia);
        System.out.println("O número da segunda conta é: " + segundaConta.numero + "\n");

        System.out.println("O titular da primeira conta é: " + primeiraConta.titular);
        System.out.println("A agência da primeira conta é: " + primeiraConta.agencia);
        System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);
        System.out.println("O número da primeira conta é: " + primeiraConta.numero + "\n");

        System.out.println(segundaConta.titular);
        System.out.println(segundaConta.agencia);
        System.out.println(segundaConta.saldo);
        System.out.println(segundaConta.numero + "\n");

        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta está na agência " + segundaConta.agencia + "\n");

        if (primeiraConta == segundaConta) {
            System.out.println("Mesma conta."+ "\n");
        } else {
            System.out.println("Contas diferentes." + "\n");
        }

        //as contas são diferentes
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
