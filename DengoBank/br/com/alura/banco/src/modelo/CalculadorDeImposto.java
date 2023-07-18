package modelo;

//modelo.CalculadorDeImposto => FQN (Full Qualified Name) usado para se referir a arquivos de outras packges
public class CalculadorDeImposto {

    private double totalImposto;

    public void registra(Tributavel t) {

        double valor = t.getValorImposto();
        this.totalImposto += valor;

    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
