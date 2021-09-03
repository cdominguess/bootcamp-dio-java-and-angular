package classes;

/*
 * Contexto de Generics:
 * - Evitar casting excessivo;
 * - Evitar códigos redundantes;
 * - Encontrar erros em tempo de compilação;
 * - Foi introduzido no Java 5
 *
 * Sintaxe:
 *      public class Lista<T> {
 *          private T atributoDoTipoT;
 *      }
 *
 * Convenções
 *      K para "Key", exemplo: Map<K,V>
 *      V para "Value", exemplo: Map<K,V>
 *      E para "Element", exemplo List<E>
 *      T para "Type", exemplo: Collections#addAll
 *      ? quando genérico, aceita qualquer tipo
 */

/**
 * Classe para instanciar objetos do tipo Nó e seu encadeamento (referência para o próximo objeto de Nó)
 * Agora definindo um Type Generics para aceitar conteúdos de qualquer tipo de dado
 */
public class ObjetoNoGenerics<T> {
    // Conteúdo do nó
    private T conteudo;

    // Referência do objeto anterior para o próximo objeto de nó - o último SEMPRE será null
    private ObjetoNoGenerics<T> proximoNo;

    /**
     * Construtor da classe
     * @param conteudo
     */
    public ObjetoNoGenerics(T conteudo) {
        this.conteudo = conteudo;

        // Garante que ao instanciar o objeto Nó, a referência para o próximo será null (útil na última instância por exemplo)
        this.proximoNo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public ObjetoNoGenerics getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(ObjetoNoGenerics proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "{" +
                "conteudo='" + conteudo + '\'' +
                //", proximoNo=" + proximoNo +
                '}';
    }
}