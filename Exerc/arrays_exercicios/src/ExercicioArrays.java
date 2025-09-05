public class ExercicioArrays {
 public static void main(String[] args) {
 int tamanho = 6; // Tamanho do array (pode ser alterado)
 int[] meuArray = new int[tamanho];
 // Preenchendo manualmente o array com números pares
 for (int i = 0; i < tamanho; i++) {
 meuArray[i] = 2 * (i + 1);
 }
 System.out.print("Elementos do array: ");
 for (int i = 0; i < tamanho; i++) {
 System.out.print(meuArray[i] + " ");
 }
 }
}
