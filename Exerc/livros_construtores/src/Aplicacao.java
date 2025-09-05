public class Aplicacao {
    public static void main(String[] args) {
    // Testando o construtor padrão
    Livro livro1 = new Livro();
    System.out.println("Título: " + livro1.titulo);
    // Não é possível acessar diretamente 'autor' pois é private
    // System.out.println("Autor: " + livro1.autor);
    System.out.println("Ano de Publicação: " + livro1.anoPublicacao);
    System.out.println("Preço: " + livro1.preco);
    // Testando o construtor com dois parâmetros
    Livro livro2 = new Livro("1984", "George Orwell",2000,50.00);
    System.out.println("Título: " + livro2.titulo);
    // Não é possível acessar diretamente 'autor' pois é private
    // System.out.println("Autor: " + livro2.autor);
    System.out.println("Ano de Publicação: " + livro2.anoPublicacao);
    System.out.println("Preço: " + livro2.preco);
    // Testando o construtor com quatro parâmetros
    Livro livro3 = new Livro("senhor", "J.R.R. Tolkien",1980,150.50);
    System.out.println("Título: " + livro3.titulo);
    // Não é possível acessar diretamente 'autor' pois é private
    // System.out.println("Autor: " + livro3.autor);
    System.out.println("Ano de Publicação: " + livro3.anoPublicacao);
    System.out.println("Preço: " + livro3.preco);
    }
}
