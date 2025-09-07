class Veiculo {
    //Método
    void acelerar(){
        System.out.println("Veículo acelerando!");
    }
}

class Carro extends Veiculo{
    @Override
    void acelerar(){
        super.acelerar(); // chamando o método da superclasse
        System.out.println("Carro Acelerando");
    }
}
