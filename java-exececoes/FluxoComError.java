public class FluxoComError {

    //Fluxo pensando nos erros da máquina virtual

    public static void main(String[] args) { //Ou aqui o método checked
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (Exception  ex) { //Adc aqui Só exception captura todas as exceções que possam acontecer
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do método main");
    }

    private static void metodo1()  throws MinhaExcecao {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do método1");
    }

    private static void metodo2() throws MinhaExcecao {// O compilador só deixa compilar caso vc especifique a exceção
        System.out.println("Inicio do metodo2");
//Não basta instanciar a exceção, é necessário lançá-la através do throw.
        //tipo da variável é uma exceção
        throw new MinhaExcecao("Deu errado"); // throw = lança a bomba na pilha
        //Só funciona com exceções.
        //sai abruptamento do fluxo.
        // System.out.println("Fim do método2");
    }
}
