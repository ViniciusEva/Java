//java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls,javafx.media ExemploVideo
//javac --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls,javafx.media ExemploVideo.java

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class ExemploVideo extends Application{
    
    @Override
    public void start(Stage palcoPrincipal) {
        String urlDoVideo = "file:///C:/Curso/meus-videos/Happy-feet-2.mp4";
        Media media = new Media(urlDoVideo);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        HBox hbox = new HBox();
        hbox.getChildren().add(mediaView);

        Scene scene = new Scene(hbox, 800, 600);

        palcoPrincipal.setTitle("Exemplo de Video");
        palcoPrincipal.setScene(scene);
        palcoPrincipal.show();

        mediaPlayer.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
