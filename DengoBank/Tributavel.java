public interface Tributavel {
    //não precisa usar o abstract já que a interface só aceita metodos abstratos

    public abstract double getValorImposto();
    //o método nesse caso sempre será public abstract, por isso é comum que nem se escreva isso no código, ele compila normalmente, já que é o padrão da interface.


}
