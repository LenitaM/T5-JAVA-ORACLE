package teste;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        int[] idade = new int[5]; //Array tipo primitivo

        String[] nomes = new String[5]; //Array de Referências

        List numeros = new ArrayList(); //ArrayList, LinkedList, Vector
        //Em List só existe coleções de referencias

        /*Autoboxing
        *
        * Transformação de primitivo para objeto, feita de forma automatica pelo Java.
        * */
        //Tipo Primitivo
        int idade = 29; //Cria em objeto automaticamente
        //para cada tipo primitivo existe um tipo na Orientação a Objetos, uma classe que representa os tipos primitivos. exemplo: int = Integer

        //Por debaixo dos panos
        //Como criar um objeto usando o Integer
        Integer idadeRef = Integer.valueOf(29); //Wrappers .valueOf() = método de buscar o valor de...
        //Ao invés de criar um objeto (new) delegar a função para um método
        List <Integer> numeros2 = new ArrayList<Integer>();

        numeros2.add(idadeRef);

    }
}
