package classes;

public class ObjetoSimples {
    private String nome;

    public ObjetoSimples(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
