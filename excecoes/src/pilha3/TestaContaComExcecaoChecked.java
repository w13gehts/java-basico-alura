package pilha3;

public class TestaContaComExcecaoChecked {
    public static void main(String[] args) {

        Conta c = new Conta();
        try {
            c.deposita();
        } catch (MyException exception) {
            System.out.println("tratamento... ");
        }

    }
}
