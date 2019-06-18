import java.util.Scanner;

class classify_age{

 public static void main(String [] args){

 Scanner input = new Scanner(System.in);
 int age;
 
 System.out.println("Enter your age:");
 age = input.nextInt();

 if(age <= 1){
  System.out.println("This person's age categorey:infant, where infant is " + age);
 }
 else if(age >=1 && age < 3){
  System.out.println("This person's age categorey:toddler, where toddler is " + age);
 }
 else if(age >= 3 && age < 13){
  System.out.println("This person's age categorey:teenager, where teenager is " + age);
 }
 else if(age >= 18 && age < 65){
  System.out.println("This person's age categorey:adult, where adult is " + age);
 }
 else if(age >= 65){
  System.out.println("This person's age categore:senior, where senior is " + age);
 }
 }
}
