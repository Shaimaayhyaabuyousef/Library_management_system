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
public class Book {
    
    private String title;
    private String publisher;
    private String auther;
    private String year;
    private String ID;
    private Boolean status;
   
    private static int numberOfBooks;

    public Book() {
    }

    public Book(String title, String publisher, String auther, String year, String ID) {
        this.title = title;
        this.publisher = publisher;
        this.auther = auther;
        this.year = year;
        this.ID = ID;
       
       
        this.numberOfBooks+=1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


    public static  int getNumberOfCopies() {
        return numberOfBooks;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfBooks = numberOfCopies;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", publisher=" + publisher + ", auther=" + auther + ", year=" + year + ", ID=" + ID + ", status=" + status + ", numberOfCopies=" + numberOfBooks + '}';
    }
    
    
    
    
    }
    


