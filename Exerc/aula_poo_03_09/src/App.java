public class App {
    public static void main(String[] args) throws Exception {
        
        //toda classe que tem um construtor, existe a obrigaoriedade em preencher todos os valores no ato dac criação
        //Instância
        Endereco e = new Endereco (null, null, null, null,null,null, 0);

        //atribuinfo ou modificando valores
        e.setLogradouro("Rua João de Barro");
        e.setNumero(300);

        //recuperando e exibindo valores
        System.out.println(e.getLogradouro());
        System.out.println(e.getNumero());
    }
}
