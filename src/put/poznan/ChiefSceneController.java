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
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.scene.control.TextField;


import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;

public class ChiefSceneController implements Initializable {

    private Stage stage;
    @FXML
    private ChoiceBox<Chief.Chief_type> myChoiceBox;
    @FXML
    private TextField first_name, last_name, salary;
    @FXML
    private Button back;
    @FXML
    private Button add;
    @FXML
    private Label warning;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myChoiceBox.getItems().setAll(Chief.Chief_type.values());
    }

    public void handleButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == back) {

            root = FXMLLoader.load(getClass().getResource("../../Resources/AddScene.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        else if (event.getSource() == add) {

            if (first_name.getText().isEmpty() || last_name.getText().isEmpty() || salary.getText().isEmpty() || myChoiceBox.getValue() == null) {

                warning.setTextFill(Color.RED);
                warning.setText("One of the fields is empty! ");
            }

            else {

                Chief.Chief_type type = myChoiceBox.getValue();
                String first_name = this.first_name.getText();
                String last_name = this.last_name.getText();

                try {

                    int salary = Integer.parseInt(this.salary.getText());

                    Database.setId(Database.getId()+1);
                    int idd = Database.getId();
                    Chief temp_chief = new Chief(first_name, last_name, salary, type, idd);

                    Database.getInstance().getPeople().add(temp_chief);

                    warning.setTextFill(Color.GREEN);
                    warning.setText("Chief has been added successfully! ");

                }

                catch (NumberFormatException e) {

                    System.err.println("Salary need to be an Integer Value!!!");
                }

            }
        }

        first_name.clear();
        last_name.clear();
        salary.clear();
        myChoiceBox.getSelectionModel().clearSelection();
        myChoiceBox.setValue(null);
    }
}