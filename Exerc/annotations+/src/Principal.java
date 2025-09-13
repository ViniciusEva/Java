public class Principal {
    public static void main(String[] args) {
        MinhaClasse minhaClasse = new MinhaClasse();
        int resultadoSoma = minhaClasse.calcularSoma(5, 3);
        int resultadoProduto = minhaClasse.calcularProduto(5, 3);
        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Produto: " + resultadoProduto);
    }
}
