public abstract class Funcionario { //todo funconario possui um cargo, mas são todos funcionarios.
    // Para n perder s beneficios da herança usa o abstract
    //abstract relacionado a herança
    //Só filhos podem criar novos objetos
    //Não podem ser instanciadas. Para instanciar, devemos criar primeiro uma classe filha não abstrata.

    private String nome;
    private String cpf;
    protected double salario; //Public para os filhos, mas outras classes não

    private int senha;

    /*  private < protected < public

A palavra chave com a menor visibilidade é private, depois vem o protected e depois public.

private - apenas visível dentro da classe

protected - visível dentro da classe e também para as filhas

public - visível em todo lugar

Repare também que protected na classe filha (Gerente) é relacionado com a herança.

    * */

    public Funcionario() {} //construtor
    //um construtor é chamado na inicialização/criação do objeto.
    // podemos adicionar vários construtores na classe, desde que ele defiram na quantidade ou tipo de parâmetros.
    //se não criamos um construtor, o compilador insere o construtor padrão.
    //O construtor padrão (default) é aquele que não recebe nenhum parâmetro.

     public abstract double getBonificacao(); //Métodos abstract, n pode instanciar objetos nessa classes
    //método sem corpo, não há implementação (mas os filhos tem implementações nesse método)

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    /*
    * Sobre herança em Java, julgue as seguintes afirmativas:

1) Uma classe pode ter várias filhas, mas apenas uma mãe.

2) A partir de uma instância de uma classe filha, podemos chamar qualquer método público que tenha sido declarado na classe mãe.

3) Na classe filha, podemos escolher o que herdar da classe mãe. =
* A afirmativa 3 está errada, não podemos escolher o que pode ser herdado por outra classe. Além disso, a afirmativa 1 está correta.

4) No exemplo abaixo, Cachorro também herda tudo da classe Animal:
class Animal {
    // atributos e métodos
}

class Mamifero extends Animal {
    // atributos e métodos
}

class Cachorro extends Mamifero {
    // atributos e métodos
}

* DIFERENÇA ENTRE PRIVATE x PROTECTED

atributos e métodos protected podem ser visto pelas próprias classes e suas filhas...
Porém, com private apenas a própria classe enxerga os atributos/métodos.

*/

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}
