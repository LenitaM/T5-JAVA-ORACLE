public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        }catch(ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do método main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do método1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");
//Não basta instanciar a exceção, é necessário lançá-la através do throw.
        //tipo da variável é uma exceção
        throw new ArithmeticException("Deu errado"); // throw = lança a bomba na pilha
        //Só funciona com exceções.
        //sai abruptamento do fluxo.
       // System.out.println("Fim do método2");
    }
}
