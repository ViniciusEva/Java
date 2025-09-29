// Exercício do Beecrowd - GIT
//Numero: 1172 - vetor
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);   
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
            if (vetor[i] <= 0) {
                vetor[i] = 1;
            }
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("X[" + i + "] = " + vetor[i]);
        }
        
        sc.close();
    }
}