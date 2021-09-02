package Set;

import java.util.*;

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
 *
 * Dadas as séries, crie e ordene a lista
 * nome: GOT, gênero: fantasia, tempoEpisodio: 60
 * nome: Dart, gênero: drama, tempoEpisodio: 60
 * nome: That '70s show, gênero: comédia, tempoEpisodio: 25
 */
public class ExerciciosOrdenacaoSet {
    public static void main(String[] args) {
        Set<Serie> arrSeriesHash = new HashSet<>(){{
            add(new Serie("GOT", "fantasia", 60));
            add(new Serie("Dart", "drama", 60));
            add(new Serie("That '70s show", "comédia", 25));
        }};
        System.out.println("1 - Exibir séries em ordem aleatória (HashSet): " + arrSeriesHash);

        Set<Serie> arrSeriesLinked = new LinkedHashSet<>(){{
            add(new Serie("GOT", "fantasia", 60));
            add(new Serie("Dart", "drama", 60));
            add(new Serie("That '70s show", "comédia", 25));
        }};
        System.out.println("\n2 - Exibir séries em ordem de inserção (LinkedHashSet): " + arrSeriesLinked);

        Set<Serie> arrSeriesTree = new TreeSet<>(){{
            add(new Serie("GOT", "fantasia", 60));
            add(new Serie("Dart", "drama", 60));
            add(new Serie("That '70s show", "comédia", 25));
        }};
        System.out.println("\n3 - Exibir séries em ordem natural por tempo de episódio (TreeSet): " + arrSeriesTree);
    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "\n{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                "}";
    }

    @Override
    public int compareTo(Serie o) {
        int compararTempo = Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
        if (compararTempo != 0) return compararTempo;

        return this.getGenero().compareToIgnoreCase(o.getGenero());
    }
}