package teste;

import modelo.Autenticavel;
import modelo.Cliente;
import modelo.Gerente;

public class TesteGerente {

    public static void main(String[] args) {

        //O modelo.Gerente também é um modelo.Autenticavel. Podemos tornar ainda mais genérico, trocando o nome para referencia:

            Autenticavel referencia = new Cliente();


        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

//      g1.setSenha(2222);
//      boolean autenticou = g1.autentica(2222);

//      System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
    }
}
