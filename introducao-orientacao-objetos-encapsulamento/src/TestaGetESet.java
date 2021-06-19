public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1222, 23455);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
    }


}
