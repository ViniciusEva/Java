import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        System.out.println(N);
        
        // Inicializa o array, declarando os valores das cedulas
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        
        for (int nota : notas) {
            int quantidade = N / nota;
            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
            // Pega o resto da divisão de N pelo array Notas de Nota
            N %= nota;
        }

        sc.close();
 
    }
 
}