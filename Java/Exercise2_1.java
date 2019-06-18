import java.util.Scanner;

class Exercise2_1{

 public static void main(String [] args){

 Scanner input = new Scanner(System.in);

 String d;
 double Degrees_C, Degrees_F, temp;

 System.out.println("Enter a sentence end with ?/!:");
 String sentence = input.nextLine();//Read the whole line of the string until the end of  '\n'
 
 
 //System.out.println(sentence.replace(regex, ""));
 
 //Expression by using charAt() to return the last character of the string
 switch(sentence.charAt(sentence.length() - 1)){
  case '?':if(((sentence.replaceAll(" ", "")).length() - 1) % 2 == 0){ //If the case is '?', then using replaceAll() to trim all spaces inside the string, and caluate the actual length of the string without '?'
            System.out.println("Yes");
           }
           else{
            System.out.println("No"); 
           }           
           break;
  case '!': System.out.println("Wow");
           break;
  default: System.out.println('"' + sentence + '"');                          
  }

 System.out.println("Enter a temperature with (C/c OR F/f):");
 d = input.nextLine();//Read the whole line of the string until '\n'
 
 //System.out.println(d.substring(0, d.length() - 1));
 switch(d.charAt(d.length() - 1)){
  case 'c':
  case 'C':Degrees_C = Double.parseDouble(d.substring(0, d.length() - 1));//Using substring() to cast the string value between startIndex and endIndex, and Double.parseDouble() to parse string to double value
           Degrees_F = (9 * (Degrees_C / 5)) + 32; 
           System.out.printf("%.2f Fahrenheit.%n", Degrees_F);
  break;
  case 'f':
  case 'F':Degrees_F = Double.parseDouble(d.substring(0, d.length() - 1));
           Degrees_C = 5 * (Degrees_F - 32) / 9;
           System.out.printf("%.2f Celsius.%n", Degrees_C);
  break;
  default:System.out.println("Format was wrong.");

  } 
  
 }
}
