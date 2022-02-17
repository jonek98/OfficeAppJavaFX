package put.poznan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MenuController {

    private Stage stage, stage2;
    private static Stage main_stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label info;
    @FXML
    private Button add_employee, show_employees, specific_type, containing, give_raise;

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public static Stage getMain_stage() {
        return main_stage;
    }

    public static void setMain_stage(Stage main_stage) {
        MenuController.main_stage = main_stage;
    }

    public void handleButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == add_employee ) {

            root = FXMLLoader.load(getClass().getResource("../../Resources/AddScene.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        else if (event.getSource() == show_employees) {

            root = FXMLLoader.load(getClass().getResource("../../Resources/ShowEmployeesScene.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        else if (event.getSource() == specific_type ) {

            this.main_stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("../../Resources/SpecificType.fxml"));
            stage2 = new Stage();
            scene = new Scene(root);
            stage2.setScene(scene);
            stage2.show();
        }

        else if (event.getSource() == containing ) {

            this.main_stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("../../Resources/Containing.fxml"));
            stage2 = new Stage();
            scene = new Scene(root);
            stage2.setScene(scene);
            stage2.show();
        }

        else if (event.getSource() == give_raise ) {

            for (Person p : Database.getInstance().getPeople()) {

                if (p instanceof Employee) {

                    ((Employee) p).GiveRaise();
                }
            }

            info.setTextFill(Color.GREEN);
            info.setText("Raises have been given successfully! ");
        }
    }
}
