public class ArraysUsandoForEach {
        public static void main(String[] args) {

            int[] meuArray; // Declaração de Arrays

            meuArray = new int[3]; // Criação do Array
            meuArray[0] = 5;
            meuArray[1] = 8;
            meuArray[2] = 2;

            meuArray = new int[]{5, 8, 2};

            System.out.println(meuArray[0]); // Saída: 5
            System.out.println(meuArray[1]); // Saída: 8
            System.out.println(meuArray[2]); // Saída: 2

            // Alterando Elementos do Array:
            meuArray[0] = 10;

            System.out.println("Valor alterado: " + meuArray[0]); // Saída: 10

            // Percorrendo Arrays com for-each:
            for (int elemento : meuArray) {
                System.out.println(elemento);
            }
        }
    }
