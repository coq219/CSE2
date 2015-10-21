/*Conor Quinlan
20 October 2015
HW 8
This hw uses multiple methods to determine if a string's characters are letters
*/

//Scanner import statement
import java.util.Scanner;
//  define a class
public class StringAnalysis{
     //  add main method
    public static void main(String[] args) {
        //Declare instance of Scanner object and call Scanner constructor
   			    Scanner myScanner = new Scanner( System.in );
   			    //Prompt user for string
                System.out.print("Enter a string: ");
                //Accepts user input
                String str = myScanner.next();
                System.out.print("Do you want to examine all the characters? yes or no: ");
                //Accepts user input
                String yesNo = myScanner.next();
                while(!yesNo.equals("yes") && !yesNo.equals("no")){
                    System.out.println("Not an acceptable input");
                    System.out.print("Do you want to examine all the characters? yes or no: ");
                    yesNo = myScanner.next();
                }
                /*Unable to determine how to do the rest of the assignment
                //if user wants to evaluate all characters
                if (yesNo.equals("yes")){
                    String myString = check(str);
                    System.out.println(myString);
                }
                //if user only does not want to evaluate all characters
                
    }
    public static boolean check (String a){
        String chara;
        if(chara >='a' && chara <='z'){
            return true;
            System.out.println("String is all letters");
        }
        else{
            return false;
            System.out.println("String is not all letters");
        }
    }
    /*public static boolean check (String a, int b){
        str.charAt(int b)
    }*/
}
}