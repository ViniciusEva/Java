class Livro {
    public String titulo;
    public String autor;
    protected int anoPublicacao;
    double preco; // Modificador default
    // Construtor padrão
    public Livro() {
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }
    // Construtor com dois parâmetros
    // public Livro(String titulo, String autor) {
    //     this.titulo = titulo;
    //     this.autor = autor;
    //     this.anoPublicacao = 0; // Valor padrão para anoPublicacao
    //     this.preco = 0.0; // Valor padrão para preco
    // }
    // Construtor com quatro parâmetros
    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }
}