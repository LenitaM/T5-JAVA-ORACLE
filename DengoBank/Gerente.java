
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

    /*public double getBonificacao() {
        return this.salario;
    }
    */

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}



