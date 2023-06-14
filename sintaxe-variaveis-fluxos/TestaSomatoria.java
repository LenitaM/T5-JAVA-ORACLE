public class TestaSomatoria {

    public static void main(String[] args) {

        int contador = 0;
        int total = 0; //sempre precisa inicializar
        //precisa ser fora para ele guarda cada resultado, caso o total esteja dentro do while ele volta para 0, reinicializando
        while(contador <= 10) {


            //total = total + contador;
            total += contador;

            System.out.println(total); //teste
            contador++;
        }
    }
}
