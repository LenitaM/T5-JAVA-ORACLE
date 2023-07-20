package util;

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(11,22);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(33, 44);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(44, 55);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(55, 66);
        lista.add(cc4);

        Conta cc5 = new ContaCorrente(55, 66);
        //Verifica se já tem dados iguais
        boolean existeAMesmaConta = lista.contains(cc5); // false - é outra referencia, contains funciona como um laço

        System.out.println("Já existe a conta agência 55 número 66? " +existeAMesmaConta); //true
//Já existe a conta agência 55 número 66? true, com o equals na classe Conta como regra de négocio



        //Contains faz um laço, verifica se já tem referencias iguais
        /*for(Conta contaIgual : lista) {
            if(contaIgual.ehIgual(cc5)) { //implementar dentro desse método na classe mãe Conta onde fica as refras de negocios
                System.out.println("Já tenho essa conta.");
            } //Já tenho essa conta.
        }*/

        //.contains() - Pode perguntar se já contem elementos
        boolean existe = lista.contains(cc2);
        System.out.println("Já existe? " + existe); // true


        System.out.println(lista.size()); // 4

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());//22

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size()); //3

        for(Conta conta : lista) {
            System.out.println(conta);
            /*  ContaCorrente: 44
                ContaCorrente: 55
                ContaCorrente: 66 */
        }






    }

}
