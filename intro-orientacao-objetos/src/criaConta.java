public class criaConta {
    public static void main(String[] args) {

        //instanciação da primeira conta
        Conta primeiraConta = new Conta();
        primeiraConta.titular = "Avril Ramona Lavigne";
        primeiraConta.agencia = 1069;
        primeiraConta.numero = 112233;
        primeiraConta.saldo = 200;
        primeiraConta.saldo += 100;

        //instanciação da segunda conta
        Conta segundaConta = new Conta();
        segundaConta.titular = "Juliana Santos";
        segundaConta.agencia = 1069;
        segundaConta.numero = 123456;
        segundaConta.saldo = 50;

        //dados da primeira conta
        System.out.println("-------Primeira conta-------");
        System.out.println("Titular: " + primeiraConta.titular);
        System.out.println("Agência: " + primeiraConta.agencia);
        System.out.println("Número: " + primeiraConta.numero);
        System.out.println("Saldo: " + primeiraConta.saldo + "\n");

        //dados da segunda conta
        System.out.println("-------Segunda conta-------");
        System.out.println("Titular: " + segundaConta.titular);
        System.out.println("Agência: " +segundaConta.agencia);
        System.out.println("Número: " + segundaConta.numero);
        System.out.println("Saldo: " + segundaConta.saldo + "\n");

        //confere se a primeira e a segunda conta são a mesma conta
        if (primeiraConta == segundaConta) {
            System.out.println("Duas referências para um mesmo objeto");
        } else {
            System.out.println("A primeira e a segunda conta são objetos iguais?" + "\n" + "Objetos diferentes");
        }

        //dois objetos diferentes
        System.out.println("Primeira conta: " + primeiraConta);
        System.out.println("Segunda conta: " + segundaConta);
    }
}
