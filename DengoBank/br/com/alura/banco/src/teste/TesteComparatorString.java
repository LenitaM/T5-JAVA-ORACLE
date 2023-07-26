package teste;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

import java.util.*;

public class TesteComparatorString {


    public class Teste {

        public static void main(String[] args) {

            Conta cc1 = new ContaCorrente(22, 33);
            Cliente clienteCC1 = new Cliente(); //titular
            clienteCC1.setNome("Nico"); //deu um nome
            cc1.setTitular(clienteCC1); //associou o titular ao cliente
            cc1.deposita(333.0);

            Conta cc2 = new ContaPoupanca(22, 44);
            Cliente clienteCC2 = new Cliente();
            clienteCC2.setNome("Guilherme");
            cc2.setTitular(clienteCC2);
            cc2.deposita(444.0);

            Conta cc3 = new ContaCorrente(22, 11);
            Cliente clienteCC3 = new Cliente();
            clienteCC3.setNome("Paulo");
            cc3.setTitular(clienteCC3);
            cc3.deposita(111.0);

            Conta cc4 = new ContaPoupanca(22, 22);
            Cliente clienteCC4 = new Cliente();
            clienteCC4.setNome("Ana");
            cc4.setTitular(clienteCC4);
            cc4.deposita(222.0);


            List<Conta> lista = new ArrayList<>();
            lista.add(cc1);
            lista.add(cc2);
            lista.add(cc3);
            lista.add(cc4);

            for (Conta conta : lista) {
                System.out.println(conta);
            }

            /*Percebemos que a referência de cada um dos comparadores é utilizada somente para o método sort(),
            sendo assim, é comum que o construtor new seja inserido diretamente como parâmetro deste método*/

             //Forma Encontrada Atualmente                                      Não encontra desse forma
           // lista.sort(new NumeroDaContaComparator());   //NumeroDaContaComparator comparator = new NumeroDaContaComparator();
           // lista.sort(new TitularDaContaComparator()); //TitularDaContaComparator titularDaContaComparator = new TitularDaContaComparator();


            /*Como usar o método sort sem recer uma instancia (new)*/
            lista.sort(null); //má prática

            //FORMA LEGADA (antes da atualização implmentação do método sort()
           // Collections.sort(lista, new TitularDaContaComparator());
            Collections.reverse(lista); //maior elemento para o menor, inverte a ordenação

            //Ir na classe conta implements - ORDEM NATURAL
            Collections.sort(lista); //método que não recebe um comparator
            //Ordem Natural: qualquer objeto da lista pode definir sua própria ordem, caso ela n tenha sido definida o próprio java defini sua ordenação de acordo com ela

            System.out.println("---------");

            for (Conta conta : lista) {
                System.out.println(conta + "," + conta.getTitular().getNome()); //para saber o titular e seu nome
            }



        }

    }

    //Criar as classes para fazer a comparação

    class NumeroDaContaComparator implements Comparator<Conta> {

        @Override
        public int compare(Conta c1, Conta c2) {

            //simplificar modo 1
            //return c1.getNumero() - c2.getNumero();

            //Mais elegante
            return Integer.compare(c1.getNumero(), c2.getNumero());

            /*if(c1.getNumero() < c2.getNumero()) {
                return -1;
            }

            if(c1.getNumero() > c2.getNumero()) {
                return 1;
            }

            return 0;*/
        }
    }

    class TitularDaContaComparator implements Comparator <Conta> {

        @Override
        public int compare(Conta c1, Conta c2) {

            String nomeC1 = c1.getTitular().getNome();
            String nomeC2 = c2.getTitular().getNome();

            return  nomeC1.compareTo(nomeC2); //iguais devolve 0 / um > outro devolve -1 / maior que outr desvolve valor +1


        }
    }
}
