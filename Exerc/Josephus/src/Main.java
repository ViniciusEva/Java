import java.util.Scanner;

public class Main {
    public static int josephus(int n, int k) {
        int result = 0; // Base: J(1, k) = 0
        for (int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NC = sc.nextInt();
        for (int caso = 1; caso <= NC; caso++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int survivor = josephus(n, k) + 1; // Ajuste para 1‑based
            System.out.printf("Case %d: %d%n", caso, survivor);
        }
        sc.close();
    }
}
