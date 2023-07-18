package teste;

//Usando a classe Object

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteObject {

    public static void main(String[] args) {

        System.out.println("x");
        System.out.println(3);
        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(22, 333); //menos abrangente
        Conta cp = new ContaPoupanca(44, 222);
        //o objeto define qual método será chamado
        Object c = new Cliente(); //mais abrangente

        System.out.println(cc.toString()); //Tem métodos que foram implmentados pela classe object. Como .toString() - Reutilização de código;
        System.out.println(cp); //pode passar qualquer tipo de referência

        println();

        println(cc); //foi criado um método
        //passou uma classe mais genérica como Object

        System.out.println(cc.toString()); //ContaCorrente: 333

    }

    //Sobrecarga: vários métodos podem ser escritos com o mesmo comando, parametros diferentes
    static void println() {

    }

    static void println(int a) {

    }

    static void println(boolean valor) {

    }

    static void println(Object conta) {
        //Object é o topo de todas as classes. Reutilização de código e polimorfismo.
        // É a referência mais génerica que tem.

    }





}
