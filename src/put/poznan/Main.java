package put.poznan;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.fxml.FXMLLoader;

import java.util.ArrayList;
import java.util.List;


public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("../../Resources/Menu.fxml"));
        Scene scene = new Scene(root, Color.WHITE);
        stage.setScene(scene);
        stage.show();

    }
}
