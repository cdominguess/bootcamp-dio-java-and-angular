package classes;

public class Principal {
    public static void main(String[] args) {
        ObjetoNo objNo1 = new ObjetoNo("Conteúdo do nó 01");

        ObjetoNo objNo2 = new ObjetoNo("Conteúdo do nó 02");
        objNo1.setProximoNo(objNo2);

        ObjetoNo objNo3 = new ObjetoNo("Conteúdo do nó 03");
        objNo2.setProximoNo(objNo3);

        ObjetoNo objNo4 = new ObjetoNo("Conteúdo do nó 04");
        objNo3.setProximoNo(objNo4);

        ObjetoNo objNo5 = new ObjetoNo("Conteúdo do ÚLTIMO nó 05");

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