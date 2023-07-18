package modelo;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    /*
    * @Override
    public boolean saca(double valor) {
        return super.saca(valor);
    }
*/
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    //HERANÇA NA CLASSE OBJECT

    @Override
    public String toString() {
        return "ContaPoupanca: " + super.toString();
        //fica o mesmo resultado, por causa da herança
        //se modificar a classe mãe agora muda a classe filho tb

    }
}
