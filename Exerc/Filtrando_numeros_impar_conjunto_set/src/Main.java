import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        // 1. Crie um conjunto (Set) de inteiros
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        // 2. Implemente a expressão lambda para filtrar números ímpares
        numeros.removeIf(n -> n % 2 == 0);
        // 3. Exiba os números ímpares resultantes
        System.out.println("Números ímpares: " + numeros);
    }
}
