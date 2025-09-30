import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int N;
        
        while (sc.hasNext()) {
            N = sc.nextInt();
            
            int[][] M = new int[N][N];
            
            // Preenche a matriz com o padrão 1, 2 e 3
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i + j == N - 1) { // Diagonal secundária
                        M[i][j] = 2;
                    } else if (i == j) { // Diagonal principal
                        M[i][j] = 1;
                    } else { // Demais elementos
                        M[i][j] = 3;
                    }
                }
            }
            
            // Imprime a matriz
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(M[i][j]);
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}