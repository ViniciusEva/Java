import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        float ltr = sc.nextFloat();

        float resul_km_ltr = km / ltr;
        String resultado = String.format("%.3f", resul_km_ltr);

        System.out.println(resultado+" km/l");

        sc.close();

    }
}
