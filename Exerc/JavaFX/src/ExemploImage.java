//java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls ExemploImage
//javac --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls ExemploImage.java

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ExemploImage extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco) {
        //Caminho absoluto para a imagem no Windows
        String caminhoImagem = "file:///C:/Downloads/gato.jfif";

        Image imagem = new Image(caminhoImagem);
        ImageView imageView = new ImageView(imagem);

        //Configuração para ajustar o tamanho da imagem
        imageView.setFitWidth(613); //largura desejada em pixels
        imageView.setFitHeight(840); //altura desejada em pixels
        //imageView.setPreserveRatio(true); //Mantem a proporção original da imagem

        VBox layout = new VBox(imageView);
        Scene cena = new Scene(layout, 700, 700);

        palco.setScene(cena);
        palco.show();
    }
}
