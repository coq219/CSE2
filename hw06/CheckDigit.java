/*Conor Quinlan
7 October 2015
HW #6
This HW is an ISBN bardcode validator, checking if the user inputted a valid ISBN
*/

//Scanner import statement
import java.util.Scanner;
//  define a class
public class CheckDigit{
    //  add main method
    public static void main(String[] args) {
         //Declare instance of Scanner object and call Scanner constructor
   			    Scanner myScanner = new Scanner( System.in );
   			    //Prompt user for isbn number
                System.out.print("PLease enter a 10 digit barcode:");
                //Accepts user input
                String isbn = myScanner.next();
                boolean isRight = false;
                if (isbn.length() ==10){
                    isRight = ValidateISBN(isbn);
                }else{
                    isRight = false;
                }
                if(isRight){
                    //Print if valid
                    System.out.println("This is a valid ISBN");
                }else{
                    //Print if not valid
                    System.out.println("This is NOT a valid ISBN");
                }
}
                //Sum each digit
                private static boolean ValidateISBN(String isbn){
                    int sum = 0;
                    String j;
                    for (int i = 0; i < 10; i++){
                        j = isbn.substring(i, i+1);
                        if (i<9 || j !="X"){
                            sum+=Integer.parseInt(j)*(10-i);
                        }else{
                            sum+=10;
                        }
                    }
                    return (sum%11==0);
                }
}

