package util;

//Aprendendo sobre java.util

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {

    //Guardador de Contas usando o java.util

    public static void main(String[] args) {

        //Como não misturar Classes e guardar um só tipo referências, exemplo: conta, cliente etc
        // < > = uma classe generics, após espcificar deixa de ser genérica
        ArrayList <Conta> lista = new ArrayList<Conta>(); //Guardador de Referencias
        //Não vai deixar mais guardar outro tipo de classe



        Conta cc = new ContaCorrente(11,22);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(33, 44);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(44, 55);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(55, 66);
        lista.add(cc4);

        //.size() para saber quantos elementos o array guardou
        System.out.println(lista.size()); //2

        //.get() Para pegar um elemento, para pegar uma Conta
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero()); //11

        //.remove Para remover elementos
        lista.remove(0); // remove 22

        //Quantos elementos tem depois de remover o elemento 0
        System.out.println("Tamanho: " + lista.size()); //Tamanho: 1 (antes de add outras contas)

        /*Outras Funcionalidades*/

    //Fazer um laço e acessar cada elemento dentro do Array
        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i); //forma maior pq ele pega do Object a referencia
            System.out.println(oRef); // vai imprimir cada conta
            /*  ContaCorrente: 44
                ContaCorrente: 55
                ContaCorrente: 66*/
        }


        //Outra forma de fazer o Array de forma mais simples
        for(Conta conta : lista) { //for, que a cada iteração nos retornará um Object: desta lista
            // Para cada elemento do tipo Object desta lista, queremos que seja impresso o seu valor
            System.out.println(conta);
            /*/*  ContaCorrente: 44
                ContaCorrente: 55
                ContaCorrente: 66*/
        }

        //Lista com capacidade pré definida
        ArrayList listaComLimite = new ArrayList(26); //capacidade inicial
        //A lista continua dinâmica, mas o tamanho do array inicial é de 26!

        //Lista a partir de outra
        ArrayList listaComLimite2 = new ArrayList(26); //capacidade inicial
       // lista.add(cc5); //apenas para fins demonstrativos
       // lista.add(cc5);
//outros estados
        ArrayList novaLista = new ArrayList(lista); //criando baseado na primeira lista


    }
}
