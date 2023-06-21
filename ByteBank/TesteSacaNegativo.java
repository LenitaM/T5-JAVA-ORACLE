public class TesteSacaNegativo {

    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.deposito(100);

        conta.saque(200);

        System.out.println(conta.saque(200)); //N saca, false

        //Sempre trabahar com os métodos e NUNCA com os atributos

        //Depois de criar o método
        System.out.println(conta.verSaldo());
    }
}
