package put.poznan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import org.w3c.dom.events.Event;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SpecificTypeController {

    @FXML
    private Button Chief, IT_Worker, Sales_person, Warehouse_worker;

    private static String type;
    private Stage stage;


    public void handleButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == Chief) {

            type = "Chief";

            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.close();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../Resources/Menu.fxml"));
            loader.load();
            MenuController controller = loader.getController();

            Parent root;
            root = FXMLLoader.load(getClass().getResource("../../Resources/ShowSpecificType.fxml"));
            stage = controller.getMain_stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        else if (event.getSource() == IT_Worker) {

            type = "IT_Worker";

            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.close();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../Resources/Menu.fxml"));
            loader.load();
            MenuController controller = loader.getController();

            Parent root;
            root = FXMLLoader.load(getClass().getResource("../../Resources/ShowSpecificType.fxml"));
            stage = controller.getMain_stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }


        else if (event.getSource() == Sales_person) {

            type = "Sales_person";

            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.close();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../Resources/Menu.fxml"));
            loader.load();
            MenuController controller = loader.getController();

            Parent root;
            root = FXMLLoader.load(getClass().getResource("../../Resources/ShowSpecificType.fxml"));
            stage = controller.getMain_stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }


        else if (event.getSource() == Warehouse_worker) {

            type = "Warehouse_worker";

            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.close();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../Resources/Menu.fxml"));
            loader.load();
            MenuController controller = loader.getController();

            Parent root;
            root = FXMLLoader.load(getClass().getResource("../../Resources/ShowSpecificType.fxml"));
            stage = controller.getMain_stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public String getType() {
        return type;
    }

}
