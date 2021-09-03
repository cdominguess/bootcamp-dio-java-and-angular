package classes;

/**
 * Classe para instanciar objetos do tipo Nó e seu encadeamento (referência para o próximo objeto de Nó)
 */
public class ObjetoNo {
    // Conteúdo do nó
    private String conteudo;

    // Referência do objeto anterior para o próximo objeto de nó - o último SEMPRE será null
    private ObjetoNo proximoNo;

    public ObjetoNo(String conteudo) {
        this.conteudo = conteudo;

        // Garante que ao instanciar o objeto Nó, a referência para o próximo será null (útil na última instância por exemplo)
        this.proximoNo = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public ObjetoNo getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(ObjetoNo proximoNo) {
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
