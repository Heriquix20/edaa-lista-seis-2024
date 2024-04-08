import java.util.List;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void organizar(List<Pessoa> array) {
        for (int i = 0; i < array.size()-1; i++ ) {
            for (int j = 0; j < array.size() -1 ; j++) {
                if (array.get(j).getIdade() > array.get(j+1).getIdade()) {
                    Pessoa temp = array.get(j+1);
                    array.set(j+1, array.get(j));
                    array.set(j, temp);
                }
            }
        }

    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade;
    }

    
}
