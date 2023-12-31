package modelo;

//Onde fica a regra de negócios:

/*A classe modelo.Conta é a mãe, e é abstrata, por sua vez, as classes modelo.ContaCorrente e modelo.ContaPoupanca a herdam.*/
public abstract class Conta extends Object  implements Comparable <Conta>{ //Implementação de uma Ordem Natural e tem generics <> comparar +1 conta

   protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta() {};

    public Conta(int agencia, int numero){ //construtor especifico
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }


    //Ordem Natural 3 passo = definir um método compareTo()
    @Override
    public int compareTo(Conta outra) {

        return Double.compare(this.saldo, outra.saldo); //dentro da classe tenho acesso ao atributo n precisa por getSaldo
    }

    public  abstract void deposita(double valor);

    //Criando a exceção
    public void saca(double valor) throws SaldoInsuficienteException { //assinar o método perigoso
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("O saldo: " + this.saldo + ". Valor a sacar: " + valor);
        }
        this.saldo -= valor;
    }


    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException { //botar throws em todos que usa saca
        this.saca(valor);
        destino.deposita(valor);

    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

    //HERANÇA = CLASSE OBJECT

    @Override
    public String toString() {
        return "Número: " + this.numero + ", Agencia: " + this.agencia + ", Saldo:  " + this.saldo;
        //agora os filhos irão mudar tb pq os dois usam o método de object toString( );
        // Não usa super pq a classe em cima da Conta é Object e ela n possuem esse método

    }

    //equals() - método que a gente construiu antes, compara referencias
    @Override //sobreescreve
    public boolean equals(Object ref) { //equals em sua contrução só recebe object
//sobreescrece o método equals da classe Object
        Conta outraConta = (Conta) ref; //precisa fazer um type cast, sair de uma ref generica para uma ref especifica

        if(this.agencia != outraConta.agencia) {
            return false;
        }
        if (this.numero != outraConta.numero) {
            return false;
        }
        return true;
    }


}
