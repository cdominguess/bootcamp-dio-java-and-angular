package List;

import java.util.*;

public class ExerciciosList {
    public static void main(String[] args) {
        List<Double> arrNotas = new ArrayList<Double>(Arrays.asList(7D, 8.5, 9.3, 5D, 7D, 0D, 3.6));
        System.out.println("1 - Criar uma lista e adicionar 7 notas: " + arrNotas);

        System.out.println("2 - Exibir posição da nota 5: " + arrNotas.indexOf(5D));

        arrNotas.add(4, 8D);
        System.out.println("3 - Adicionar a nota 8 na posição 4: " + arrNotas);

        arrNotas.set(arrNotas.indexOf(5D), 6D);
        System.out.println("4 - Substituir a nota 5.0 pela nota 6.0: " + arrNotas);

        System.out.println("5 - Conferir se a nota 5.0 está na lista: " + arrNotas.contains(5D));

        System.out.println("6 - Exibir todas as notas na ordem que foram informadas: " + arrNotas);

        System.out.println("7 - Exibir a terceira nota: " + arrNotas.get(2));

        System.out.println("8 - Exibir a menor nota: " + Collections.min(arrNotas));

        System.out.println("9 - Exibir a maior nota: " + Collections.max(arrNotas));

        Iterator<Double> iterator = arrNotas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("10 - Exibir a soma dos valores: " + soma);

        System.out.println("11 - Exibir a média dos valores: " + soma / arrNotas.toArray().length);

        arrNotas.remove(arrNotas.indexOf(0D));
        System.out.println("12 - Remover a nota ZERO: " + arrNotas);
    }
}
