import java.util.Scanner;


class bill{

 public static void main(String [] args){

  Scanner input = new Scanner(System.in);
  
  String item1_name, item2_name, item3_name;//Declare String variables
  item1_name = item2_name = item3_name = ""; //Initialize variables with empty values
  int item1_quantity, item2_quantity, item3_quantity;
  item1_quantity = item2_quantity = item3_quantity = 0;
  double item1_price, item2_price, item3_price;
  item1_price = item2_price = item3_price = 0;
  
  int size = 3; //Set up the size of array
  // Initialize array with size
  int [] num = {1, 2, 3};
  String[] item_names = new String[size];
  int item_quanities[] = new int[size];
  double item_prices[] = new double[size];
  double item_totals[] = new double[size];
  double sum = 0;
  double tax = 0;
  double general_total = 0;
  
  for(int i = 0; i < size; i++){
  System.out.println("Input name of item " + num[i]);
  String name = input.nextLine();//Readig the whole line of input
  item_names[i] = name;
  System.out.println("Input quantity of item " + num[i]);
  int quantity = input.nextInt();
  input.nextLine(); //Throw away the '\n' which contained the buffer during inside the for loop
  item_quanities[i] = quantity;
  System.out.println("Input price of item " + num[i]);
  double price = input.nextDouble();
  input.nextLine();//Throw away the '\n' which contained the buffer during inside the for loop
  item_prices[i] = price;
  double total = item_quanities[i] * item_prices[i];
  item_totals[i] = total;
  }
  
  System.out.println();

 System.out.println("Your bill:");
 System.out.println("Item          Quantity     Price     Total");
 for(int i = 0; i < size; i++){
 System.out.printf("%-17s%-10d$%.2f     $%.2f%n", item_names[i], item_quanities[i], item_prices[i], item_totals[i]); // item_names with 17 characters long on the right handside, item_quanities with 10 characters long on the right handside, item_prices with 2 digits after decimal point, and so on
 sum += item_totals[i];
  }
 System.out.printf("Subtotal%34.2f%n", sum);
 tax = sum * 0.0625;
 general_total = sum + tax;
 System.out.printf("6.25%% sales tax%27.2f%n", tax);
 System.out.printf("Total%37.2f%n", general_total);
 } 
}
