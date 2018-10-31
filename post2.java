/*  File:     post2.Java
 *  Auhor:    Matthew Dwyer
 *  Date:     31 Oct 2018
 *  Purpose:  Demonstrate knowledge of static variables
 */
import java.util.*; //  Invoke java.util library which contains the scanner
/**
 *  The following class will ask the user a question, scan the user input
 *  save the input as a variable reduce the users input by a static variable value
 *  Then, inform the user of the difference between the values
 */
public class post2 {
  public static int StartYear = 1900;
  public static void main(String[] args) {
    // Variable declaration
    int yearBorn = 1900;
    int yearDelta = 0;

    Scanner scannerIn = new Scanner(System.in); //  Connect input to the variable "scannerIn"
    /*
     *  The following block of code ask the user a question
     *  Then it subtracts the StartYear variable form the users input and reports that back to the
     *  user
     */
    System.out.print("What year were you born? :>");
    yearBorn = scannerIn.nextInt();
    /*
     *  The following block preforms a calculation and reports the value back to the user
     */
    yearDelta = yearBorn - StartYear ;
    System.out.println("You were born "+yearDelta+"  after the year 1900");
  }// end method main
}// end class post2
