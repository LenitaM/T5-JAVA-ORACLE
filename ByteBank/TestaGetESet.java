public class TestaGetESet {

    public static void main(String[] args) {

        Conta conta = new Conta(1337, 24566);

    // n precisa mais - conta.setNumero(1337); //alterou o número da conta

        System.out.println(conta.getNumero()); //visualiza o numero da conta

    Cliente paulo = new Cliente();

    conta.setTitular(paulo);

    paulo.setNome("Paulo de Almeida"); // Agora é paulo de almeida

        //Ver o nome do Titular
        System.out.println(conta.getTitular().getNome()); //Paulo de Almeida
        //forma dele chegar até a o bloco de info armazenada

        //Altera
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Aposentado");

        System.out.println(titularDaConta); //Paulo Veras

    }
}
