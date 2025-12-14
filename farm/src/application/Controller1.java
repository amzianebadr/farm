package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller1 {

    @FXML
    private TextField Password;

    @FXML
    private TextField name;
    @FXML
    void enter(ActionEvent event) {
    	System.out.println("Name : "+name.getText()+" Password : "+Password.getText());

    }

}

