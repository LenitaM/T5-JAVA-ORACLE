public class TestaWhile {
    /*WHILE
    *
    * O while aceita receber dois valores, true e false. O valor true mantém o loop em execução, já o false o finaliza.
    *
    * while é possível utilizar qualquer operador de comparação (< [menor], > [maior], <= [menor ou igual],
    * >= [maior ou igual], == [igual a] e != [diferente de]) e qualquer operador lógico (&& [and], || [ou]).
    * */

    public static void main(String[] args) {

        int contador = 0; //precisa declarar a variável antes
        //recebe um boolean
        while(contador < 10) {
            System.out.println(contador);
            //contador = contador + 1;
           // contador += 1;
            contador ++; // 0 a 9
        }

        System.out.println(contador); // 10
    }

}
