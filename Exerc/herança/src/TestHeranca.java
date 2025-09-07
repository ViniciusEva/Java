//calss Animal{
    //public void comer(){
        //System.out.println("O animal come");
    //}
//}

//class Cachorro extends Animal{
    //public void latir(){
        //System.out.println("O cachorro late");
    //}
//}

//public class TestHeranca{
    //public static void main(String[] args) {
        //Cachorro dog = new Cachorro();

        //Como não existe "comer" dentro da classe Cachorro, devido a herança, ele vai procurar na classe animal
       //dog.latir();
        //dog.comer();
    //}
//}




class Animal { 
    public String nome;
    public void fazerSom() { 
        System.out.println("O animal faz um som"); 
    } 
} 


class Cachorro extends Animal { 
    public void fazerSom() { 
        //chama a classe superior, e não a subclasse
        super.fazerSom();
        System.out.println("O cachorro late"); 
    }  
} 


public class TestHeranca {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro ();
        dog.nome = "Rex";
        System.out.println("O nome do animal: " +  dog.nome);
        
        //Overriding
        //dog.fazerSom();

    }
}