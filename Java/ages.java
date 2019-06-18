import java.util.Scanner;


class ages{

 public static void main(String [] args){

  Scanner input = new Scanner(System.in);

  int user, friend;
  
  System.out.print("Enter your age:");
  user = input.nextInt();
  System.out.print("Enter your friend's age:");
  friend = input.nextInt();

  if(user >= friend){
   System.out.println("You are older or the same age as your friend.");
   }
  else{
    System.out.println("You are younger than your friend.");
   }
  
  }
}
