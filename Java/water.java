import java.util.Scanner;

class water{

 public static void main(String [] args){

  Scanner input = new Scanner(System.in);
  double temp, celsius;
  
  System.out.println("Enter the temperature in Fahrenheit:");
  temp = input.nextDouble();
  celsius = (temp - 32) * 5/9; 

  if(temp <= 32){
   System.out.println("Water less than " + celsius + " celsius is solid.");
  }
  else if(temp >= 212){
   System.out.println("Water greater than " + celsius + " celsius is gas");
  }
  else
  System.out.println("Water at " + celsius + " celsius is liquid");
 
 }
}
