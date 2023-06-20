public class CriaConta {

    /* OBJETOS E INSTÂNCIAS
    *
    *
    * */

    public static void main(String[] args) {

        Conta primeiraConta = new Conta(); // new = Instanciar a Classe para criar Objetos
        //Para criar uma instância precisamos usar a palavra chave new

        primeiraConta.saldo = 200; //Valores do Atributo

        System.out.println(primeiraConta.saldo); // 200


        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo); // 200 + 100 = 300

        Conta segundaConta = new Conta(); // São objetos (instâncias) diferentes

        segundaConta.saldo = 50;

        System.out.println("Primeira conta tem " + primeiraConta.saldo);
        System.out.println("Segunda conta tem " + segundaConta.saldo);

        //Valores Default de atributos = São valores zerados, 0. Todos os atributos do java são zerados (valor default)
        //Default dp boolean = false - char = caracter 0
        System.out.println(primeiraConta.agencia); //0
        System.out.println(primeiraConta.numero); // null

        if (primeiraConta == segundaConta) {

            System.out.println("São as mesmíssima conta!");

        } else {
            System.out.println("São contas DIFERENTES");
            //São contas DIFERENTES
        }


    }
}
