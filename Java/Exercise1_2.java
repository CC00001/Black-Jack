import java.util.Scanner;

class Exercise1_2{

public static void main(String [] args){
 Scanner input = new Scanner(System.in);

 int x, seconds, minutes, hours, ten, five, one, fifty_cents, quater, dime, penny;
 double P, F ,r, n, money;
 System.out.println("Enter a number for seconds: ");
 x = input.nextInt();
 
 seconds = x % 60;
 minutes = (x % 3600) / 60;
 hours = x / 3600;

 System.out.println("Hours=" + hours);
 System.out.println("Minutes=" + minutes);
 System.out.println("Seconds=" + seconds);
 System.out.println("\n");
 System.out.println("Enter the amount you want to grant: ");
 F = input.nextDouble();
 System.out.println("Enter the rate of interest: ");
 r = input.nextDouble();
 System.out.println("For how many years: ");
 n = input.nextInt();
 
 r %= 100;
 P =  F / Math.pow((1 + r), n);

 System.out.println("You need to deposit $" + P + ".");  
 System.out.println("\n");
  
 System.out.println("Enter the money you want to exchange: ");
 money = input.nextDouble();
 
 if(money > 100){
   ten = (int)money / 10;
   money -= (ten * 10); 
  }
 else if(money > 5){
   five = (int)money / 5;
   money -= (five * 5); 
  }
 else if(money < 5){
   one = (int)money / 1;
   money -= (one * 1);
  }
 else if(money < 1){
   fifty_cents = (double)money % 50;
   money -= (fifty_cents * .50);
  }

 System.out.println("$10=" + ten + "\n" + "$5=" + five + "\n" + "$1=" + one + "\n" + "50 cents=" + fifty_cents + "\n");
 
 }
}
