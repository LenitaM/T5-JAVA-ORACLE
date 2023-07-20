package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,33);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,334);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho); //2

        //Saber qual posição está os elementos
        Conta ref = guardador.getReferencias(0);
        System.out.println(ref.getNumero()); //33


    }
}
