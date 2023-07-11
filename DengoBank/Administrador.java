public class Administrador extends  Funcionario implements Autenticavel{

    //Administrador é Funcionario e assina Autenticavel;
    private int senha;
    private AutenticacaoUtil autenticador;

    public Administrador() {
        this.autenticador = new AutenticacaoUtil();
    }


    @Override
    public double getBonificacao() {
        return 50;
    }

       /*
1 - Criamos uma nova classe, chamada AutenticacaoUtil;
2 - As classes Cliente, Administrador e Gerente as utilizam, esse relacionamento se chama composição;
*/

    @Override
    public void setSenha(int senha) {

        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
       return this.autenticador.autentica(senha);
    }
}
