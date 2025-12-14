package application;

import java.sql.Connection;

import dao.mysql;
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
    	mysql con = new mysql();
        Connection connection = con.connect(); // هنا الاتصال بقاعدة البيانات

        if(connection != null) {
            System.out.println("Connected to MySQL successfully!");
        } else {
            System.out.println("Failed to connect to MySQL.");
        }

    }

}

