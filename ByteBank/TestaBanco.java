public class TestaBanco {

    public static void main(String[] args) {

        Cliente paulo = new Cliente();

        paulo.nome = "Paulo Veras";
        paulo.cpf = "111.111.111 -11";
        paulo.profissao = "Eletricista";

        Conta contaDoPaulo = new Conta();

    contaDoPaulo.deposito(100);

    //Associa o cliente paulo a conta do paulo
    contaDoPaulo.titular = paulo; //Composição dos objetos (junção de duas classes)

        System.out.println(contaDoPaulo.titular.nome); //Paulo Veras

        System.out.println(contaDoPaulo.titular.profissao); //Eletricista

    }


}
