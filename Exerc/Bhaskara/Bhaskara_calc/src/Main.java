import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // 1. Criar um objeto Scanner para ler a entrada do teclado
        Scanner sc = new Scanner(System.in);

        // 2. Ler os três valores de ponto flutuante (double)
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // 3. Calcular o discriminante (delta)
        double delta = (B * B) - 4 * A * C;

        // 4. Verificar as condições de impossibilidade
        // A == 0 ou delta é negativo
        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            // 5. Calcular as raízes
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);

            // 6. Imprimir os resultados com 5 casas decimais
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
        
        // 7. Fechar o Scanner para liberar recursos
        sc.close();
    }
}