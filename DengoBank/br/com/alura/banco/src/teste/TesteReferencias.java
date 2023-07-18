package teste;/*POLIMORFISMO

o polimorfismo, vimos que se trata de um objeto que pode ser referenciado por uma referência de mesmo tipo, ou genérica. Ou seja, se temos um objeto modelo.Gerente(),
 a referência pode ser tanto do tipo modelo.Gerente, quanto do tipo modelo.Funcionario.


 Referências de tipos de classes mais genéricas referenciem objetos mais específicos.


1 - objetos não mudam de tipo;
2 - a referência pode mudar, e aí entra o polimorfismo;
3 - o polimorfismo permite usar referências mais genéricas para a comunicação com um objeto;
4 - o uso de referências mais genéricas permite desacoplar sistemas.
 */


import modelo.ControleBonificacao;
import modelo.Designer;
import modelo.EditorVideo;
import modelo.Gerente;

public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Marcos");
        g1.setSalario(5000);

        String nome = g1.getNome();

        System.out.println(nome); //Marcos

        //Outra forma de chamar uma variável



        //a variável é do tipo modelo.Funcionario, ela não é mais do tipo modelo.Gerente, e sim do tipo mais genérico.

        //Se buscar o método autentica em g3 dará um erro pq o método não tem na super classe

        //A isso, damos o nome de polimorfismo. Temos um mesmo objeto, do tipo modelo.Gerente,
        // mas há duas formas possíveis de chegarmos a este objeto, dois tipos diferentes de referência.

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g1);


        System.out.println(controle.getSoma()); //5500


        ;

        System.out.println(controle.getSoma()); //5700

        EditorVideo ev = new EditorVideo();

        ev.setSalario(2500.0);

        controle.registra(ev);

        System.out.println(controle.getSoma()); //6050

        Designer d1 = new Designer();
        d1.setSalario(2000);

        controle.registra(d1);

        System.out.println(controle.getSoma());//6250.0
    }
}
