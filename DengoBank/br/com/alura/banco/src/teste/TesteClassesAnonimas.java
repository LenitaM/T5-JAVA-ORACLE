package teste;

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteClassesAnonimas {

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

        /*CLASSE ANONIMA*/
//Atalhos para simplificar o código de criação de objects
        lista.sort( //instanciado a classe comparator:
                new Comparator<Conta>() { //classe anonima
                       @Override
                       public int compare(Conta c1, Conta c2) {
                           return Integer.compare(c1.getNumero(), c2.getNumero());
                       } //classe compativel com a classe comparator
                   }
        ); //criação de um objeto que é compativel com o comparator numero da conta,
        // por baixo dos pano Java implmenta uma classe que executa esse método

        //Outra forma de escrever a Classe Anonima

        Comparator<Conta> comp = new Comparator<Conta>() {
            @Override
            public int compare(Conta c1, Conta c2) {

                String nomeC1 = c1.getTitular().getNome();
                String nomeC2 = c2.getTitular().getNome();

                return  nomeC1.compareTo(nomeC2);
                //iguais devolve 0 / um > outro devolve -1 / maior que outr desvolve valor +1
            }
        };

        //depois para teste
        for (Conta conta:lista) {
            System.out.println(conta);
        }

    }
     //pode apagar o NumeroDaContaComparator2 e TitularDaContComparator2

}
