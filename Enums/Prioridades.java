public enum Prioridades {

    MIN(1),NORMAL(5),MAX(10);

    private int valor;

    Prioridades(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }


}
