import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Verificador se há mais dados na entrada
        while (scanner.hasNext()) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            //o operador XOR é definido pelo "^"
            System.out.println(a ^ b);
        }

        scanner.close();
    }
}
