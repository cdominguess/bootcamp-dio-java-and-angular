package Set;

import java.util.*;

public class ExerciciosSet {
    public static void main(String[] args) {
        /*
         * Particularidades da interface Set
         * - Não permite elementos duplicados;
         * - Não possui índice: sem métodos .get(), .indexOf(), .set(), etc e qualquer método que passe um índice como no List;
         *
         * +-------------------------------------- + -------------------------------------- + -------------------------------------- +
         * | HashSet                               |  LinkedHashSet                         |  TreeSet                               |
         * + --------------------------------------|----------------------------------------|----------------------------------------|
         * | Internamente usa HashMap para armaze- | Internamento utiliza LinkedHashMap pa- | Internamente utiliza TreeMap para arma-|
         * | nar elementos.                        | ra armazenar elementos.                | zenar elementos.                       |
         * + --------------------------------------|----------------------------------------|----------------------------------------|
         * | Não mantém a ordem dos elementos      | Mantém a ordem de inserção dos elem.   | Mantém a ordem natural conforme o tipo |
         * |                                       |                                        | dos elementos inseridos .              |
         * + --------------------------------------|----------------------------------------|----------------------------------------|
         * | Não mantém a ordem dos elementos      | Mantém a ordem de inserção dos elem.   | Mantém a ordem natural conforme o tipo |
         * |                                       |                                        | dos elementos inseridos .              |
         * + --------------------------------------|----------------------------------------|----------------------------------------|
         * | Mais performático                     | Performance entre HashSet e TreeSet    | Menos performático                     |
         * + --------------------------------------|----------------------------------------|----------------------------------------|
         * | Permite máximo UM elemento null       | Permite máximo UM elemento null        | Permite NENHUM elemento null           |
         * + --------------------------------------|----------------------------------------|----------------------------------------|
         */

        Set<Double> arrHashSetNotas = new HashSet<>(Arrays.asList(7D, 8.5, 9.3, 5D, 7D, 0D, 3.6));
        System.out.println("1 - Criar uma lista e adicionar 7 notas: " + arrHashSetNotas);

        System.out.println("2 - Adicionar a nota 8 na posição 4: os tipos de Set não resolvem nesse caso, pois não tem como acessar posição de elementos.");

        System.out.println("3 - Substituir a nota 5 pela nota 6: os tipos de Set não resolvem nesse caso, pois não tem como acessar posição de elementos.");

        System.out.println("4 - Conferir se a nota 5 está na lista: " + arrHashSetNotas.contains(5d));

        System.out.println("5 - Exibir a terceira nota adicionada: os tipos de Set não resolvem nesse caso, pois não tem como acessar posição de elementos.");

        System.out.println("6 - Exibir a menor nota: " + Collections.min(arrHashSetNotas));

        System.out.println("7 - Exibir a maior nota: " + Collections.max(arrHashSetNotas));

        Double soma = 0d;
        Iterator<Double> iterator = arrHashSetNotas.iterator();
        while (iterator.hasNext()) soma += iterator.next();
        System.out.println("8 - Exibir a soma das notas: " + soma.floatValue());

        System.out.println("8 - Exibir a média das notas: " + soma / arrHashSetNotas.size());

        arrHashSetNotas.remove(0d);
        System.out.println("9 - Remover a nota ZERO: " + arrHashSetNotas);

        System.out.println("10 - Remover a nota da posição ZERO: os tipos de Set não resolvem nesse caso, pois não tem como acessar posição de elementos.");

        Iterator<Double> iterator2 = arrHashSetNotas.iterator();
        while (iterator2.hasNext()) if (iterator2.next() < 7) iterator2.remove();
        System.out.println("11 - Remover as notas menores que 7: " + arrHashSetNotas);

        // TreeSet mantem a ordem natural dos elementos
        Set<Double> arrTreeSetNotas = new TreeSet<>(Arrays.asList(7D, 8.5, 9.3, 5D, 7D, 0D, 3.6));
        System.out.println("12 - Exibir as notas em ordem crescente: " + arrTreeSetNotas);

        arrHashSetNotas.clear();
        System.out.println("13 - Apagar toda a lista: e conferir se a lista está vazia: " + arrHashSetNotas.isEmpty());
    }
}
