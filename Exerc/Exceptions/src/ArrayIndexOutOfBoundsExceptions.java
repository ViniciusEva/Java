public class ArrayIndexOutOfBoundsExceptions {
    public static void main(String[] args) {
        try {
            int [] numeros = {1,2,3}; //indices 0,1,2

            System.out.println(numeros[2]);

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado com ou sem problemas!");
        }
    }
}
