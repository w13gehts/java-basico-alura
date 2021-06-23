package exemploPolimorfismo;

public class TesteFuncionario {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();


        Funcionario nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("223355656-9");
        nico.setSalario(2600);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

        //nico.salario = 300;
    }
}
