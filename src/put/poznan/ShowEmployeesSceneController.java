package put.poznan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ShowEmployeesSceneController implements Initializable {

    private Stage stage, stage2;

    private static Stage main_stage;
    @FXML
    private Button back, delete_employee;
    @FXML
    private ListView<String> employees;
    @FXML
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        for (Person p : Database.getInstance().getPeople()) {

            employees.getItems().add(p.toString());
        }
    }

    public void handleButtonAction(ActionEvent event) throws IOException, InterruptedException {

        if (event.getSource() == back) {

            root = FXMLLoader.load(getClass().getResource("../../Resources/Menu.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }

        else if (event.getSource() == delete_employee) {

            this.main_stage = (Stage)((Node)event.getSource()).getScene().getWindow();

            Parent root2;
            root2 = FXMLLoader.load(getClass().getResource("../../Resources/PopUpWindow_deleteID.fxml"));
            Scene scene = new Scene(root2);
            stage2 = new Stage();
            stage2.setScene(scene);
            stage2.show();

        }
    }

    public Stage getMain_stage() {
        return main_stage;
    }

    public void setMain_stage(Stage main_stage) {
        this.main_stage = main_stage;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
