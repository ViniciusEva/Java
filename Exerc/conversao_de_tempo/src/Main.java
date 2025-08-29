// Entrada: O arquivo de entrada contém um valor inteiro N.
// Saída: Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int horas = N / 3600;
        N %= 3600;
        
        int minutos = N / 60;
        N %= 60;
        
        int segundos = N;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
 
}