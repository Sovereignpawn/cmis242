/*  File:     Project1Driver.java
 *  Author:   Matthew Dwyer
 *  Date:     3 November 18
 *  Purpose:  Demonstrate understanding of Java
 */
import java.util.*;
public class Project1Driver {
  // Read a name acn compart it to the name "Matthew Dwyer"
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    Name someName = new Name("Matthew", "Dwyer");
    System.out.print("Please enter a name: ");
    Name anotherName = new Name();
    anotherName.input(stdin);
    if (someName.equals(anotherName))
      System.out.println("The names match.");
    else {
      System.out.println ("The names do not match.");
      someName.output(System.out);
      anotherName.output(System.out);
    }
  }
}
