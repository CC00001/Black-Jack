import java.util.Scanner;


class sort_names{

 public static void main(String [] args){

  Scanner input = new Scanner(System.in);

  String firstname, secondname;
  System.out.print("Enter the first name:");
  firstname = input.next();
  System.out.print("Enter the second name:");
  secondname = input.next();

  if(secondname.compareTo(firstname) > 0){
   System.out.println(firstname + ", " + secondname);
    }
   else{
    System.out.println(secondname + ", " + firstname);
    }

 }
}
