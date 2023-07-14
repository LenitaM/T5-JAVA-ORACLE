public class FluxoComError {

    //Fluxo pensando nos erros da máquina virtual

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        }catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
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
        //o método 2 fica sempre dentro da pilha gerando um loop
        System.out.println("Chamada método 2");
        metodo2();
        System.out.println("Fim do método 2");
    }
}
