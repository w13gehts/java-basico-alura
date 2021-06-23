package exemploPolimorfismo;

public class Gerente extends Funcionario implements Autenticavel {
//Gerente eh um funcionario, gerente herda da classe Funcionario, assina o contrato Autenticavel, é um Autenticavel

    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

        public double getBonificacao() {
            System.out.println("Chamando o método de bonificação do gerente ");
            return super.getSalario();
        }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
