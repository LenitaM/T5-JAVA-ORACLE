package modelo;

public class GuardadorDeContas {
 //Pra saber a quantidade de elementos dentro de um array
    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas () {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }


    public void adiciona(Conta ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    //Criando o método de tamanho
    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    //Método das posisições do elementos
    public Conta getReferencias(int posicao) {
        return this.referencias[posicao];
    }
}

