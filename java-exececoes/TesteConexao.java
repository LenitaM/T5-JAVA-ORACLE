public class TesteConexao {

    public static void main(String[] args) {

        //Nova forma de lidar com exceções feitas no constructor

        try(Conexao conexao = new Conexao()) {
                conexao.leDados();
        } //Fechando conexão
        //esse bloco inteiro condiz com o método antigo
        catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão");
        }
//try - finally é incompatível sem o catch, o catch precisa ocorre



        /*__________________________________Método Antigo________________________________________*/

        Conexao con = null;

        try {
            con = new Conexao();
            con.leDados();

        }
        catch(IllegalStateException ex) { //Obrigatório ter um catch ou finally
            //pode ter vários catches
            System.out.println("Deu erro na conexão");
        }
        //só pode ter 1 finally
        finally { //comando opcional que fecha com uma exceção
            //caso n queira capturar o erro, fazer um catch, só quer garantir que a conexão seja fechada
            if(con != null) { //Forma antiga de lidar com finally em exceções no constructor
                con.close(); }
            //sempre vai reproduzido no console, mesmo se a exceção não for capturado
        }
    }

    /*BLOCO FINALLY
O bloco finally é opcional quando há bloco catch.

O bloco finally sempre será executado (sem ou com exceção).

O bloco finally é tipicamente utilizado para fechar um recurso como conexão ou transação. */
}
