import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int resultado = a + b;
        System.out.println("X = "+resultado);

        sc.close();
    }
}
