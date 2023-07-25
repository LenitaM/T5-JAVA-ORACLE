package modelo;

/**
 *
 */
/* Como documentar projetos em java:
*
* Classe que representa um cliente no ByteBank
*
* @author Lenita Maciel
* @version 0.1
* */
public class Cliente implements Autenticavel {
    //Implements: Utilizamos este termo somente quando queremos herdar algo de outra classe,
    // mas com a interface estamos "assinando um contrato", isto significa no mundo Java que estamos implementando


    /*Como ela assinou o contrato, agora precisa cumprir a obrigação,
    que é de implementar os métodos setSenha() e autentica().*/
    private int senha;

    private String nome;
    private AutenticacaoUtil util;
    //Com isso, eliminamos a necessidade da existência do atributo senha
    /*o modelo.Cliente chamar a senha, quem guardará esta informação não será diretamente a própria classe, e sim a AutenticacaoUtil.
    No autenticador, chamaremos o util, desta forma, utilizamos o seu setSenha. Isso significa que delegamos a chamada - o método não foi embora, mas a implementação, que era concreta, agora foi delegada*/


    /**
     *
     */
    public Cliente() {
        this.util = new AutenticacaoUtil();
    }
    /*      COMPOSIÇÃO
 1 - Criamos uma nova classe, chamada AutenticacaoUtil;
 2 - As classes modelo.Cliente, modelo.Administrador e modelo.Gerente as utilizam, esse relacionamento se chama composição;
 3 - O relacionamento de composição difere do relacionamento de herança, naquele, há uma interdependência onde a existência de um depende da do outro, já na composição, cada classe existe independentemente.
 4 - Isso significa que, quando queremos fazer apenas a reutilização de código, podemos utilizar a composição. Teoricamente, podemos trabalhar sem a herança com o Java.
 */
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
       return this.util.autentica(senha);
    }

    //obrigamos o modelo.Cliente a ter uma senha e um método autentica().
    // Quem for modelo.Autenticavel, deverá implementar estes métodos.

/*
Ao passo em que só é possível fazer com que uma classe herde apenas uma outra classe,
 podemos fazer com que sejam "assinados" tantos "contratos" quanto necessário,
ou seja, não há limite para o número de implementações.*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
