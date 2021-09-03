package classes;

import java.util.Arrays;
import java.util.List;

public class PrincipalGenerics {
    public static void main(String[] args) {
        ObjetoNoGenerics<String> objNo1 = new ObjetoNoGenerics<>("Conteúdo do nó 01");

        ObjetoNoGenerics<Integer> objNo2 = new ObjetoNoGenerics<>(2);
        objNo1.setProximoNo(objNo2);

        ObjetoNoGenerics<List> objNo3 = new ObjetoNoGenerics(Arrays.asList("item 01", 2, "item 03"));
        objNo2.setProximoNo(objNo3);

        ObjetoNoGenerics<String> objNo4 = new ObjetoNoGenerics("Conteúdo do nó 04");
        objNo3.setProximoNo(objNo4);

        ObjetoNoGenerics<Integer> objNo5 = new ObjetoNoGenerics(5);

        System.out.println("Objetos individuais -------------------------------------------------------------");
        System.out.println("Nó 01: " + objNo1);
        System.out.println("Nó 02: " + objNo2);
        System.out.println("Nó 03: " + objNo3);
        System.out.println("Nó 04: " + objNo4);
        System.out.println("Nó 05: " + objNo5);

        System.out.println("\nReferências de objetos --------------------------------------------------------");
        System.out.println("Nó 01 individual: " + objNo1);
        System.out.println("Nó 01 pegando ref. Nó 02: " + objNo1.getProximoNo());
        System.out.println("Nó 01 pegando ref. Nó 03: " + objNo1.getProximoNo().getProximoNo());
        System.out.println("Nó 01 pegando ref. Nó 04: " + objNo1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println("Nó 01 pegando ref. Nó 05: " + objNo1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}