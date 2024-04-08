public class ProgramaContato {
    public static void main(String[] args) {

        // Capacidade da lista
        Contato contato = new Contato(6);  

        // Adicionando contatos
        contato.adicionarContato("Henrique", "(31) 93333-5543");
        contato.adicionarContato("Pedro", "(31) 91124-9987");
        contato.adicionarContato("Amanda", "(31) 98802-1111");
        contato.adicionarContato("Helo", "(31) 96095-7766");
        contato.adicionarContato("Isadora", "(31) 99988-3231");
        contato.adicionarContato("Ana", "(31) 9955-6777");
        

        // Obtendo contato pelo nome
        contato.obterContato("Helo");

        // Listando todos os contatos
        contato.listarContatos();
        
    }
    
}
