public class MultiplosDeTresAteCem {
    public static void main (String[] args) {
        for (int i = 1; i < 100; i++ ){
            if (i % 3 == 0)    {
                // % = e utilizar numero % 3 para descobrir o resto da divisão de um número por 3 (o operador % se chama de módulo).
                System.out.println(i);
            }
        }

        //OU

        for(int i = 3; i < 100; i+=3) {
            System.out.println();
        }
    }
}
