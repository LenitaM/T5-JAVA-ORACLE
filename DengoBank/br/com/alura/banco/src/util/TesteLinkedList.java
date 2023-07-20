package util;

import modelo.Conta;
import modelo.ContaCorrente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Olhar as anotações

/*Ele não utiliza um array internamente.

2 - Isso significa que, quando falamos de List nem sempre estamos lidando com arrays.
 Uma lista significa, simplesmente, que estamos armazenando elementos em sequência, ou seja, o primeiro elemento adicionado também é o primeiro que será retornado. Além disso, temos um índice, e métodos que trabalham com ele. Por exemplo, o método get(), que podemos utilizar para obter determinado elemento de uma posição em particular.

3 - No LinkedList temos estas mesmas características, sequência, ordem de inserção e índice.
Entretanto, ela não funciona com um array internamente.

4 -  lista duplamente encadeada:
Seu funcionamento ocorre da seguinte forma: ao adicionarmos, por exemplo, cc1 e, em seguida, cc2, ela se lembrará do elemento que foi adicionado anteriormente, ou seja, cc2 se lembra de cc1, cc3 de cc2, e assim por diante

5 - Isso será complicado, uma vez que há duplicidade de diversos métodos, como add(), contains(), size(), remove() e equals()

Ponto negativo

Temos que iniciar no primeiro elemento,
e verifica-los sucessivamente, até atingirmos o ponto onde não há mais continuidade.
Diferentemente do array, não temos como acessar uma determinada posição diretamente.
Se quisermos, por exemplo, acessar a posição 3, temos que iniciar na primeira e seguir, até atingirmos a desejada.
Isso faz com que a iteração seja algo negativo na LinkedList.
*/

public class TesteLinkedList {

    public static void main(String[] args) {

        //todos aqueles que pretendem ser uma lista, devem contar com um método add() de alguma forma, o mesmo para o remove()
       List<Conta> lista = new ArrayList<Conta>(); //Lista java.util
       //Isso nos leva à conclusão de que existe uma interface para isso, ela se chama List

        /*Ou seja, estamos utilizando a interface para definirmos o tipo da referência.
         Dentro da interface, podemos observar a existência de diversos métodos, uns que já conhecemos mas muitos outros que ainda nem exploramos.
        Por fim, alteraremos o LinkedList de volta para ArrayList*/

        Conta cc = new ContaCorrente(11, 22);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(33, 44);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(44, 55);
        lista.add(cc3);

        //.size() para saber quantos elementos o array guardou
        System.out.println(lista.size()); //2

        //.get() Para pegar um elemento, para pegar uma Conta
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        //.remove Para remover elementos
        lista.remove(0);

        //Quantos elementos tem depois de remover o elemento 0
        System.out.println("Tamanho: " + lista.size());

        /*Outras Funcionalidades*/

        //Fazer um laço e acessar cada elemento dentro do Array
        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        for (Conta conta : lista) {
            System.out.println(conta);

        }
    }
    }
