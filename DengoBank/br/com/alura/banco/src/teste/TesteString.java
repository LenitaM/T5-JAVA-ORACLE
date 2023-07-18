package teste;

//Entendendo a Classe String

public class TesteString {

    public static void main(String[] args) {

        //Objeto Literal
        String nome = "Alura"; //Não precisa usar o new, facilitação da Java
        // String são objetos e classes
        //Classe referencia = "objeto"

        int a =3;  //Objeto Literal

        String outro = new String("ALURA"); //Roda, mas considerada má prática

        //replace(char oldChar, char newChar) retorna uma String.

        String outroNome = nome.replace("A", "a"); //não funcionou
        //Tem que se criar outro obejeto
        //Tem dois objetos criados Alura e alura.

        nome.toLowerCase(); //não funcionou

        String outroNome2 = nome.toLowerCase(); //criado outro objeto; alura
        String outroNome3 = nome.toUpperCase(); //Outro objeto; ALURA




        System.out.println(nome); //Alura
        //IMUTABILIDADE: Uma vez criada uma String ela não muda mais, independente das alterações que tentar faze-la

        System.out.println(outroNome); //alura

        System.out.println(outroNome2); //alura

        //Char sequence - subistuição de várias caracteres
        String nome1 = nome.replace("Al", "aL");

        char d = 'a';

        char b = 'b';

        //CHAR (1 caractere) = Pode alterar apenas um caractere - deve usar a aspas simples ' '
        String nome2 = nome.replace(d, b);

        System.out.println("__________________________charAt()______________________________");

        //saber qual é o caractere que ocupa uma posição específica:

        char c = nome.charAt(0); //descobre onde está localizado o char
        System.out.println(c); // A
        //A contagem começa no 0

        System.out.println("__________________________indexOf()______________________________");

        /*Esse método possui muitas variantes, recebendo diferentes parâmetros.
        Usaremos o método que recebe uma String. Para o método podemos passar uma sequencia de caracteres, passaremos ur.
        Assim feito, podemos perguntar qual é a posição dessa String dentro de Alura.*/

       int pos = nome.indexOf("ur"); //posição dos caracteres u,r
        System.out.println(pos); // 2

        /*
            O método indexOf() opera de forma inversa ao charAt(),
            uma vez que aquele com base no caractere exibe sua posição,
            e este utiliza a posição para exibir o caractere.*/

        System.out.println("__________________________substring()______________________________");

        /*Existe um método que possibilita a criação de uma sub-String. Este método possui duas sobrecargas.
        A primeira informação que vamos fornecer é a partir de que posição iniciamos a contagem; colocaremos 1.*/

        String sub = nome.substring(1);
        System.out.println(sub); //lura

        System.out.println("__________________________length()______________________________");

        //Saber qual é o tamanho de uma determinada String.

        System.out.println(nome.length()); // 5

        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i)); // A l u r a - 5
        }

        System.out.println("__________________________isEmpty()______________________________");

        /*  perguntar se a String está vazia. Recebe um retorno booleano (true e false);
            Para testarmos esse método criaremos uma Stringvazia;
            lembrando que esse objeto existe, apenas não possui nenhum caractere, em uma situação real para exemplificarmos: umacString vazia pode representar um campo de formulário que não foi preenchido pelo usuário.*/

            String vazio = "";
//devolve um booleano
        System.out.println(vazio.isEmpty()); // true

        System.out.println("__________________________trim()______________________________");

        /*método para anular todos os espaços em uma String.
ele devolve uma nova apresentação, que chamaremos de outroVazio.*/

        //Removemos todos os espaços e temos efetivamente uma String vazia.

       String vazio2 = vazio.trim(); //tira os espaços do começo e fim de uma String

        System.out.println(vazio2.isEmpty()); //true

        String vazio4 =  "      Alura      ";
        String vazio5 = vazio.trim(); //alura, sem os espaços


        System.out.println("__________________________contains()______________________________");

        /*Este método verifica se uma String possui uma sub-String.
         Perguntaremos se a String vazio possui uma sub-String Alu. Devolve um valor booleano.*/

        System.out.println(vazio.contains("Alu"));//false - pq n coloquei nada
    }
}
