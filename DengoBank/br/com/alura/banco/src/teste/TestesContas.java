package teste;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;

/*
* Classe representa moldura de uma conta
*
* @author Lenita Maciel
* */


public class TestesContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111,111); //CRIANDO OBJETO

        cc.deposita(100.8);


        ContaPoupanca cp = new ContaPoupanca(222,222);

        cp.deposita(200.0);

        cc.transfere(15.0, cp);

        System.out.println("modelo.Conta Corrente: " + cc.getSaldo()); //modelo.Conta Corrente: 185.8
        //Com o meth saca sobreescrito - modelo.Conta Corrente: 185.60000000000002, retirou os 20 centavos
        System.out.println("modelo.Conta POupança: " + cp.getSaldo()); //modelo.Conta POupança: 315.0


    }
}
