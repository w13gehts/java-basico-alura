package exemploPolimorfismo;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador administrador = new Administrador();
        administrador.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(gerente);
        si.autentica(administrador);
        si.autentica(cliente);
    }
}
