public class Teste {
    //ENUM = usado para definir constantes: botões, estações do ano, status de um pedido

    public static void main(String[] args) {

        Prioridades pMin = Prioridades.MIN;
        Prioridades pMax = Prioridades.MAX;

        System.out.println(pMin.name());//MIN
        System.out.println(pMax.name()); //MAX

        //Indica a posição que foi escrita
        System.out.println(pMin.ordinal()); //0
        System.out.println(pMax.ordinal()); //2








        /*Thread t = new Thread(() -> System.out.println("rodando..."));

        t.setPriority(Thread.MAX_PRIORITY);
        //definir prioridades, existem três tipos: max_priority/ min_priority / norm_priority

        t.start();*/
    }
}
