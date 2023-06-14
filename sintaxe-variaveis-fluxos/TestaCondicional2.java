public class TestaCondicional2 {
    //CONDICINAIS OPERADORES || (OU) E && (E) e BOOLEAN
    //Os operadores lógicos devem ter no lado esquerdo e direito uma expressão booleana.

    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;

        boolean acompanhado = quantidadePessoas >= 2; //só pode true ou false, ele é true

        System.out.println("Valor acompanhado = " + acompanhado); // true

        if (idade >= 18 && acompanhado) {

                System.out.println("Você tem mais que 18 anos");
                System.out.println("Seja bem vindo");
        } else {
                System.out.println("infelizmente voce nao pode entrar");
            }

        }
    }
