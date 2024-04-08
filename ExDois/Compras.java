public class Compras implements ListaCompras {

    private String[] produtos;
    private double[] valores;
    private int tamanhoProduto;
    private int tamanhoValor;


    public Compras(int capacidade) {
        produtos = new String[capacidade];
        valores = new double[capacidade];
        tamanhoProduto = 0;
        tamanhoValor = 0;
    }

    @Override
    public void adicionarItens(String nome, double valor) {
        if (tamanhoProduto < produtos.length) {
            produtos[tamanhoProduto++] = nome;
            valores[tamanhoValor++] = valor;
        } else {
        System.out.println("\nLista de compras cheias!");
        }
    }

    @Override
    public void removerItens(String nome) {
    int p=-1;
    for (int i = 0; i < tamanhoProduto; i++) {
        if (nome.equals(produtos[i])) {
            p = i;
        }
    }
        if (p >= 0 ) {
          for (int j = p; j < tamanhoProduto-1; j++) {
          produtos[j] = produtos[j+1];
          valores[j] =  valores[j+1];
          }
        tamanhoProduto--;
        tamanhoValor--;
        } 
        else {
            System.out.println("\nProduto não encontrado na lista!!");
            }
        
    }

    @Override
    public void listarCompras() {
        int n=1;
        System.out.println("\n-----LISTA DE COMPRAS-----");
        for (int i = 0; i < tamanho(); i++) {
            System.out.println("\n"+ n + " - " + produtos[i] + " - R$" + valores[i]);
            n++;
        }
    }

    @Override 
    public int tamanho() {
        return tamanhoProduto;
    }
}
