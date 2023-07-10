
/*
* 1 - ao herdar, a classe filha ganha todas as características (atributos) e todas as funcionalidades (métodos) da classe mãe
2 - conhecemos o primeiro benefício da herança: Reutilização do código
* */
public class Gerente extends Funcionario { //extends = herda atributos do funcionario
    //Herda todas as características da classe Funcionario.
    //Herda todo o comportamento da classe Funcionario.
    //É um Funcionario.

    private int senha;

    public Gerente() { //Construtor
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        }else {
            return false;
        }
    }

    public double getBonificacao() { //Reescrita, redefinição do método na super classe na classe
        return super.getBonificacao() + super.salario; //Precisa ir na super classe mãe e não está definindo na classe filha
        //reaproveita o método da classe mãe
        //Em private pode pegar o slario, sem usar o protected: super.getSlario();
    }
/*sobrescrita é um conceito importante na herança,
pois permite redefinir um comportamento previsto na classe mãe através da classe filha.
* */

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    /*      SOBRECARGA DO MÉTODO
    Existe um outro conceito nas linguagens OO que se chama de sobrecarga que é muito mais simples do que a sobrescrita e nem dependente da herança.
    * */
    //novo método, recebendo dois parametros
    public boolean autentica(String login, int senha) {
        //implementacao omitida
    } /*Repare que criamos uma nova versão do método autentica.
    Agora temos dois métodos autentica na mesma classe que variam na quantidade ou tipos de parâmetros.
    Isso se chama sobrecarga de métodos.

A sobrecarga não leva em conta a visibilidade ou retorno do método, apenas os parâmetros e não depende da herança.*/


}



