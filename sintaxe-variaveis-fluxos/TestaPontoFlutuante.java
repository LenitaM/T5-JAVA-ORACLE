public class TestaPontoFlutuante {

    /*DOUBLE = VARIÁVEL PONTO FLUTUANTE (DECIMAIS) E INTEIROS
    *
    * */

    public static void main (String[] args){

        double salario;
        salario = 1250.50;

        System.out.println("Meu salário é " + salario);

        double idade = 37;

        double divisao = 3.14 / 2; // 1.57
        System.out.println(divisao);

        int outraDivisao = 5 / 2; // 2 - Ele vai contar só os números inteiros
        System.out.println(outraDivisao);

        double outraTentativaDivisao = 5 / 2; // 2.0 - double vai contar os decimais tb (ele vai ler a operação primeiro para depois por em double
        System.out.println(outraTentativaDivisao);

        /*
        5) Lembre-se que não podemos colocar um valor com ponto flutuante dentro de uma variável do tipo int, teste:

        double salario = 1250.70;

        System.out.println(salario);

        int valor = 12.5;             //não compila.

        int valor2 = 0.0;             //não compila.

        double teste = 125.50;        // compila

        int valor3 = teste;           //não compila.

         */

    }
}
