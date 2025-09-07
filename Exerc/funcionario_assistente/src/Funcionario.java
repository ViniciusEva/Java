class Funcionario {
    private String nome;
    private double salario;

    public void addAumento(double valor) {
        salario += valor;
    }

    public double ganhoAnual() {
        return salario * 12;
    }
    

//=========================================================================
    //Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){ 
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
//==============================================================


}
class Assistente extends Funcionario {
    private int numeroMatricula;
    
    public double ganhoAnual() {
        // Considerando um bônus fixo de R$ 1000 para assistentes
        return super.ganhoAnual() + 1000;
    }
}