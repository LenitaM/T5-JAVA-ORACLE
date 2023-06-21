public class TestaMetodo {

    public static void main(String[] args) {

        //Invocar o metódo
        //Classe(precisa ser o nome da classe) e nome da variável, geralmente sempre iguais
        Conta contaDoPaulo = new Conta();

        contaDoPaulo.saldo = 100;

        contaDoPaulo.deposito(50); //estrutura de invocação do metódo

        System.out.println(contaDoPaulo.saldo); //150



        boolean conseguiRetirar = contaDoPaulo.saque(20);
        System.out.println(conseguiRetirar); //true

        System.out.println("Novo saldo da conta do Paulo: " + contaDoPaulo.saldo); //130;


        Conta contaDaMarcela = new Conta();

        contaDaMarcela.deposito(1000);

boolean sucessoTransferencia = contaDaMarcela.transferencia(3000, contaDoPaulo);

        if (contaDaMarcela.transferencia(300, contaDoPaulo)) {

            System.out.println("Transferência realizada com sucesso"); //compila esse
        } else {
            System.out.println("Transferência não realizada.");
        }


        System.out.println(contaDaMarcela.saldo); //700

        System.out.println(contaDoPaulo.saldo); //430 - tranferência da marcela

        //COMPOSÇÃO DOS OBJETOS


        //contaDoPaulo.titular = "Paulo Veras";
       // System.out.println(contaDoPaulo.titular); //Paulo Veras

    }
}
