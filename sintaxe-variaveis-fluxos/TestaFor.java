public class TestaFor {

    /*FOR
    O for oferece a possibilidade de haver uma variável que participa de todas as iterações,
    que é o que precisamos, mas depois do for, ela deixa de valer.

Não é melhor usarmos o while, então? Depende. Muitas vezes queremos utilizar a variável temporariamente, somente dentro do laço,
e é por isso que o for é mais atrativo, e se adequa melhor a este tipo de caso.
No entanto, while e for são intercambiáveis, e inclusive existe outro laço, denominado do-while.
    *
    * */

    public static void main(String[] args) {

        //declaração da variável; condição do laço; contador
        for(int contador = 0;  contador <= 10; contador++ ){

            System.out.println(contador); // 1 a 10
        }
    }
}
