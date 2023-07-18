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
        //Tem ddois objetos criados Alura e alura.

        nome.toLowerCase(); //não funcionou

        String outroNome2 = nome.toLowerCase(); //criado outro objeto



        System.out.println(nome); //Alura
        //IMUTABILIDADE: Uma vez criada uma String ela não muda mais, independente das alterações que tentar faze-la

        System.out.println(outroNome); //alura

        System.out.println(outroNome2); //alura
    }
}
