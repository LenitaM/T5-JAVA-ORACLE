package teste;

import modelo.Gerente;

public class GerenteTeste {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Maria"); //todos herdados de modelo.Funcionario
        g1.setCpf("234.574.875-22");
        g1.setSalario(5000);

        System.out.println(g1.getNome()); //Maria
        System.out.println(g1.getCpf()); //234.574.875-22
        System.out.println(g1.getSalario()); //5000

        g1.setSenha(123456);

        boolean autenticacao = g1.autentica(123456); //método apenas no modelo.Gerente
        //true pq adicionamos uma senha para o gerente, caso n fizermos o get e set a senha inicial é 0 pq n ese=pecificamos

        System.out.println(autenticacao);//

        System.out.println(g1.getBonificacao()); //6000
    }
}
