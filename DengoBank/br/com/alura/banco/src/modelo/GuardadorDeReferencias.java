package modelo;

public class GuardadorDeReferencias {

    //Classe para guardar referencias genericas

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias () {
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }


    public void adiciona(Object ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    //Criando o método de tamanho
    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    //Método das posisições do elementos
    public Object getReferencias(int posicao) {
        return this.referencias[posicao];
    }
}
