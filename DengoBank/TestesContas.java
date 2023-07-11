public class TestesContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111,111); //CRIANDO OBJETO

        cc.deposita(100.8);


        ContaPoupanca cp = new ContaPoupanca(222,222);

        cp.deposita(200.0);

        cc.transfere(15.0, cp);

        System.out.println("Conta Corrente: " + cc.getSaldo()); //Conta Corrente: 185.8
        //Com o meth saca sobreescrito - Conta Corrente: 185.60000000000002, retirou os 20 centavos
        System.out.println("Conta POupança: " + cp.getSaldo()); //Conta POupança: 315.0


    }
}
