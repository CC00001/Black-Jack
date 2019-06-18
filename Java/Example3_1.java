import java.util.Scanner;

public class Example3_1{

 public static void main(String [] args){

  Scanner input = new Scanner(System.in);
  String s1, s2;
  System.out.print("Enter a string:");
  s1=input.next();
  s2="Shit";

 if(s1.equals(s2)){
 System.out.println("Same");
  }
  else{
   System.out.println("NOT Same");
  }

 } 
}
