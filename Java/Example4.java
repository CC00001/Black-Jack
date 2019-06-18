/*Example4.java
  Author- Anita Rathi
  This program demonstrates  :
  - float data type
  - nextFloat()
  - Arithmetic Operator

  Program accepts the  length and breadth of a rectangle from user. It calculates the area 
  and perimeter of the rectangle, and displays them.
 */

import java.util.Scanner;

public class Example4
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in); //Input is an object of Scanner class
		float length, breadth, area,  perimeter;
		System.out.print("Enter length:");//Displaying prompt
		length=Input.nextFloat();//Input.nextFloat() is used for reading floating point number from console
		//Here Input is an object and nextFloat() is a method
		System.out.print("Enter breadth:");
		breadth=Input.nextFloat();
		area=length*breadth;//* is the multiplication operator
		//= is the assignment operator
		perimeter=2*(length+breadth);
		System.out.println("Area=" + area);//Displaying string literal and variable's value
		System.out.println("Perimeter=" + perimeter);
	}
}
