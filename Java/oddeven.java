import java.util.Scanner;

class oddeven{

 public static void main(String [] args){

  Scanner input = new Scanner(System.in);

  int num;
   
  System.out.print("Please enter a number:");
  num = input.nextInt();

  if(num % 2 == 0){
   System.out.println("You enter an odd even number.");
   }
   else{
   System.out.println("You enter an odd number.");
   }


 }

}
