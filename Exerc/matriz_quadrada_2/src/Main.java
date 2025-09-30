import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String linha;
        
        while ((linha = br.readLine()) != null && !linha.isEmpty()) {
            int N = Integer.parseInt(linha);
            
            if (N == 0) {
                break;
            }
            
            int[][] M = new int[N][N];
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = Math.abs(i - j) + 1;
                }
            }
            
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // Garante a formatação e o alinhamento
                    if (M[i][j] < 10) {
                        sb.append("  ").append(M[i][j]);
                    } else if (M[i][j] < 100) {
                        sb.append(" ").append(M[i][j]);
                    } else {
                        sb.append(M[i][j]);
                    }
                    
                    if (j < N - 1) {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }
            sb.append("\n");
            pw.print(sb.toString());
        }
        
        pw.flush();
    }
}