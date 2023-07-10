public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public Funcionario() {} //construtor
    //um construtor é chamado na inicialização/criação do objeto.
    // podemos adicionar vários construtores na classe, desde que ele defiram na quantidade ou tipo de parâmetros.
    //se não criamos um construtor, o compilador insere o construtor padrão.
    //O construtor padrão (default) é aquele que não recebe nenhum parâmetro.

    public double getBonificacao() {
        return this.salario * 0.1;
    }

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
}
