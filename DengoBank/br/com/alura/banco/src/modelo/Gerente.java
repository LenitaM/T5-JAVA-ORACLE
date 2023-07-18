package modelo;
/*
* 1 - ao herdar, a classe filha ganha todas as características (atributos) e todas as funcionalidades (métodos) da classe mãe
2 - conhecemos o primeiro benefício da herança: Reutilização do código
* */

/*Podemos interpretar este código como "a classe modelo.Gerente é um modelo.Funcionario,
herda da classe modelo.Funcionario, assina o contrato Auntenticavel, e é um modelo.Autenticavel".*/
public class Gerente extends Funcionario implements Autenticavel { //extends = herda atributos do funcionario
    //Herda todas as características da classe modelo.Funcionario.
    //Herda todo o comportamento da classe modelo.Funcionario.
    //É um modelo.Funcionario.

    private int senha;
    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }


    public double getBonificacao() { //Reescrita, redefinição do método na super classe na classe
        return super.getSalario(); //Precisa ir na super classe mãe e não está definindo na classe filha
        //reaproveita o método da classe mãe
        //Em private pode pegar o slario, sem usar o protected: super.getSlario();
    }
/*sobrescrita é um conceito importante na herança,
pois permite redefinir um comportamento previsto na classe mãe através da classe filha.
* */

    /*      SOBRECARGA DO MÉTODO
    Existe um outro conceito nas linguagens OO que se chama de sobrecarga que é muito mais simples do que a sobrescrita e nem dependente da herança.
    //novo método, recebendo dois parametros
    public boolean autentica(String login, int senha) {
        //implementacao omitida
    }
    Repare que criamos uma nova versão do método autentica.
    Agora temos dois métodos autentica na mesma classe que variam na quantidade ou tipos de parâmetros.
    Isso se chama sobrecarga de métodos.
    A sobrecarga não leva em conta a visibilidade ou retorno do método, apenas os parâmetros e não depende da herança.
     */

    //INTERFACES

    //modelo.Gerente é modelo.Funcionario e assina modelo.Autenticavel;

    @Override
    public void setSenha(int senha) {

        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
    /*
1 - Criamos uma nova classe, chamada AutenticacaoUtil;
2 - As classes modelo.Cliente, modelo.Administrador e modelo.Gerente as utilizam, esse relacionamento se chama composição;
*/

}



