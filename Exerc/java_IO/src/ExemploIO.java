import java.io.*;

public class ExemploIO{
    public static void main(String[] args) {
        //O código em caso de erro na execução precisa estar protegido pelo try
        try {
            //Escrevendo em um arquivo
            FileWriter writer = new FileWriter("meuArquivo.txt");

            writer.write("Ola Mundo"); //Grava os Dados

            writer.close();

            //lendo de um arquivo
            FileReader reader = new FileReader("meuArquivo.txt");

            int data = reader.read();

            while (data != -1) {
                System.out.println((char)data);

                data = reader.read();
            }

            reader.close();
        } catch(IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }
}
