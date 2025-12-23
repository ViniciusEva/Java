//java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls ExemploGridPane
//javac --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls ExemploGridPane.java

import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
//Outros Imports

public class ExemploGridPane extends Application {
    
    @Override
    public void start(Stage palco) {
        //Criação dos elementos (rótulos, campos de texto e botão)
        Label rotuloNome = new Label("Nome:");
        Label rotuloEmail = new Label("E-mail:");

        TextField campoNome = new TextField();
        TextField campoEmail = new TextField();

        Button botaoEnviar = new Button("Enviar");

        //Criação do GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(8); //Espaçamento horizontal entre células
        gridPane.setVgap(8); //Espaçamento vertical entre células
        gridPane.setPadding(new Insets(5));

        //Adição dos elementos ao GridPane
        gridPane.addRow(0, rotuloNome, campoNome);
        gridPane.addRow(1, rotuloEmail, campoEmail);
        gridPane.addRow(2, botaoEnviar);

        //Criação da cena e exibição do palco
        Scene cena = new Scene(gridPane, 400, 200);
        palco.setScene(cena);
        palco.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
