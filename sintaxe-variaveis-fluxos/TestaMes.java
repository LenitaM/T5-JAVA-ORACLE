public class TestaMes {
    // existe o comando switch, onde podemos colocar todas as opções ou rumos que o nosso programa pode tomar.

    public static void main(String[] args) {

        int mes = 10;

        switch (mes) {
            case 1: //opção 1
                System.out.println("O mês é Janeiro");
                break; //O break irá interromper a execução do caso que o contém, para as outras condições não serem analisadas e executadas.
            case 2:
                System.out.println("O mês é Fevereiro");
                break;
            case 3:
                System.out.println("O mês é Março");
                break;
            case 4:
                System.out.println("O mês é Abril");
                break;
            case 5:
                System.out.println("O mês é Maio");
                break;
            case 6:
                System.out.println("O mês é Junho");
                break;
            case 7:
                System.out.println("O mês é Julho");
                break;
            case 8:
                System.out.println("O mês é Agosto");
                break;
            case 9:
                System.out.println("O mês é Setembro");
                break;
            case 10:
                System.out.println("O mês é Outubro");
                break;
            case 11:
                System.out.println("O mês é Novembro");
                break;
            case 12:
                System.out.println("O mês é Dezembro");
                break;
            default: //Se nenhuma condição for aceita, o código do default é que será executado. Por exemplo, se o mes for 13, a impressão será Mês inválido.
                System.out.println("Mês inválido");
                break;
        }
    }
}