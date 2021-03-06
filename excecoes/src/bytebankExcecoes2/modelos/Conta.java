package bytebankExcecoes2.modelos;

/**
 * Classe que representa uma Conta no ByteBank
 *
 * @author Juliana Saláfia
 * @version 0.1
 */

public abstract class Conta {

        protected double saldo;
        private int agencia;
        private int numero;
        private Cliente titular;
        private static int total;

        public Conta(int agencia, int numero) {

                Conta.total++;
                //System.out.println("O total de contas é " + Conta.total);
                this.agencia = agencia;
                this.numero = numero;
                //this.saldo = 100;
                //System.out.println("Estou criando uma conta.");
        }

        public abstract void deposita(double valor);

        /**
         * Valor precisa ser menor ou igual ao saldo
         * @param valor
         * @throws SaldoInsuficienteException
         */

        public void saca(double valor) throws SaldoInsuficienteException {
                if (this.saldo < valor) {
                        throw new SaldoInsuficienteException("Saldo: " + this.saldo + ". Valor: " + valor);
                } else {
                        this.saldo -= valor;
                }
        }

        public void transfere (double valor, Conta destino) throws SaldoInsuficienteException {
                this.saca(valor);
                destino.deposita(valor);
        }

        public double getSaldo(){
             return this.saldo;
        }

        public int getNumero() {
                return this.numero;
        }

        public void setNumero(int numero) {
                this.numero = numero;
        }

        public int getAgencia() {
                return this.agencia;
        }

        public void setAgencia(int agencia) {
                if (agencia <= 0) {
                        System.out.println("Não pode valor menor ou igual a 0");
                        return;
                }
                this.agencia = agencia;
        }

        public void setTitular(Cliente titular) {
                this.titular = titular;
        }

        public Cliente getTitular() {
                return titular;
        }

        public static int getTotal() {
                return Conta.total;
        }
}
