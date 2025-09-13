class Animal { 
    public void fazerSom() { 
        System.out.println("O animal faz um som"); 
    } 
} 


class Cachorro extends Animal {

    //O Override facilita para o compilador entender que a classe cachorro herda o void da classe animal, em caso de overload ele dá erro
    @Override
    public void fazerSom() { 
        System.out.println("O cachorro late"); 
    }  
} 


public class TestAnnotations {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro ();
        dog.fazerSom();
    }
}