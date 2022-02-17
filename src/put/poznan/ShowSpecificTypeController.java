package put.poznan;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class ShowSpecificTypeController implements Initializable {

    @FXML
    private ListView myListView;
    @FXML
    private Button back;

    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        SpecificTypeController STC = new SpecificTypeController();

        if (STC.getType() == "Chief") {

            for (Person p : Database.getInstance().getPeople()) {

                if (p instanceof Chief)
                    myListView.getItems().add(p.toString());
            }
        }

        else if (STC.getType() == "IT_Worker") {

            for (Person p : Database.getInstance().getPeople()) {

                if (p instanceof IT_worker)
                    myListView.getItems().add(p.toString());

            }
        }

        else if (STC.getType() == "Sales_person") {

            for (Person p : Database.getInstance().getPeople()) {

                if (p instanceof Sales_person)
                    myListView.getItems().add(p.toString());

            }
        }

        else if (STC.getType() == "Warehouse_worker") {

            for (Person p : Database.getInstance().getPeople()) {

                if (p instanceof Warehouse_worker)
                    myListView.getItems().add(p.toString());

            }
        }
        }


        public void back (ActionEvent event) {

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
