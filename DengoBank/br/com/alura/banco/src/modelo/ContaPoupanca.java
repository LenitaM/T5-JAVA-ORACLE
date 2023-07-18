package modelo;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
