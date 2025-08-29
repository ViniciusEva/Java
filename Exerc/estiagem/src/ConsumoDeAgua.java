import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ConsumoDeAgua {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int cidade = 1;
        boolean primeiraCidade = true;

        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line.trim());
            if (n == 0) {
                break;
            }

            if (!primeiraCidade) {
                System.out.println();
            }

            List<Imovel> imoveis = new ArrayList<>();
            double totalConsumo = 0;
            int totalMoradores = 0;

            for (int i = 0; i < n; i++) {
                String[] dados = br.readLine().trim().split(" ");
                int moradores = Integer.parseInt(dados[0]);
                int consumo = Integer.parseInt(dados[1]);
                imoveis.add(new Imovel(moradores, consumo));
                totalMoradores += moradores;
                totalConsumo += consumo;
            }

            Collections.sort(imoveis, Comparator.comparingInt(imovel -> (imovel.consumo / imovel.moradores)));

            System.out.println("Cidade# " + cidade + ":");

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < imoveis.size(); i++) {
                Imovel imovel = imoveis.get(i);
                int consumoPorPessoa = imovel.consumo / imovel.moradores;
                sb.append(imovel.moradores).append("-").append(consumoPorPessoa);
                if (i < imoveis.size() - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());

            double consumoMedio = totalConsumo / totalMoradores;
            System.out.printf("Consumo medio: %.2f m3.\n", consumoMedio);

            cidade++;
            primeiraCidade = false;
        }
    }

    static class Imovel {
        int moradores;
        int consumo;

        public Imovel(int moradores, int consumo) {
            this.moradores = moradores;
            this.consumo = consumo;
        }
    }
}