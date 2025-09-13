class InformaRegras {
    
    //Utiliza-se deprecated quando uma classe se torna obsoleto, ou seja, não se apaga a classe, apenas diz que ela está ultrapassada
    @Deprecated
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras para Aposentadoria");
    }

    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("NOVAS Regras para Aposentadoria");
    }

    public void chamarMetodoObsoletoNaMesmaClasse(){
        mostrarRegrasParaAposentadoria();
    }
}

public class TestDeprecated {

    public static void main(String[] args) {

        InformaRegras regras = new InformaRegras();

        regras.chamarMetodoObsoletoNaMesmaClasse();
    }
}