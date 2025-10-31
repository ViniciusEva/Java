public class NullPointerExceptions {
    public static void main(String[] args) {
        String nome = new String("Arnaldo");

        try {
            int tamanhoNome = nome.length(); //Tentando acessar objeto nulo

            System.out.println("Tamanho do nome: " + tamanhoNome);
        } catch (NullPointerException e) {
            System.out.println("Erro: A variável 'nome' está nula!");
        }
    }
}
