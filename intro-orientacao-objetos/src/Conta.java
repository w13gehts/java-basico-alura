public class Conta {
        double saldo;
        int agencia;
        int numero;
        String titular;

        public void deposita(double valor) {
                //saldo é um atributo do objeto conta
                this.saldo += valor;
        }

        public boolean saca(double valor) {
                //confere se o saldo é maior que o valor, se sim, retira o valor
                if (this.saldo >= valor) {
                        this.saldo -= valor;
                        return true;
                } else {
                        return false;
                }
        }

        public boolean transfere (double valor, Conta destino){
                //confere se o saldo é maior que o valor, se sim, retira o valor e deposita no destino
                if (this.saldo >= valor) {
                        this.saldo -= valor;
                        destino.deposita(valor);
                        return true;
                } else {
                        return false;
                }
        }
}
