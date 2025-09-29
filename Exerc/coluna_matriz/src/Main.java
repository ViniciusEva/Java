//Exercício 1182 - Beecrowd

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int C = sc.nextInt();
        char T = sc.next().charAt(0);
        
        double[][] M = new double[12][12];
        double soma = 0.0;
        
        // Lê os valores da matriz e calcula a soma da coluna C
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextDouble();
                if (j == C) {
                    soma += M[i][j];
                }
            }
        }
        
        // Verifica a operação e imprime o resultado
        if (T == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (T == 'M') {
            System.out.printf("%.1f\n", soma / 12.0);
        }
        
        sc.close();
    }
}