
/*Design da conta
* TIPO conta: salfo, agencia, numero e titular
*
* CLASSE:
*
* Uma classe é uma especificação de um tipo, definindo atributos e comportamentos.
* */
public class Conta {

//o PAI n pode ser alterado, ela é a matriz. Apenas os seus objetos.

        //Atributos são características que especificam uma Classe
        private double saldo; //não pode ser modificado, nem lido só apenas a Classe que ela é destinada
        private int agencia;
        private int numero;

        private static int total; //Static é um atributo da classe n do objeto


        /* Evitar o NEW, toda vez que abre uma conta aparece um novo cliente

        Cliente titular = new Cliente();
         */
        private Cliente titular;  //Referenciar outra Classe
//valores padrão dos objetos são 0, salve casos de especificações como cada conta tem uma caracteristica especifica

        //COMPORTAMENTO DO OBJETO (Métodos): Maneira de fazer alguma coisa
        //depósito saque e transferência

   //CONSTRUTOR


    public Conta(double saldo, int agencia) {//pode receber parametros
        //rotina de inicialização do código
        this.saldo = saldo;
        this.agencia = agencia;
        Conta.total ++; //Atributo da classe

        System.out.println("O total de contas é " + Conta.total);

    }

    public void deposito(double valor) { //void = não retorna resposta nenhum

                this.saldo += valor;
                //this.saldo = this.saldo + valor;

        }

        //RETORNANDO VALORES

        public boolean saque(double valor) { //n tem método dentro de método. Eles são irmãos
                if (this.saldo >= valor) {
                        //se tem saldo suficiente
                        this.saldo -= valor;
                        return true; //retorna quem invoca o método
                } else {
                        return false;
                }
        }

        public boolean transferencia(double valor, Conta destino) {

                if (this.saldo >= valor) {
                        this.saldo -= valor;
                        destino.deposito(valor);
                        return true;
                } else {
                        return false;
                }
        }

        //Fazer um metodo para o saldo ser lido

       public double verSaldo() {
                return this.saldo;
       } //Só vizualiza por segurança, regras de negócio.

        public double getSaldo() { //Visualizar as informações dos atributos
                return this.saldo;
        }

        //Encapsulamenteo - GETTER E SETTER

        public int getNumero() {
                return this.numero;
        }

        public void setNumero(int novoNumero) {

            if(novoNumero <= 0) {
                System.out.println("Não pode número menor ou igual a 0.");
                return;
            }

            this.numero = novoNumero; //pode ter condições
        }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia (int agencia) {
            if(agencia <= 0) {
                System.out.println("Não pode valor menor que 0.");
                return;
            }
            this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getTotal() {
        return total;
    }
}
