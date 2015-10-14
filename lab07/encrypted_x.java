/*Conor Quinlan
9 October 2015
Lab #7
This lab uses loops and break statements to encrypt the letter x
*/

//Scanner import statement
import java.util.Scanner;
//  define a class
public class encrypted_x{
    //  add main method
    public static void main(String[] args) {
        //Declare instance of Scanner object and call Scanner constructor
   			    Scanner myScanner = new Scanner( System.in );
   			    //Prompt user for integer between 0-100
                System.out.print("Enter an integer between 0-100:");
                //Accepts user input
                //int input = myScanner.nextInt();
                
                //an integer to store the user input
                int myInt = 0;

                //a switch to decide if you want to ask again
                boolean acceptable = false;

                //loop until you get acceptable input (i.e. if it's an integer)
                System.out.print("Input your integer: ");
                while( !acceptable ){
                //check if the input is an integer.
                if (myScanner.hasNextInt() ){
                //if so, store it.
                myInt = myScanner.nextInt();
                if (myInt>=0 && myInt<=100){
                    acceptable = true;
                    }
                    else{
                        System.out.println("Input is not in range");
                        System.out.print("Input your integer: ");
                    }
                }
                else{
                //if not, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("   ERROR: need a integer");
                System.out.print("Input your integer: ");
                myScanner.next();
                }
                } 
                for(int i = 0; i < input; i++)
}
}