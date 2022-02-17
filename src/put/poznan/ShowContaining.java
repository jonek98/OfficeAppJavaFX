package put.poznan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShowContaining implements Initializable {

    @FXML
    private Button back;
    @FXML
    private ListView myListView;
    @FXML
    private Label keyword;
    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        keyword.setText(ContainingController.getString_keyword());

        for (Person p : Database.getInstance().getPeople()) {

            if (p.toString().contains(ContainingController.getString_keyword())) {

                myListView.getItems().add(p.toString());

            }
        }
    }

    public void back(ActionEvent event) {

        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("../../Resources/Menu.fxml"));

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
