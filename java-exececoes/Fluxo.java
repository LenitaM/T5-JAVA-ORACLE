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
    * */

    public static void main(String[] args) {

        System.out.println("Inicio do main");
        metodo1(); //só compila a partir de uma referencia
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
