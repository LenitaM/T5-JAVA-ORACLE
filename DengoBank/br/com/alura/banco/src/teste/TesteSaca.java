package teste;

import especial.ContaEspecial;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.SaldoInsuficienteException;

public class TesteSaca {

    public static void main(String[] args) {

        Conta conta = new ContaCorrente(123, 456);



        conta.deposita(200);

        //Tratamento da exceção
        try {
            conta.saca(190);
        } catch(SaldoInsuficienteException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }


        System.out.println(conta.getSaldo());

    }
}
