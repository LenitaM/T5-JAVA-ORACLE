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
        int idade = 29; //Cria em objeto automaticamente
        //para cada tipo primitivo existe um tipo na Orientação a Objetos, uma classe que representa os tipos primitivos. exemplo: int = Integer

        //Por debaixo dos panos
        Integer idadeRef = new Integer(29);
        List <Integer> numeros2 = new ArrayList<Integer>();

        numeros2.add(idadeRef);

    }
}
