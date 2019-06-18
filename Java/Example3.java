/*Example3.java
    Author- Anita Rathi
      This program demonstrates  :
        - System.in
          - System.out.print()
            - Syntax of Variable declaration
              - Taking Input
                - next()
                  - Concatenation Operator
                   */
import java.util.Scanner;
public class Example3
{
  public static void main(String [] args)
 {
  Scanner Input=new Scanner(System.in); //Input is an object of Scanner class
  String fname,lname,fullname;
  System.out.print("Enter your first name:");//Displaying prompt
  fname=Input.next();//Input.next() is used for reading next word Here Input is an object and next() is a method
  System.out.print("Enter your last name:");
  lname=Input.next();
  fullname=fname+" "+lname;//+ used as concatenation operator
  System.out.println("Full Name=" + fullname);//Displaying string literal and variable's value
 }
}
