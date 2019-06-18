import java.util.Scanner;

public class Exercise1_1{

 public static void main (String [] args){

  Scanner Input = new Scanner(System.in);  

  int a, b, c, sum, difference, remainder;
  float product, quotient;
  double radius, area, circumference, celsius, fahrenheit;

  System.out.println("Enter the frist number:");
  a = Input.nextInt();

  System.out.println(" Enter the second number:");
  b = Input.nextInt();

  sum=a+b;
  difference=a-b;
  product=(float)a*(float)b;
  quotient=a/b;
  remainder=a%b;
  
  System.out.println("Sum: " + sum);
  System.out.println("Product: " + product);
  System.out.println("Quotient: " + quotient);
  System.out.println("Remainder: " + remainder);
  System.out.println("");

  System.out.println("Enter the radius: ");
  radius = Input.nextDouble();

  area = 3.14 * radius * radius;
  circumference = 2 * 3.14 * radius;
  System.out.println("Area: " + area);
  System.out.println("Circumference: " + circumference);
  System.out.println("");
  System.out.println("");

  System.out.println("Enter the first number: ");
  a = Input.nextInt();
  
  System.out.println("Enter the second number: ");
  b = Input.nextInt();

  System.out.println("Original First: " + a);
  System.out.println("Original Second: " + b);
  
  c = a;
  a = b;
  b = c;
  
  System.out.println("New First: " + a);
  System.out.println("New Second: " + b);
  System.out.println("");
  System.out.println("");

  System.out.println("Enter a Temperature(Celsius): ");
  celsius = Input.nextDouble();

  fahrenheit = celsius * 9 / 5 + 32;

  System.out.println("Temperature is " + fahrenheit + " Fahrenheit.");
 }
}
