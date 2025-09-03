import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int ano = N / 365;
        N %=365;

        int mes = N / 30;
        N%=30;

        
        System.out.println(ano+" ano (s)");
        System.out.println(mes+" mes (es)");
        System.out.println(N+" dia (s)");
    }
}
