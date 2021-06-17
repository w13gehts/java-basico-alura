package variaveis;

public class TestaConversao {
    public static void main(String[] args) {

        //uso do casting (int)
        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);

        long numeroGrande = 232323232L;
        short valorPequeno = 12345;
        byte b = 127;

        //o retorno será 0.30000000000000004
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        //formas de citar o float
        float pontoFlutuante = 3.14f;
        float pontoFlutuante2 = (float) 3.14;


        System.out.println(total);
    }
}
