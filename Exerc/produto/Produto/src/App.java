import java.util.Scanner;
import java.io.IOException;

public class Prod {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        try{
            int prod1 = sc.nextInt();
            int prod2 = sc.nextInt();

            int produto = prod1 * prod2;

            System.out.println("PROD = "+produto);
        }finally{
            sc.close();
        }
    }
}
