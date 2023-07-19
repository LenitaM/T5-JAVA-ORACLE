package teste;

public class TesteArrayDePrimitivos {
//Arrays Tipo de dado[ ]
    public static void main(String[] args) {

//Primeira estrutura de dados: Arrays
        int [] idades = new int [5]; //0 - Inicializa o array com os valores padrões
        //Arrays são objetos
// estruturas de dados: formas mais enxutas de armazenamento de dados

        //Inserindo dados
        idades[0] = 29;
        idades[1] = 28;
        idades[2] = 23;
        idades[3] = 45;
        idades[4] = 32;

        //Posição das variavéis

       int idade4 = idades[4];

        System.out.println(idade4); //32

        //Tamanho de um array
        System.out.println(idades.length); //5

        //Array dentro de um laço
        for(int i = 0; i < idades.length; i++) {

            idades[i]= i * i; //2 x 2
        }

        for(int i = 0; i < idades.length; i++) {

            System.out.println(idades[i]);
        }

//32, 5, 0, 1, 4, 9, 16









    }
}
