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

public class ContainingController {

    @FXML
    private Button search;
    @FXML
    private TextField keyword;
    private static String string_keyword;
    private Stage stage;

    public void search(ActionEvent event) throws IOException {

        string_keyword = this.keyword.getText();

        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.close();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../../Resources/Menu.fxml"));
        loader.load();
        MenuController controller = loader.getController();

        Parent root;
        root = FXMLLoader.load(getClass().getResource("../../Resources/ShowContaining.fxml"));
        stage = controller.getMain_stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public static String getString_keyword() {

        return string_keyword;
    }

}
