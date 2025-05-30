package ca.ucalagry.luis.hernandez1.calc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class gui extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        String css = this.getClass().getResource("/fonts.css").toExternalForm();
        scene.getStylesheets().add(css);

        Stage stage = new Stage();
        stage.setTitle("PokiCalc");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
