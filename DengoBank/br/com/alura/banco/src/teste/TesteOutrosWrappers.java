package teste;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.doubleValue());

        int valor = idadeRef.intValue(); //unboxing

        Double dRef = 3.2; //assim já faz o autoboxing
        Double dRef2 = Double.valueOf(3.2); //por debaixo dos panos

        System.out.println(dRef2.doubleValue()); //unboxing

        //Autoboxing
        Boolean bRef = Boolean.TRUE; //Contastante sempre com letra maiuscula
        //n precisa chamar o método value
        System.out.println(bRef.booleanValue()); //unboxing

        //Classe mãe: java.lang.Number
        
        Number numero = Integer.valueOf(29); //pode usar ela para integer, double, int, float, long, short, byte

        Number refNumero = Float.valueOf(29.9f); //tem que por f para float

        refNumero.shortValue(); //para saber eles em outros tipos (short,int,float entre outros Value();

        List<Number> lista = new ArrayList<>(); //Cria uma lista que aceita qualquer tipo de números

        lista.add(10); //int
        lista.add(32.6); //double
        lista.add(25.6f); //float
    }
}
