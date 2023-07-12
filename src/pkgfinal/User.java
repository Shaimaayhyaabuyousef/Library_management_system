/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author sa
 */

import java.util.Date;
public abstract class User {
    private String firstName ;
    private String lastName ;
    protected String userName;
    private String passWord ;
    private java.util.Date dateOfRegistration ;
    protected int id ;

    public User(String firstName, String lastName, String userName, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.passWord = passWord;
        this.dateOfRegistration = new Date();
       
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", passWord=" + passWord + ", dateOfRegistration=" + dateOfRegistration + ", id=" + id + '}';
    }
}
