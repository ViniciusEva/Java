import java.io.*;
public class ExemploIO {
    public static void main(String[] args) {
        try {
            // Escrevendo em um arquivo
            FileWriter writer = new
            FileWriter("C:/Curso/pastinha/meuArquivo.txt");
            writer.write("Olá, mundo!"); // Grava os Dados
            writer.close();
            // Lendo de um arquivo
            FileReader reader = new FileReader("C:\\Curso\\pastinha\\meuArquivo.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data); // Casting
                //System.out.println(data); // No casting
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }
}
