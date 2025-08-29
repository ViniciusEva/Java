import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int cidade = 1;
        boolean primeiraCidade = true;

        try {
            while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
                int n = Integer.parseInt(line.trim());
                if (n == 0) {
                    break;
                }

                if (!primeiraCidade) {
                    System.out.println();
                }

                Map<Integer, Integer> consumoPorPessoa = new TreeMap<>();
                double totalConsumo = 0;
                int totalMoradores = 0;

                for (int i = 0; i < n; i++) {
                    String[] dados = br.readLine().trim().split(" ");
                    int moradores = Integer.parseInt(dados[0]);
                    int consumo = Integer.parseInt(dados[1]);
                    int consumoMedio = consumo / moradores;
                    
                    consumoPorPessoa.put(consumoMedio, consumoPorPessoa.getOrDefault(consumoMedio, 0) + moradores);
                    
                    totalMoradores += moradores;
                    totalConsumo += consumo;
                }

                System.out.println("Cidade# " + cidade + ":");

                StringBuilder sb = new StringBuilder();
                for (Map.Entry<Integer, Integer> entry : consumoPorPessoa.entrySet()) {
                    sb.append(entry.getValue()).append("-").append(entry.getKey()).append(" ");
                }
                System.out.println(sb.toString().trim());

                double consumoMedioCidade = totalConsumo / totalMoradores;
                System.out.printf("Consumo medio: %.2f m3.\n", consumoMedioCidade);

                cidade++;
                primeiraCidade = false;
            }
        } catch (IOException | NumberFormatException e) {
            // Em caso de erro na leitura ou formatação, finaliza o programa
            // Isto é comum em plataformas de submissão online quando a entrada termina.
        }
    }
}
