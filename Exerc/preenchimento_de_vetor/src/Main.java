//Exercício do BeeCrowd
//vetor  -  1177

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int[] N = new int[1000];
        
        int valorAtual = 0;
        
        for (int i = 0; i < 1000; i++) {
            N[i] = valorAtual;
            
            valorAtual++;
            
            if (valorAtual == T) {
                valorAtual = 0;
            }
        }
        
        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
        
        sc.close();
    }
}