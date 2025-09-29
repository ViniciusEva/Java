//Exercício de Troca de valores dentro do vetor
//1173 do BeeCrowd

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] N = new int[20];

        // Lê os 20 valores e armazena no vetor
        for (int i = 0; i < 20; i++) {
            N[i] = sc.nextInt();
        }

        // Inverte o vetor
        for (int i = 0; i < 10; i++) {
            int temp = N[i];
            N[i] = N[19 - i];
            N[19 - i] = temp;
        }

        // Imprime o vetor invertido
        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
        
        sc.close();
    }
}