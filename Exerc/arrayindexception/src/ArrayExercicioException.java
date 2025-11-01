public class ArrayExercicioException {
    // Método para acessar um elemento do array
    public static int acessarElemento(int[] array, int indice) {
        try {
            return array[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array.");
            return -1; // Valor padrão para indicar erro
        }
    }
    public static void main(String[] args) {
        // Declare e inicialize um array de inteiros
        int[] meuArray = { 10, 20, 30, 40, 50 };
        // Teste com índices válidos
        System.out.println("Elemento no índice 2: " +
        acessarElemento(meuArray, 2));
        // Teste com índice inválido
        System.out.println("Elemento no índice 10: " +
        acessarElemento(meuArray, 10));
    }
}