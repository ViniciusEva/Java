import java.util.ArrayList;
import java.util.List;
public class ListaFilmes {
    public static void main(String[] args) {
        List<String> filmes = new ArrayList<>();
        // Adiciona filmes à lista
        filmes.add("O Poderoso Chefão");
        filmes.add("Matrix");
        filmes.add("Interestelar");
        // Imprime a lista de filmes
        System.out.println("Lista de filmes:");
        for (String filme : filmes) {
            System.out.println(filme);
        }
        // Verifica se um filme específico está na lista
        String filmeBuscado = "Matrix";
        if (filmes.contains(filmeBuscado)) {
            System.out.println(filmeBuscado + " está na lista.");
        } else {
            System.out.println(filmeBuscado + " não está na lista.");
        }
    }
}
