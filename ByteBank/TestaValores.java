public class TestaValores {

    //Consistência
    public static void main(String[] args) {

        Conta conta = new Conta(1337, 24566); //sempre passa por um construtor
        //Restrigir e especificar ações

//A conta está incosistente com as regras de negócios por causa de default


        System.out.println(conta.getAgencia()); //0 = valour default, eles são zerados
        //Com um construtor agora alterou a agencia e numero

        // STATIC

        Conta conta2 = new Conta(1337, 17659);
        Conta conta3 = new Conta(1335, 17659);

        System.out.println(conta2.getTotal());



    }



}
