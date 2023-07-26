package teste;

import java.util.*;

//Iterator

/*existem muitas coleções.
Só nesse treinamento vimos ArrayList, LinkedList e Vector.
Se você assistir ainda o curso dedicado as coleções você aprenderá as interfaces para fila (Queue),
conjunto (Set) e mapa (Map) cada uma com várias implementações.

Como posso acessar (iterar) todas essas implementações de maneira uniforme sem saber os detalhes de cada implementação:

"caixa de padrões de projeto" e se chama Iterator.

Uma Iterator é um objeto que possui no mínimo dois métodos:
hasNext()e next().
Ou seja, você pode usá-lo para perguntar se existe um próximo elemento e pedir o próximo elemento.
 A notícia boa é que isso funciona com TODAS as implementações e aí a grande vantagem.
* */

public class TesteIterator {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

       // iterar com filas, conjuntos ou mapas. Veja o uso do Iterator através de um conjunto:
        Set<String> nome = new HashSet<>();
        nome.add("Super Mario");
        nome.add("Yoshi");
        nome.add("Donkey Kong");

        Iterator<String> it2 = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
