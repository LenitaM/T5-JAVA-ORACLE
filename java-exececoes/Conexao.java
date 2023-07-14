public class Conexao implements AutoCloseable { //Nova atualização java pede para implementar o autocloseable

    public Conexao() { //Constructor
        System.out.println("Abrindo conexao");
        throw new IllegalStateException(); //jogando uma bomba na construção do constructor
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException(); //Exceção padrão: indica que o objeto tem estado inconsistente
    }

   // public void fecha() {} //Quando se abre conexção com banco de dados ele precisa sempre fechar


    //Criar o método close
    @Override
    public void close() { //  nesse método pode tirar o throws Exception
        System.out.println("Fechando conexao");
    }
}