package teste;

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLambdas {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(11,22);
        cc1.deposita(333.0);

        Conta cc2 = new ContaCorrente(22,33);
        cc2.deposita(444.4);

        Conta cc3 = new ContaCorrente(33,44);
        cc3.deposita(111.0);

        Conta cc4 = new ContaCorrente(44,55);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();

        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        //Function Object = Objeto que encapsula uma função

        //Ordenação de listas

        /*LAMBDAS Sintaxe: -> ("para esses dois parametros (c1 e c2) faça um retorno no Integer"), autoreturn é implicito no lambda, n pode colcoar*/
        lista.sort(
                ( c1,  c2) ->
             Integer.compare(c1.getNumero(), c2.getNumero())
        );

        //Outra forma de escrever as Lambdas, simplificando a classe anonima

        Comparator<Conta> comp = (Conta c1, Conta c2) -> {

                String nomeC1 = c1.getTitular().getNome();
                String nomeC2 = c2.getTitular().getNome();

                return  nomeC1.compareTo(nomeC2);
                //iguais devolve 0 / um > outro devolve -1 / maior que outr desvolve valor +1
        };

        lista.sort(comp);

        //3ª Forma de Lambda: fazendo laços

        lista.forEach(
                (conta) ->
                System.out.println(conta + ", " + conta.getTitular().getNome()));
        //"Faça um laço e para cada elemento de uma conta imprima esses elementos"

    }
}
