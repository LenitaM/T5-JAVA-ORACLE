package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.GuardadorDeContas;
import modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {

    public static void main(String[] args) {

        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22,33);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,334);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho); //2

        //Saber qual posição está os elementos
        Conta ref = (Conta) guardador.getReferencias(0); //Precisa fazer um type cast para pegar a refencia tipo Conta
        System.out.println(ref.getNumero()); //33


    }
}
