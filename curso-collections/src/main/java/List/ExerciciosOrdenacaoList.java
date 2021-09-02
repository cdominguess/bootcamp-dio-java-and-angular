package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciciosOrdenacaoList {
    public static void main(String[] args) {
        /*
         * Dadas as seguintes informações, criar e ordenar uma lista.
         * Gato 01: nome Jon, idade 18, cor preto
         * Gato 02: nome Simba, idade 6, cor tigrado
         * Gato 02: nome Jon, idade 12, cor amarelo
         */
        List<Gato> arrGatos = new ArrayList<>();
        arrGatos.add(new Gato("Jon", 18, "preto"));
        arrGatos.add(new Gato("Simba", 6, "tigrado"));
        arrGatos.add(new Gato("Jon", 12, "amarelo"));

        System.out.println("1 - Imprimir na ordem de inserção:" + arrGatos);

        Collections.shuffle(arrGatos);
        System.out.println("2 - Imprimir em ordem aleatória:" + arrGatos);

        Collections.sort(arrGatos);
        System.out.println("3 - Imprimir em ordem natural (Nome):" + arrGatos);

        /*
         * Para comparar por idade, necessário criar uma classe implementando o comparator
         * e sobrescrevendo o método compareTo. Feito isso aqui passa no order o array de objetos para comparação
         * e uma instância da classe de comparação criada.
         */
        Collections.sort(arrGatos, new CompararPorIdade());
        System.out.println("4 - Imprimir em ordem natural (Idade):" + arrGatos);

        Collections.sort(arrGatos, new CompararPorNome());
        System.out.println("5 - Imprimir em ordem natural (Cor):" + arrGatos);

        Collections.sort(arrGatos, new CompararPorNomeCorIdade());
        System.out.println("5 - Imprimir em ordem natural (Nome, Cor, Idade):" + arrGatos);
    }
}

/**
 * Ao implementar a classe comparable, sobrescrever o método compareTo e passar o this.nome seguido do próximo nome
 */
class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}

class CompararPorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class CompararPorNome implements Comparator<Gato> {
    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}

class CompararPorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato o1, Gato o2) {
        int compararNome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (compararNome != 0) return compararNome;

        int compararCor = o1.getCor().compareToIgnoreCase(o2.getCor());
        if (compararCor != 0) return compararCor;

        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}