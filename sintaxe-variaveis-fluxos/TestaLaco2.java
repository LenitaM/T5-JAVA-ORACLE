public class TestaLaco2 {

    public static void main(String[] args) {
        for(int linha = 1; linha < 10; linha++ ) {

            for(int coluna = 0; coluna < 10; coluna++) {

                if(coluna > linha) { //chaves n são obrigatórias se tiver UM comando apenas
                    break; //vai quebrar o laço e ir para a linha 13 e voltar para for fazendo a matriz triangular
                   // irá interromper apenas o laço de repetição mais interno que o contém.
                }

                System.out.print("*");
            }
            System.out.println(); //colunas
        }
    }
}
