import java.util.Scanner;


class preference{
 
public static void main(String [] args){

  Scanner input = new Scanner(System.in);
  
   int pizza, tacos;
   System.out.print("How much do you like pizza on a scale of 1(hate) to 5(love)?");
   pizza = input.nextInt();
   System.out.print("How much do you like tacos on scale of 1(hate) to 5(love)?");
   tacos  = input.nextInt();

   if(pizza > tacos){
    System.out.println("You like pizzas more than tacos.");
   }
   else if(tacos > pizza){
    System.out.println("You like tacos more than pizzas.");
   }
 } 

}
