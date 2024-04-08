public class Animal {

    private String nome;

    public void setName(String nome) {
    this.nome = nome;
    }
    
    public String getNome() {
    return nome;
        }
    
    public Animal(String name) {
    this.setName(name);
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + "]";
    }

}

    
    

