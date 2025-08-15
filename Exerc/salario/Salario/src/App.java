import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Salario {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        try{
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            String horasStr = sc.next().replace(",", ".");
            double horas = Double.parseDouble(horasStr);

            double salary = number2 * horas;

            System.out.println("NUMBER = "+number1);
            System.out.printf("SALARY = U$ %.2f%n",salary);

        }finally{
            sc.close();
        }
    }
}

// import java.util.Scanner;
// import java.util.Locale; // Required for consistent decimal formatting

// public class salario {
//     public static void main(String[] args) {
//         // Set default locale to US to ensure consistent decimal point usage (e.g., 10.50 instead of 10,50)
//         Locale.setDefault(Locale.US); 
//         Scanner sc = new Scanner(System.in);

//         // Read inputs
//         int employeeNumber = sc.nextInt();
//         int hoursWorked = sc.nextInt();
//         double hourlyRate = sc.nextDouble();

//         // Calculate salary
//         double salary = hoursWorked * hourlyRate;

//         // Print outputs in the specified format
//         System.out.println("NUMBER = " + employeeNumber);
//         System.out.printf("SALARY = U$ %.2f%n", salary); // %n for platform-independent newline

//         sc.close(); // Close the scanner to release resources
//     }
// }
