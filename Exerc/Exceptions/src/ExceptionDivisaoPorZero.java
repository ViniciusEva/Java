public class ExceptionDivisaoPorZero {
    public static void main(String[] args) throws Exception {
        int totalNotas = 0;
        int quantidadeAlunos = 0;

        try{
            int media = totalNotas / quantidadeAlunos; //divisão por zero
        } catch (ArithmeticException e) {
            System.out.println("Problema: Divisão por Zero!");
        } finally {
            System.out.println("O programa terminou.");
        }
    }
}
