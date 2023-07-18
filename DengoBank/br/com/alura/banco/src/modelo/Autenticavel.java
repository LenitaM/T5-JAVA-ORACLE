package modelo;//contrato modelo.Autenticavel
//quem assinar esse contrato precisa implementar
//metodo setSenha
//metodo autentica


public abstract interface Autenticavel {
    //na interface não pode ter nada concreto

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

    /*Anteriormente, definimos nossa própria interface e, como vimos, ela não possui um código concreto.
    Não é possível definir um atributo dentro de uma, o código simplesmente não compila.
    Da mesma forma, nenhum método poderá ter uma implementação.

    Uma interface só define métodos, as regras destes devem ser definidas nas classes que a implementem.

    Todas as classes que a implementarem terão a obrigação de implementar os métodos setSenha() e autentica().

    Se quisermos somente uma solução pura de polimorfismo, podemos utilizar a interface.

    Mas e se quisermos somente a reutilização de código, é recomendado utilizar a herança?
    Não, a herança é recomendada quando há a combinação das necessidades de reutilização de código e polimorfismo.
    */
}
