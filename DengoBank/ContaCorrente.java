public class ContaCorrente extends Conta {

    //Construtores não são herdados, tem que contruí-los.

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    /*  HERANÇA
    1 - Quando uma classe herda de outra, ela recebe também seus atributos:
    herdamos os atributos (o objeto é criado baseado em todos os atributos da hierarquia).

    2 - Quando uma classe herda de outra, ela recebe também seus métodos.

    3 -Quando uma classe herda de outra, ela NÃO recebe seus construtores automaticamente:
    pois recebe apenas seus métodos e atributos. Lembra-se não tem herança de construtores.
    * */

    //REESCRITA DE CÓDIGO

    @Override //Anotação de sobreescrever um método
   // É usada para sobrescrever o método da classe mãe, indicando que o método original foi alterado.
    public boolean saca(double valor) { //para reescrista o nome do metodo deve ser igual
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
