package teste;

//Ordenando Listas

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(11,22);
        cc1.deposita(333.0);

        Conta cc2 = new ContaCorrente(22,33);
        cc2.deposita(444.4);

        Conta cc3 = new ContaCorrente(33,44);
        cc3.deposita(111.0);

        Conta cc4 = new ContaCorrente(44,55);
        cc4.deposita(222.0);

        List <Conta> lista = new ArrayList<>();

        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        /*O código agora compila, e com isso, estamos ordenando nossa lista, com base em nosso critério - que é a numeração das contas.

            Em seguida, testaremos nosso código.
            Para isso, criaremos dois laços, um antes e outro depois da comparação.*/

        //laço antes da comparação - foreach (:) = para cada
        for (Conta conta:lista) {
            System.out.println(conta);
        }

       AgenciaDaContaComparator comparator = new AgenciaDaContaComparator();
         //Ordenação de listas
        lista.sort(comparator); //entrou no java.8 sort(comparator); comparator é o críterio de ordenação

        System.out.println("_____________Depois da ordenação___________________");

        //depois para teste
        for (Conta conta:lista) {
            System.out.println(conta);
        }
    }
}

//Criar uma classe para fazer o teste no mesmo arquivo

 class AgenciaDaContaComparator implements Comparator  <Conta> {

    //implementar o método da interface

    @Override
    public int compare(Conta c1, Conta c2) { //ideia do método é definir se uma conta é maior que a outra: pode ser baseado no saldo, agencia etc

        if(c1.getNumero() < c2.getNumero()) {

            return -1; //e o número da conta c1 for inferior ao da c2, nosso retorno será um valor negativo
        }
        if(c1.getNumero() > c2.getNumero()) {
            return  1; //Evidentemente que, se c1 é maior que c2, então devemos ter um resultado positivo.
        }

        return 0;
    }
}