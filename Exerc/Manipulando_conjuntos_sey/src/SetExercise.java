import java.util.HashSet;
import java.util.Set;
public class SetExercise {
    public static void main(String[] args) {
        // Inicialização do conjunto
        Set<Integer> numeros = new HashSet<>();
        // Adicionando números ao conjunto
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        // Verificando se o número 20 está presente
        boolean contemNumero20 = numeros.contains(20);
        System.out.println("O conjunto contém o número 20? " +
        contemNumero20);
        // Removendo o número 10
        numeros.remove(10);
        // Imprimindo os números restantes
        System.out.println("Números no conjunto: " + numeros);
        }
}