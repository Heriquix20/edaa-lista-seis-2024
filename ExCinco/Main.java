import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa(null, 0);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Pedro", 20));
        pessoas.add(new Pessoa("Ana", 22));
        pessoas.add(new Pessoa("Daniel", 31));
        pessoas.add(new Pessoa("Lucas", 18));

        System.out.println("\nLista desorganizada");
        pessoas.forEach(pe -> System.out.println(pe));

        p.organizar(pessoas);

        System.out.println("\nLista organizada");
        pessoas.forEach(pe -> System.out.println(pe));


    }
}