/* File: Project1.java
 * Author:  Matthew Dwyer
 * Date:    4 Nov 2018
 * Purpose: Demonstrate understanding of week 2 content
 */

import java.util.*; // invoke java.util libray which contains the scanner
import java.io.*; // invoke java.io.libray which allows input and output for reading and writing

/** The following class will...
 * ?
 * /
 */

// Class that creats an object which is the first and last name of an employee
public class Name {
  //Instance variables
  private String firstName, lastName;
  //Default constructor
  public Name (){
    firstName = "";
    lastName = "";
  }
  //Constructor with arguments
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  //compare tow Name objects for equality
  public boolean equals(Name other) {
    return lastName.equalsIgnoreCase(other.lastName) &&
           firstName.equalsIgnoreCase(other.firstName);
  }
  // present an object as a string "lastname, firstname"
  public String toString() {
  return lastName +", "+ firstName;
  }
  //read a name from the supplied input
  public void input (Scanner in) {
    if (in.hasNext()) firstName = in.next();
    if (in.hasNext()) lastName = in.next();
  }
  //Output name
  public void output (PrintStream out) {
    out.println(this);
  }
}

