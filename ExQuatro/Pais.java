public class Pais {

    private String nome;

    public Pais(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pais [nome=" + nome + "]";
    }
    
}