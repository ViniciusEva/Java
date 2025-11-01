public class ExemploNullPointerExceptionInteger {
    public static void main(String[] args) {
        try {
            Integer numero = null; // Variável nula
            System.out.println(numero.toString()); // Tentativa de usar uma variável nula
        } catch (NullPointerException e) {
            System.out.println("Ocorreu um NullPointerException: " + e.getMessage());
        }
    }
}