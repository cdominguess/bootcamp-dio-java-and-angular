package Map;

import java.util.*;

/*
 * Particularidades da interface Map
 * - Diferente de List e Set, não estende da Interface Collection;
 * - Elementos únicos: cada chave possui um valor, que pode ser um dado ou objeto;
 *
 * +------------------------------------------ + -------------------------------------- + -------------------------------------- +
 * | HashMap                                   |  LinkedHashMap                         |  TreeMap                               |
 * + ------------------------------------------|----------------------------------------|----------------------------------------|
 * | Indicado: Uso geral, recuperação rápida   | Indicado: Pode ser usado para cache,   | Indicado: Algoritmos em que os recursos|
 * | não sincronizado. ConcurrentHashMap pode  | LRU, outros lugares onde a inserção    | de classificação ou navegação são ne-  |
 * | ser usado onde a simultaneidade envolvida | ou o pedido de acesso são importantes  | essários. Por exemplo, encontre na lis-|
 * |                                           |                                        | ta de funcionários cujo salário é pró- |
 * |                                           |                                        | ximo ao funcionário.                   |
 * + ------------------------------------------|----------------------------------------|----------------------------------------|
 * | Não mantém a ordem dos elementos          | Mantém a ordem de inserção dos elemen- | Mantém a ordem natural conforme o tipo |
 * |                                           | tos                                    | dos elementos inseridos .              |
 * + ------------------------------------------|----------------------------------------|----------------------------------------|
 * | Permite chave null                        | Permite chave null                     | Chaves nulas não permitidas se a chave |
 * |                                           |                                        | usar ordenação natural ou o Comparador |
 * |                                           |                                        | não oferecer suporte à comparação em   |
 * |                                           |                                        | chaves nulas.                          |
 * + ------------------------------------------|----------------------------------------|----------------------------------------|
 *
 * Dadas as informações de carros e respectivos consumos, crie Maps e siga os exercícios:
 * modelo: gol - consumo: 14,4 Km/l
 * modelo: uno - consumo: 15,6 Km/l
 * modelo: mobi - consumo: 16,1 Km/l
 * modelo: hb20 - consumo: 14,5 Km/l
 * modelo: kwid - consumo: 15,6 Km/l
 */
public class ExerciciosMap {
    public static void main(String[] args) {
        Map<String, Double> arrHashMapCarros = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwwid", 15.6);
        }};
        System.out.println("1 - Criar um dicionário que relacione os modelos e seus respectiovos consumos: " + arrHashMapCarros);

        arrHashMapCarros.put("uno", 15.2);
        System.out.println("2 - Substituir o consumo do gol por 15,2 Km/l: " + arrHashMapCarros);

        System.out.println("3 - Conferir se o modelo tucson está no dicionário: " + arrHashMapCarros.containsKey("tucson"));

        System.out.println("4 - Exibir o consumo do uno: " + arrHashMapCarros.get("uno"));

        System.out.println("5 - Exibir o terceiro modelo adicionado: ");

        System.out.println("6 - Exibir os modelos: " + arrHashMapCarros.keySet());

        System.out.println("7 - Exibir os consumos: " + arrHashMapCarros.values());

        /*
         * Monta um array para interação do tipo Set, através do ,entrySet() do HashMap
         * É a única maneira de interagir em um loop onde possa ter acesso a chave e valor do elemento na interação ao mesmo tempo
         */
        Set<Map.Entry<String, Double>> arrDados = arrHashMapCarros.entrySet();
        System.out.println("8 - array de dados dos modelos: " + arrDados);

        // Recupera o valor de consumo mais eficiente para comparação
        Double consumoMaisEficiente = Collections.max(arrHashMapCarros.values());
        System.out.println("8.1 - Consumo mais eficiente: " + consumoMaisEficiente);

        // Percorre este array para exibir o mais eficiente
        for (Map.Entry<String, Double> dados : arrDados) {
            if (dados.getValue() == consumoMaisEficiente) {
                System.out.println("8.2 - Exibir o modelo mais econômico e seu consumo: " + dados.getKey() + " (" + dados.getValue() + ")");
            }
        }

        // Recupera o valor de consumo MENOS eficiente para comparação
        Double consumoMenosEficiente = Collections.min(arrHashMapCarros.values());
        System.out.println("9 - Consumo MENOS eficiente: " + consumoMenosEficiente);

        // Percorre este array para exibir o MENOS eficiente
        for (Map.Entry<String, Double> dados : arrDados) {
            if (dados.getValue() == consumoMenosEficiente) {
                System.out.println("9.1 - Exibir o modelo MENOS econômico e seu consumo: " + dados.getKey() + " (" + dados.getValue() + ")");
            }
        }

        Iterator<Double> iteratorValores = arrHashMapCarros.values().iterator();
        Double soma = 0d;
        while (iteratorValores.hasNext()) soma += iteratorValores.next();
        System.out.println("10 - Exibir a soma dos consumos: " + soma);

        System.out.println("11 - Exibir a média dos consumos: " + soma / arrHashMapCarros.size());

        Iterator<Double> iteratorValores2 = arrHashMapCarros.values().iterator();
        while (iteratorValores2.hasNext()) if (iteratorValores2.next() == 15.6) iteratorValores2.remove();
        System.out.println("12 - Remover modelos cujo consumo = 15,6 Km/l: " + arrHashMapCarros);

        Map<String, Double> arrLinkedHashMapCarros = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwwid", 15.6);
        }};
        System.out.println("13 - Exibir na ordem que foram informados: " + arrLinkedHashMapCarros);
    }
}
