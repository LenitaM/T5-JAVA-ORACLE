public class TestaConversao {

    public static void main (String[] args) {

        /*Não compila
        *
        * double salario = 1270.5;
        int valor = salario;
        * */


        /*COMPILA
        int salario = 1200;
        double valor = salario;
         */

        //CONVERSÃO DE VALORES (CASTING)

        double salario = 1270.5;
        int valor = (int) salario;

        System.out.println(valor); // 1270 (só a parte inteira


        /*OUTRA VARIAVEIS NUMERICAS


        * INTEIROS
            INT x = 32 bits +- 2 bilhoes
            LONG = 64 bits +- 2 bilhões²
            long numeroGrande = 87768563009L; (precisa marcar)

            SHORT x = 16 bits 2131;
            BYTE x = 127; arquivos binários.

        * DECIMAIS

        FLOAT = 32 bits
        float x = 3.14f - tem que usar o f;
        DOUBLE = 64 bits - não é bom usar para salários.


DE/PARA	byte	short	char	int	long	float	double
byte	----	Impl.	(char)	Impl.	Impl.	Impl.	Impl.
short	(byte)	----	(char)	Impl.	Impl.	Impl.	Impl.
char	(byte)	(short)	----	Impl.	Impl.	Impl.	Impl.
int	(byte)	(short)	(char)	----	Impl.	Impl.	Impl.
long	(byte)	(short)	(char)	(int)	----	Impl.	Impl.
float	(byte)	(short)	(char)	(int)	(long)	----	Impl.
double	(byte)	(short)	(char)	(int)	(long)	(float)	----

TIPO	TAMANHO
boolean	1 bit
byte	1 byte
short	2 bytes
char	2 bytes
int	    4 bytes
float	4 bytes
long	8 bytes
double	8 bytes

       */



    }
}
