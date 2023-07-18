package teste;

import modelo.Cliente;
import modelo.Gerente;

public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente nico = new Gerente();
//Uma classe abstrata representa um conceito, algo abstrato, e o compilador não permite instanciar um objeto dessa classe.
// Para instanciar é preciso criar primeiro uma classe filha não abstrata.
        nico.setNome("Nico Spook");
        nico.setCpf("122.303.456-22");
        nico.setSalario(3000);

        System.out.println(nico.getNome()); //Nico Spook
        System.out.println(nico.getBonificacao());//300.0

        Cliente cliente = new Cliente();


    }
}
