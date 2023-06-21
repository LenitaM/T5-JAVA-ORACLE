public class TestaBancoSemCliente {

    public static void main(String[] args) {

        /*  NULL
         *
         * Referência para lugar nenhum, quando vc n faz associção das classes Conta e Cliente.
         * Não foi populada.
         *
         * N tem objeto dentro de objeto, classe dentro de classe, são FLECHAS de Associação.
         *
         *
         * Formas de tirar o null:
         * */

        //NULL
        Conta contaDaMarcela = new Conta();

        System.out.println(contaDaMarcela.titular); //NULL pq n fez a associação

        contaDaMarcela.titular = new Cliente(); //Aqui faz a associção e retira o NULL

        contaDaMarcela.titular.nome = "Marcela"; //Sem associação essa linha aqui daria NULL

        System.out.println(contaDaMarcela.titular.nome); //Marcella


    }
}
