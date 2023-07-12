public class Fluxo {
    /*PILHA DE EXECUÇÃO
    *
 Método usado para o java para organizar e criar uma ordem de execução dos métodos.

1 - Para saber qual método está sendo executado.
2 - Para organizar a execução dos métodos.

Uma pilha Java faz parte da JVM e armazena os métodos que estão sendo executados.
Além do bloco de código a pilha guarda as variáveis e as referências desse bloco.
* Assim a JVM organiza a execução e sabe exatamente qual método está sendo executado que é sempre o método no topo da pilha.
A JVM também sabe quais outros precisam ser executados ainda, que são justamente os métodos abaixo.


       BLOCO TRY-CATCH

    1 -  A lógica de tratamento de erro no bloco catch só é disparada quando uma exceção é lançada dentro de um bloco try.
    2 - Para tratarmos uma exceção,
    que pode ocorrer enquanto nosso programa esta sendo executado,
    precisamos tratá-la antecipadamente com um bloco de código específico.

     */

    public static void main(String[] args) {

        //Podem ter quantos catch quiser contanto que todos sejam especificados
        System.out.println("Inicio do main");//só compila a partir de uma referencia
        try {
            metodo1();

        } catch (ArithmeticException | NullPointerException ex){ //Esse catch n vai funcionar no outro erro pq ele é especifico
           //String msg = ex.getMessage(); //mensagem original
           //System.out.println("AritmeticException" + msg);
           ex.printStackTrace(); //Vai imprimir no console os rastros da pilha que estão em execução
//Pode ser assim:
        } catch(NullPointerException ex) { //Null - A exceção mais comum na programação
            String msg = ex.getMessage(); //getMessage() - Tem em toda exceção
            System.out.println("NullPointerException" + msg);
        } //Agora o catch o fluxo permace
        System.out.println("Fim do main");
    }

        private static void metodo1() {
            System.out.println("Inicio do metodo1");
            metodo2();
            System.out.println("Fim do metodo1");
        }

        private static void metodo2() {
            System.out.println("Inicio do metodo2");
            for(int i = 1; i <= 5; i++) {
                System.out.println(i);
               // try {//algo cauteloso e definidor de bloco, uma exceção ao fluxo
                   int a = i / 0;
               // } catch(ArithmeticException ex) { //Pega o nome dessa exceção dentro do fluxo
                  //  System.out.println("ArithmeticException");
               // }
                Conta c = null;
                c.deposita(); //Linha problemática pq n tem objeto.

            }
            System.out.println("Fim do metodo2");
        }
        /*
        Ordem de execução do terminal
Inicio do main
Inicio do metodo1
Inicio do metodo2
1
2
3
4
5
Fim do metodo2
Fim do metodo1
Fim do main
*/
}
