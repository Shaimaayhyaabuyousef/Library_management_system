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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pkgfinal.Arrays;
import pkgfinal.Student;

/**
 * FXML Controller class
 *
 * @author sa
 */
public class MemberController implements Initializable {
 private Stage stage;
private Scene scene;
private  Parent root;

 @FXML
    private TextField firstnam ;

    @FXML
    private Button stormember;

    @FXML
    private Button addbook;

    @FXML
    private Button logout;

    @FXML
    private Button searchbook;

    @FXML
    private Button loanbook;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private TextField lastname;

    @FXML
    private TextField major;
    /**
     * Initializes the controller class.
     */
   

   

   @FXML
    void addbookfun(ActionEvent event) throws IOException {
root = FXMLLoader.load(getClass().getResource("Add_Book.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       scene = new Scene(root);
        stage.setTitle("Add Book");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void addmemberfun(ActionEvent event) {
        
    }
    @FXML
    void addmember(ActionEvent event) {
        Arrays.studentsList.add(new Student( firstnam.getText(), lastname.getText(), username.getText(), password.getText() ,major.getText()));
    }

    @FXML
    void loanbookfun(ActionEvent event) throws IOException {
root = FXMLLoader.load(getClass().getResource("Loan_Book.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       scene = new Scene(root);
        stage.setTitle("Loan Book");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void logoutfun(ActionEvent event) throws IOException {
root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       scene = new Scene(root);
       
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void searchbookfun(ActionEvent event) throws IOException {
root = FXMLLoader.load(getClass().getResource("Search_Book.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       scene = new Scene(root);
       
        stage.setScene(scene);
        stage.show();
    }
@FXML
    void stormemberfun(ActionEvent event) {
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
