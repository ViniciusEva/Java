public class Endereco {

    // estrutura minima de uma classe:
    // atributos/ e/ou
    // métodos de acesso (Construtor, Getters e Setters); e /ou
    // métodos de validação de entrada de dados

    //Essa classe no mundo a fora é chamada:
    // Classe de domínio, classe modelo(ou model) ou entidade
    private String logradouro,cidade, bairro, estado, complemento, cep;
    private int numero;

    //Tudo em () é considerado um parametro de entrada de dados
    public Endereco(String logradouro, String cidade,String bairro, String estado, String complemento, String cep, int numero){
        //Atribuir valores aos atributos mencionados no inicio da classe
        //this.nome_atributo = parametro_entrada
        //this -> mencionar o atributo criado no inicio da classe, pois havera atributos ou variáveis com nomes similares 
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.complemento = complemento;
        this.cep = cep;
        this.numero = numero;

    }

    //metodos setters: são utilizados para atribuir valor a um atributo
    //tem o principio de criar ou atualizar um atributo específico
    public void setLogradouro (String logradouro){
        this.logradouro = logradouro;
    }

    public void setNumero (int numero){
        this.numero = numero;
    }

    //metodos getters: São utilizados para consultar / recuperar o valor de um atributo

    public String getLogradouro(){
        return this.logradouro;
    }

    public int getNumero(){
        return this.numero;
    }
}
