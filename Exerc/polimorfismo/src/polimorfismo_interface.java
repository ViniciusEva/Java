interface Veiculo { //Interface
    void acelerar();
}

//Subclasse Carro
class Carro implements Veiculo{
    //@Override
    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }
}

//subclasse Moto
class Moto implements Veiculo{
    
    public void acelerar() {
        System.out.println("A moto está acelerando!");
    }
}

//classe Principal (main)
public class polimorfismo_interface {
    public static void main(String[] args) {
        
        //criando Objetos polimórficos
        Veiculo meuCarro = new Carro();
        Veiculo minhaMoto = new Moto();

        meuCarro.acelerar(); //Imprime: O carro está acelerando!
        minhaMoto.acelerar(); //Imprime: A moto está acelerando!
    }
}

