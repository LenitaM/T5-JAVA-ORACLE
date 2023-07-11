/*POLIMORFISMO*/

public class ControleBonificacao {

    private double soma; //onde somaremos todas as bonificações

    public double getSoma() {
        return soma;
        //onde criaremos um método para nos devolver a soma de todas as bonificações
    }

    /*
    Apagando os outros códigos, tudo permanece funcionando,
    todos os objetos criado tudo apartir do mesmo método. Podemos usar a ref mais generica


    */
    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
//tendo em mente que temos dois métodos,
// com parâmetros diferentes, já que um é gerente e o outro é um funcionário comum
    }



}
