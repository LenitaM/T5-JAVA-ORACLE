public class TesteReferencias {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

//REFERÊNCIAS VS OBJETOS
        //Primeira conta é uma referência ao Objeto, uma flecha

        Conta segundaConta = primeiraConta; //São referências do mesmo lugar
        //Como a primeiraConta é uma flecha, essa linha vai armazenar o cod de memória dessa "flecha"
        System.out.println(segundaConta); //Conta@7cca494b
        System.out.println("O saldo da segunda conta: " + segundaConta.saldo); //300
        //Não tem duas contas apenas 1 pq não foi criado um NEW para criar um novo objeto.

        segundaConta.saldo += 100;
        System.out.println(segundaConta.saldo); // 400

        System.out.println(primeiraConta.saldo); // 400

        // Verificar se a primeira conta é == a segunda conta

        if (primeiraConta == segundaConta) {

            System.out.println("São as mesmíssima conta!");
            //São as mesmíssima conta!
        }
    }
}
