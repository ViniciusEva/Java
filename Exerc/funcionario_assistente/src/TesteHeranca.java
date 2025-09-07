public class TesteHeranca {
    public static void main(String[] args) {
        Assistente assistente = new Assistente();
        assistente.addAumento(500); // Aumento de R$ 500
        assistente.setNome("João");
        assistente.setSalario(3000);
        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário anual: R$" +
        assistente.ganhoAnual());
    }
}
