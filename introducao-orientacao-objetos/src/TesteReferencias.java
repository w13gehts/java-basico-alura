public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo+ "\n");

        segundaConta.saldo+=100;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo + "\n");
        System.out.println(primeiraConta.saldo);

        //são a mesma conta, referência
        if (primeiraConta == segundaConta) {
            System.out.println("São a mesma conta."+ "\n");
        }

        //a primeira conta e a segunda são a mesma, pois é uma referência
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
