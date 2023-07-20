package teste;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {


        //ContaCorrente[] contas = new ContaCorrente[5]; //Valor padrão de referencia é null
        //Nenhuma conta foi criada apenas o espaço para 5 contas

        //Arrays no Object - Array mais generico
        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11); //criou um objeto

        //Guardar o objeto no array

        contas[0] = cc1; //pega um cópia do valor e guarda no array.

        ContaCorrente cc2 = new ContaCorrente(33, 44);

        contas[1] = cc2;


        System.out.println(contas[1].getNumero()); //44

        System.out.println(cc2.getNumero()); //44
        //Outra forma de acessar a conta sem usar o Array como referencia.


        /*
   ref é um objeto do tipo ContaPoupanca(), portanto, aponta para o objeto ContaPoupanca.
Por isso, queremos informar ao compilador que isso vai funcionar, que nós temos conhecimento de o código irá compilar.
Fazemos isso por meio de um cast de referências. Transformamos uma referência de um tipo mais genérico, para uma de um tipo mais específico.
Isso pode ser chamado também de type cast:
*/
        ContaPoupanca ref = (ContaPoupanca) contas[1]; //type cast = transforma a ref tipo (génerica) conta para um ref (mais especifica) tipo conta popança
        // cada casa (variável) é ContaCorrente
        //ref = cc2

        //Array que guarda qualquer tipo de ref
        Object[] referencias = new Object[5];

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        System.out.println(referencias.getNome()); //precisa fazer type cast
        //getNome() não pertence ao object.



        System.out.println(ref.getNumero()); //44

        /*FORMA LITERAL

Usar valores diretamente, menos burocrático, mais direito.

			int[] refs = {1,2,3,4,5};
Usamos as chaves {} para indicar que se trata de um array e os valores já ficam declarados dentro das chaves.
	*/




    }
}
