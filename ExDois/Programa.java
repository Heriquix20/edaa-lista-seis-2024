public class Programa {
    public static void main(String[] args) {

        // Capacidade da lista
        Compras compra = new Compras(5);

        // Adicionando produtos na lista de compra
        compra.adicionarItens("Leite", 8.99);
        compra.adicionarItens("Arroz", 15.39);
        compra.adicionarItens("Sardinha", 10.68);
        compra.adicionarItens("Cafê", 5.49);
        compra.adicionarItens("Fralda", 48.99);

        // Remover produto
        compra.removerItens("Batata");

        // Listar tudo
        compra.listarCompras();


    }
    
}
