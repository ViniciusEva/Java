public class FinalVariables {
    private final int numeroMaximo = 100;
    private final String mensagem = "Bem-vindo ao mundo da programação!";
    public void imprimirValoresFinais() {
        System.out.println("Número máximo: " + numeroMaximo);
        System.out.println("Mensagem: " + mensagem);
    }
    public static void main(String[] args) {
        FinalVariables exemplo = new FinalVariables();
        exemplo.imprimirValoresFinais();
    // Tente alterar o valor das variáveis abaixo e observe os erros:
    // exemplo.numeroMaximo = 200; // Isso resultará em um erro de compilação
    // exemplo.mensagem = "Nova mensagem"; // Isso também resultará em um erro
    }
}