import java.util.Scanner;


class convert_money{

 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  char x;
  double amount;
  double N = 0;
  System.out.println("Currency to convert to U.S. dollars: e=Euros, c=Chinese Yuan, r=Indian Rupees, b=Bitcoin.");
  x = input.next().charAt(0);
  
  
  System.out.println("Amount of Euros/Yuan/Rupees/Bitcoin to convert:");
  amount = input.nextDouble();

  if(x == 'e'){
   N = amount * 1.16; 
  }
  else if(x == 'c'){
   N = amount * 0.15;
  }
  else if(x == 'r'){
   N = amount * 0.015;
  }
  else if(x == 'b'){
   N = amount * 6923.80;
  }

  System.out.println("In U.S. dollars, that is $" + N);
 }
}
