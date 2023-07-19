package teste;

import modelo.ContaCorrente;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5]; //Valor padrão de referencia é null
        //Nenhuma conta foi criada apenas o espaço para 5 contas

        ContaCorrente cc1 = new ContaCorrente(22, 11); //criou um objeto

        //Guardar o objeto no array

        contas[0] = cc1; //pega um cópia do valor e guarda no array.

        ContaCorrente cc2 = new ContaCorrente(33, 44);

        contas[1] = cc2;


        System.out.println(contas[1].getNumero()); //44

        System.out.println(cc2.getNumero()); //44
        //Outra forma de acessar a conta sem usar o Array como referencia.

       ContaCorrente ref = contas[1]; //cada casa (variável) é ContaCorrente
        //ref = cc2

        System.out.println(ref.getNumero()); //44

        /*FORMA LITERAL

Usar valores diretamente, menos burocrático, mais direito.

			int[] refs = {1,2,3,4,5};
Usamos as chaves {} para indicar que se trata de um array e os valores já ficam declarados dentro das chaves.
	*/


    }
}
