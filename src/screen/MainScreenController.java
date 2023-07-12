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

/**
 * FXML Controller class
 *
 * @author sa
 */
public class MainScreenController implements Initializable {

    /**
     * Initializes the controller class.
     */
   private Stage stage;
private Scene scene;
private  Parent root;
    @FXML
    private Button addmember;

    @FXML
    private Button addbook;

    @FXML
    private Button logout;

    @FXML
    private Button searchbook;

    @FXML
    private Button loanbook;
@FXML
    private TextField firstnameadmin;

    @FXML
    private TextField lastnameadmin;

    @FXML
    private TextField usernameadmin;
    
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
    void addmemberfun(ActionEvent event) throws IOException {
 root = FXMLLoader.load(getClass().getResource("Member.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
       scene = new Scene(root);
        stage.setTitle("Add Member");
        stage.setScene(scene);
        stage.show();
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        firstnameadmin.setText("Shaimaa Hassan");
        lastnameadmin.setText("Yasseen");
        usernameadmin.setText("Amany_Donia");
        
    }    
    
}
