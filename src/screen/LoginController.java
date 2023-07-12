/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * FXML Controller class
 *
 * @author sa
 */
public class LoginController implements Initializable {
private Stage stage;
private Scene scene;
private  Parent root;
    /**
     * Initializes the controller class.
     */
     @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button login;
 @FXML
    private Button exit;

   
    @FXML
    void loginfun(ActionEvent event) throws IOException {
      if( username.getText().equals("Admen") && password.getText().equals("12345")){
  root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
        stage.setTitle("Main Screen");
        stage.setScene(scene);
        stage.show();
    }else {
      username.clear();
      password.clear();
     showMessageDialog(null,"wrong in user Name or Password");
      }
      
    }
    
     @FXML
    void exitefun(ActionEvent event) {
     System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
