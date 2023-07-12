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

public class Student extends User {
    private static int numberOfStudents  ;
    private String major ;
    private boolean ststuse = true;
    
    private int numBook = 0;

    public void setNumBook(int numBook) {
        this.numBook = numBook;
    }

    public int getNumBook() {
        return numBook;
    }
    
    public Student( String firstName, String lastName, String userName, String passWord ,String major) {
        super(firstName, lastName, userName, passWord);
        numberOfStudents += 1;
        
        this.major = major;
        this.id =   200 + numberOfStudents ; 
    }
    

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getMajor() {
        return major;
    }

    public boolean isStstuse() {
        return ststuse;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setStstuse(boolean ststuse) {
        this.ststuse = ststuse;
    }
     
  
    public boolean equal(Student obj) {
       
            if(this.userName.equals(obj.getUserName()) ){
                
                return true;
            }
            
            else 
                return false;
                
       
  
    }

    @Override
    public String toString() {
        return  super.toString()+ "Student{" + "major=" + major + ", ststuse=" + ststuse + '}';
    }
    
    
    
    
    
}
