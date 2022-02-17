package put.poznan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;


public class IT_WorkerSceneController implements Initializable {

        private Stage stage;
        @FXML
        private ChoiceBox<IT_worker.Departament_type> myChoiceBox;
        @FXML
        private TextField first_name, last_name, salary;
        @FXML
        private Button back, add;
        @FXML
        private Label warning;
        @FXML
        private DatePicker my_date;
        private Parent root;

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

            myChoiceBox.getItems().setAll(IT_worker.Departament_type.values());
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

                    IT_worker.Departament_type type = myChoiceBox.getValue();
                    String first_name = this.first_name.getText();
                    String last_name = this.last_name.getText();
                    LocalDate myDate = my_date.getValue();
                    String date = myDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

                    try {
                        int salary = Integer.parseInt(this.salary.getText());
                        Database.setId(Database.getId()+1);
                        int idd = Database.getId();
                        IT_worker IT_worker_temp = new IT_worker(first_name, last_name, salary, date, type, idd);

                        Database.getInstance().getPeople().add(IT_worker_temp);

                        warning.setTextFill(Color.GREEN);
                        warning.setText("Worker has been added successfully! ");

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
