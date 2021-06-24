package pilha3;

public class TesteConexao2 {
    public static void main(String[] args) {

        //simplificação do código
        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão");
        }

        //----------------------------------------

        /*Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
        }

        catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão");
        } finally {
            System.out.println("finally");
            if (con != null) {
                con.close();
            }
        }*/
    }
}
