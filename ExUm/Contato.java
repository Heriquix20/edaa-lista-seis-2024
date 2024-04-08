public class Contato implements ListaContato {

    private String[] numeros;
    private String[] nomes;
    private int tamanhoNome;
    private int tamanhoNumero;



    public Contato(int capacidade) {
        nomes = new String[capacidade];
        numeros = new String[capacidade];
        tamanhoNome = 0;
        tamanhoNumero = 0;
    }

    
    @Override
    public void adicionarContato(String nome, String numero) {
        if (tamanhoNome < nomes.length) {
        nomes[tamanhoNome++] = nome;
        numeros[tamanhoNumero++] = numero;
        }else {
            System.out.println("\nLista de contatos cheia.");
        }
 }

    @Override
    public void listarContatos() {
        System.out.println("\nLista de contatos:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i] + " - número: " + numeros[i]);
        }
    }

    @Override 
    public void obterContato(String nome) {
        int p = -1;
    for (int i = 0; i < tamanhoNome; i++) {
        if (nome.equals(nomes[i])) {
            p = i;
        }
    }
        if (p >= 0) {
            System.out.println("\nContato encontrado!");
        System.out.println("Nome: " + nomes[p] + " - número: " + numeros[p]);
        } else {
            System.out.println("\nContato não encontrado, verifique se digitou corretamente o nome da pessoa.");
        }
    }
   
}