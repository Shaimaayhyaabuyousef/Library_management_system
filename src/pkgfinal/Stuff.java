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

import java.util.Objects;
public class Stuff extends User{
    private final int numberOfStuff = 1;
    private String department ;

    public Stuff(String department, String firstName, String lastName, String userName, String passWord) {
        super(firstName, lastName, userName, passWord);
        this.department = department;
    }

    public int getNumberOfStuff() {
        return numberOfStuff;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Stuff ){
            if(this.id == ((Stuff) obj) .id){
                return true;
            }
            
            else 
                return false;
                
        }else
            return false;
        
    }

    @Override
    public String toString() {
        return super.toString() +"Stuff{" + "department=" + department + '}';
    }
    
    
    

    
    
}
