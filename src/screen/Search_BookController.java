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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pkgfinal.Arrays;
import static pkgfinal.Arrays.booksList;
import static pkgfinal.Arrays.booksloansList;
import static pkgfinal.Arrays.studentsList;
import pkgfinal.Book;
import pkgfinal.Book_Loan;
import pkgfinal.Student;

/**
 * FXML Controller class
 *
 * @author sa
 */
public class Search_BookController implements Initializable {

    /**
     * Initializes the controller class.
     */
     private Stage stage;
private Scene scene;
private  Parent root;
 @FXML
    private Label statusebook;
 @FXML
    private Label finaval;

    @FXML
    private Label statusemamber;

     @FXML
    private Button addmember;

    @FXML
    private Button addbook;

    @FXML
    private Button searchbook;

    @FXML
    private Button loanbook;

    @FXML
    private Button logout;

    @FXML
    private Button search;

    @FXML
    private TextField id;

   
     @FXML
    private TextField username;

   

    @FXML
    private Button Searchastudent;

  
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
    void searchfun(ActionEvent event) {
        
    for(int i=0;i<booksList.size();i++){
        if (id.getText().equals(booksList.get(i).getID())){
            statusebook.setText("True");            
            break;
    }
        else
            statusebook.setText("False");
}
    }
      @FXML
    void Searchastudentfun(ActionEvent event) {
    for(int i=0;i<studentsList.size();i++){
    if (username.getText().equals(studentsList.get(i).getUserName())){
    statusemamber.setText("True");
    for(int j=0; j<booksloansList.size();j++){
    if (booksloansList.get(j).getBorrower().equal(studentsList.get(i)))
     finaval.setText(booksloansList.get(j).calFine()+"");
     
        }
       break;
    }
    else
        statusemamber.setText("False");
}}
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
    }    
}

