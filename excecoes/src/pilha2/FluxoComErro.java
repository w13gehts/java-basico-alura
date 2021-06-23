package pilha2;

public class FluxoComErro extends RuntimeException {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MyException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " +  msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Chamando método 2");
       metodo2();
        System.out.println("Fim do método 2");
    }
}
