
/* LANÇANDO EXCEÇÕES*/
public class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private static int total = 0;

    public Conta(double saldo, int agencia, int numero) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) { //Experimento

    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)) {
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }
}
