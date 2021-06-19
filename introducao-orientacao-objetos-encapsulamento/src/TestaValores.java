public class TestaValores {
    public static void main(String[] args) {

        int total = 0;
        Conta conta = new Conta(1337, 24226);
        System.out.println(conta.getAgencia());

        conta.setAgencia(12345);
        Conta conta2 = new Conta(1333, 23456);
        Conta conta3 = new Conta(1233, 22456);
        System.out.println(Conta.getTotal());
    }
}
