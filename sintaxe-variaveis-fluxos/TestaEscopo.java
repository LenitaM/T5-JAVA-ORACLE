public class TestaEscopo {

    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;

        //boolean acompanhado = quantidadePessoas >= 2; //só pode true ou false, ele é true

        boolean acompanhado; // valor default não tem, precisa ser declarada para ser false ou true.

        if(quantidadePessoas >=2) {
            acompanhado = true; //só vale no bloco {} que ela foi declarada, ta inicizalizado aqui
        }else {
            acompanhado = false; //sem o false n foi inicializada
        }

        System.out.println("Valor acompanhado = " + acompanhado); // true

        if (idade >= 18 && acompanhado) {

            System.out.println("Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("infelizmente voce nao pode entrar");
        }

    }
}
