//Exercício numero 1173 do BeeCrowd - Vetor

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int V = sc.nextInt();
        
        int[] N = new int[10];
        
        N[0] = V;
        
        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
        
        sc.close();
    }
}