/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

/**
 *
 * @author sa
 */
public class Book_Loan {
    
     private Student borrower;
   private LocalDate dateFrom;
   private double Finalval;
   private LocalDate dateReturned;
   
    private String ID;
    private String title;
    


    public Book_Loan(Student borrower,  String ID, String title) {
        this.borrower = borrower;
       
        
         dateFrom = LocalDate.now();
        dateReturned = dateFrom.plusDays(3);
       
       
        this.ID = ID;
        this.title = title;
    }

  

    public Student getBorrower() {
        return borrower;
    }

    public void setBorrower(Student borrower) {
        this.borrower = borrower;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }



    public double calFine(){
        long daysLate ,  monthsLate , YearsLate;
        if (dateReturned.getYear() == LocalDate.now().getYear()){
            if(dateReturned.getMonth() == LocalDate.now().getMonth()){
                daysLate = ChronoUnit.DAYS.between(dateReturned, LocalDate.now());
                if(daysLate > 0)
                    return  Finalval = daysLate * 1.5;
                else
                    return  Finalval = 0;
            }
            else{
               monthsLate = ChronoUnit.MONTHS.between(dateReturned, LocalDate.now());
               
           
               return  Finalval =  monthsLate * 45;
            }
        } 
        else {
              YearsLate = ChronoUnit.YEARS.between(dateReturned, LocalDate.now());
                   return  Finalval = YearsLate * 540;  
        }
    } 
  

    public LocalDate getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(LocalDate dateReturned) {
        this.dateReturned = dateReturned;
    }

    @Override
    public String toString() {
        return "Book_Loan{" + "borrower=" + borrower +  ", dateFrom=" + dateFrom + ", Finalval=" + Finalval + ", dateReturned=" + dateReturned + '}';
    }

   
}
