public class Referencias {
    public static void main(String[] args) {
        //instanciação da primeira conta
        Conta primeiraConta = new Conta();
        primeiraConta.titular = "Mod Sun";
        primeiraConta.agencia = 1069;
        primeiraConta.numero = 123456;
        primeiraConta.saldo = 300;

        //dados da primeira conta
        System.out.println("-------Primeira conta-------");
        System.out.println("Titular: " + primeiraConta.titular);
        System.out.println("Agência: " + primeiraConta.agencia);
        System.out.println("Número: " + primeiraConta.numero);
        System.out.println("Saldo: " + primeiraConta.saldo + "\n");

        //referencia o valor da segunda conta como o valor da primeira conta
        Conta segundaConta = primeiraConta;

        //dados da segunda conta
        System.out.println("-------Segunda conta-------");
        System.out.println("Titular: " + segundaConta.titular);
        System.out.println("Agência: " + segundaConta.agencia);
        System.out.println("Número: " + segundaConta.numero);
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo + "\n");

        //adiciona 100 reais ao saldo da segunda conta
        segundaConta.saldo += 100;

        //lê o saldo da primeira e da segunda conta
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo + "\n");

        //duas referencias para um mesmo objeto
        System.out.println("Primeira conta: " + primeiraConta);
        System.out.println("Segunda conta: " + segundaConta);
    }
}
