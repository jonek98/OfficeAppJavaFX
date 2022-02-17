
package put.poznan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AddSceneController {

    @FXML
    private Button btn_chief, btn_it, btn_sales, btn_warehouse, btn_back;
    private Stage stage;

    public void handleButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == btn_chief) {

            Parent root;
            root = FXMLLoader.load(getClass().getResource("../../Resources/ChiefAdd.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }

        else if (event.getSource() == btn_it) {

            Parent root;
            root = FXMLLoader.load(getClass().getResource("../../Resources/IT_WorkerScene.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        else if (event.getSource() == btn_sales) {

            Parent root;
            root = FXMLLoader.load(getClass().getResource("../../Resources/SalesPersonScene.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }

        else if (event.getSource() == btn_warehouse) {

            Parent root;
            root = FXMLLoader.load(getClass().getResource("../../Resources/WarehouseWorkerScene.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }

        else if (event.getSource() == btn_back) {

            Parent root;
            root = FXMLLoader.load(getClass().getResource("../../Resources/Menu.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
    }
}
