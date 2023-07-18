package modelo;

public abstract class FuncionarioAutenticavel extends Funcionario {

    private int senha = 222;


    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Podem entrar no sistema.");
            return true;
        } else {
            System.out.println("Não pode entrar no sistema.");
            return false;
        }


    }
}
