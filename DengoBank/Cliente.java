public class Cliente implements Autenticavel {
    //Implements: Utilizamos este termo somente quando queremos herdar algo de outra classe,
    // mas com a interface estamos "assinando um contrato", isto significa no mundo Java que estamos implementando


    /*Como ela assinou o contrato, agora precisa cumprir a obrigação,
    que é de implementar os métodos setSenha() e autentica().*/
    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    //obrigamos o Cliente a ter uma senha e um método autentica().
    // Quem for Autenticavel, deverá implementar estes métodos.

/*
Ao passo em que só é possível fazer com que uma classe herde apenas uma outra classe,
 podemos fazer com que sejam "assinados" tantos "contratos" quanto necessário,
ou seja, não há limite para o número de implementações.*/
}
