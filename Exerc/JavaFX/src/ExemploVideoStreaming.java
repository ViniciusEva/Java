//java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.web ExemploVideoStreaming
//javac --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.web ExemploVideoStreaming.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.web.WebView;

public class ExemploVideoStreaming extends Application {
    
    @Override
    public void start(Stage palco) {
        WebView webView = new WebView();

        String urlVideo;
        urlVideo = "URL";

        webView.getEngine().load(urlVideo);
        Scene cena = new Scene(webView, 800, 600);

        palco.setTitle("Exemplo de Video de Streaming");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
