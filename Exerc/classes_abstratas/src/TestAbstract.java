//abstract class Carro{
    //abstract void acelerar();

    //void frear(){
        //System.out.println("O carro está freando...");
    //}
//}

// class CarroF1 extends Carro {
//     void acelerar() {
//         System.out.println("O carro de Fórmula 1 está acelerando muito rápido...");
//     }
// }

// class Caminhao extends Carro {
//     void acelerar(){
//         System.out.println("O caminhão está acelerando lentamente...");
//     }
// }

// public class TestAbstract {
//     public static void main(String[] args) {
//         CarroF1 carroF1 = new CarroF1();
//         Caminhao caminhao = new Caminhao();

//         carroF1.acelerar();
//         carroF1.frear();

//         caminhao.acelerar();
//         caminhao.frear();
//     }
// }


//==========================================================================================================================



abstract class Carro {
	int codigo = 10;

	Carro (int cod) {
		codigo = cod;
	}

    abstract void acelerar();

    void frear() {
        System.out.println("O carro está freando...");
    }
}

class Caminhao extends Carro {
	Caminhao (int codigo) {
		super (codigo);
	}

    void acelerar() {
        System.out.println("O caminhão está acelerando lentamente...");
    }
}

public class TestAbstract {
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao(1000);
		System.out.println("Codigo " + caminhao.codigo);
    }
}