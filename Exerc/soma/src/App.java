import java.util.Scanner;

class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try{
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int SOMA = num1+num2;

            System.out.println("SOMA = "+SOMA);
        }finally{
            sc.close();
        }
    }
}
