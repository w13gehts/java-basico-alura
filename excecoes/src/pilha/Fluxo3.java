package pilha;

public class Fluxo3 {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException ex) {
            /*String msg = ex.getMessage();
            System.out.println("ArithmeticException " +  msg);*/
            ex.printStackTrace();
        }  catch (NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("NullPointerException " +  msg);
            //ex.printStackTrace();
    }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //criei um problema para ser resolvido
            //int a = i / 0;

            //criacao de mais um problema a ser resolvido, uma ref nula
            Conta c = null;
            c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}
