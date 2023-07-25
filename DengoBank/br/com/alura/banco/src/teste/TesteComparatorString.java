package teste;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteComparatorString {

    //Código omitido

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

            NumeroDaContaComparator comparator = new teste.NumeroDaContaComparator();

            System.out.println("---------");

            for (Conta conta : lista) {
                System.out.println(conta);
            }

            lista.sort(comparator);

        }

    }

    class NumeroDaContaComparator implements Comparator<Conta> {

        @Override
        public int compare(Conta c1, Conta c2) {

            if(c1.getNumero() < c2.getNumero()) {
                return -1;
            }

            if(c1.getNumero() > c2.getNumero()) {
                return 1;
            }

            return 0;
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
