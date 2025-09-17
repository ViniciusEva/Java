abstract class Loja {
    private String cnpj;
    private String razaoSocial;
    protected boolean aberta;
    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }
    // Método para abrir a loja
    public void abrir() {
        this.aberta = true;
    }
    // Método para fechar a loja
    public void fechar() {
        this.aberta = false;
    }
}
// Classe concreta LojaComercial
class LojaComercial extends Loja {
    public LojaComercial(String cnpj, String razaoSocial) {
        super(cnpj, razaoSocial);
    }
}
// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        LojaComercial minhaLoja = new LojaComercial("123456789",
        "Minha Loja");
        minhaLoja.abrir(); // Abre a loja
        System.out.println("A loja está aberta? " +
        minhaLoja.aberta); // Exibe se a loja está aberta
    }
}