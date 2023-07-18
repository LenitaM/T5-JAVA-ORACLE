package modelo;

public class CalculoImpostor {

    public void registra(Tributavel t) {
        //Todos que implementaram a interface modelo.Tributavel podem ser utilizados, por meio deste método.

        double valor = t.getValorImposto();
    }
}
