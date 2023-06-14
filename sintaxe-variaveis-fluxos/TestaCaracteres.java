public class TestaCaracteres {

    public static void main (String [] args) {

        //CHAR - guarda apenas 1 caracteres, +1 não compila /char < int < double/
        char letra = 'A'; //formato pra usar char
        System.out.println(letra);

        char valor = 66; //representa a letra B / 65 = a
        System.out.println(valor);

        valor = (char) (valor + 1);
        System.out.println(valor);

        //STRING = Não é primitiva
        String palavra = "Alura curso online de tecnologia"; //formato
        System.out.println(palavra);

        //CONCATENAÇÃO
        palavra = palavra + 2020;
        System.out.println (palavra);


    }
}
