package teste;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        int[] idades = new int[5]; //Array tipo primitivo

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

        /*MÉTODOS DA CLASSE INTEGER*/

        //Por debaixo dos panos
        //Como criar um objeto usando o Integer
        //Autoboxing
        Integer idadeRef = Integer.valueOf(29); //Wrappers .valueOf() = método de buscar o valor de..., para criar um objeto a partir do primitivo
        //Ao invés de criar um objeto (new) delegar a criação para um método


        System.out.println(idadeRef.doubleValue()); //transforma em outros primitivos

        System.out.println(Integer.MAX_VALUE); //2147483647 - saber quanto de valor um Integer pode guardar

        System.out.println(Integer.MIN_VALUE); // - 2147483647  = saber o valor minino que um Integer pode guardar

        System.out.println(Integer.SIZE); //32 bytes = descobrir o tamanho do Integer

        System.out.println(Integer.BYTES); //Se quisermos saber a quantidade de bytes, utilizamos o BYTES

        


        //Pode chamar métodos agora, a partir dessa referencia
        //Unboxing
        int valor = idadeRef.intValue(); //tendo o objeto, método para saber qual o primitivo foi criado

        String s = args[0]; //recebe um valor númerico, assim vem como string "10"
        //Transformar o String em inteiro
        Integer numero3 = Integer.valueOf(s);
        System.out.println(numero3); //12 transformou a string em um inteiro s = 12


        int numero4 = Integer.parseInt(s); //Método da String e transforma em primitivo
        System.out.println(numero4);//12





        List <Integer> numeros2 = new ArrayList<Integer>();

        numeros2.add(29); //Autoboxing
       // numeros2.add(Integer.valueOf(29)); - internamente é isso que ele faz

    }
}
