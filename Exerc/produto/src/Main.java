import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        float C = sc.nextFloat();

        float resultado = (B * C);
        // String resultado = String.format("%.1f", media);

        System.out.println("NUMBER = "+A);
        String resultad = String.format("%.2f", resultado);
        System.out.println("SALARY = U$ "+ resultad);

        sc.close();
    }
}
