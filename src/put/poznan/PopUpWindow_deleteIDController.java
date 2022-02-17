package put.poznan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class PopUpWindow_deleteIDController {

    @FXML
    private TextField id_textField;
    @FXML
    private Button delete_id;
    private Stage stage;

    public void handleButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == delete_id) {

                int id = Integer.parseInt(id_textField.getText());
                int temp_id = -1;
                int iterator_id = 0;

                for (Person p : Database.getInstance().getPeople()) {

                    if (p.getId() == id) {
                        temp_id = iterator_id;
                        
                    }
                    iterator_id++;

                }
                if (temp_id != -1)
                Database.getInstance().getPeople().remove(temp_id);

                stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stage.close();

                FXMLLoader loader = new FXMLLoader(getClass().getResource("../../Resources/ShowEmployeesScene.fxml"));
                loader.load();
                ShowEmployeesSceneController controller = loader.getController();

                Parent root;
                root = FXMLLoader.load(getClass().getResource("../../Resources/ShowEmployeesScene.fxml"));
                stage = controller.getMain_stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
        }

    }
}
