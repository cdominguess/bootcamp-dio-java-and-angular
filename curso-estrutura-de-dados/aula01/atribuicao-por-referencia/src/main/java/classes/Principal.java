package classes;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Testando atribuição por referência em tipos primitivos, onde SEMPRE copiamos o valor em memória:");
        int numA = 1;
        int numB = numA;
        System.out.println("numA: " + numA + " - numB: " + numB);

        numA = 2;
        System.out.println("numA após alt numA: " + numA + " - numB após alt numA: " + numB + " (numB não se altera, pois quando atribuído por referência foi feita uma cópia inicial de numA)");

        System.out.println("\nTestando atribuição por referência em objetos, onde SEMPRE copiamos o valor de referência em memória SEM duplicar o objeto:");
        ObjetoSimples obj1 = new ObjetoSimples("Carlos");
        ObjetoSimples obj2 = obj1;
        System.out.println("Obj1: " + obj1 + " - Obj2: " + obj2);

        obj1.setNome("Anderson");
        System.out.println("Obj1 após alt Obj1: " + obj1 + " - Obj2 após alt Obj1: " + obj2 + " (Houve alteração do Obj2, pois na atribuição inicial foi feita uma cópia da referência em memória do Obj1)");
    }
}
