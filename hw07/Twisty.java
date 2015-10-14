/*Conor Quinlan
14 October 2015
HW #7
This hw will ask the user for length and width to generate a pattern
*/

//Scanner import statement
import java.util.Scanner;
//  define a class
public class Twisty{
    //  add main method
    public static void main(String[] args) {
        //Declare instance of Scanner object and call Scanner constructor
   			    Scanner myScanner = new Scanner( System.in );
   			    //Prompt user for integer for length
                System.out.print("Input your desired length:");
                //Accepts user input
                //int input = myScanner.nextInt();
                
                //an integer to store the user input
                int myLength = 0;

                //a switch to decide if you want to ask again
                boolean acceptable = false;

                //loop until you get acceptable input (i.e. if it's an integer)
                //System.out.print("Input your integer: ");
                while( !acceptable ){
                //check if the input is an integer.
                if (myScanner.hasNextInt() ){
                //if so, store it.
                myLength = myScanner.nextInt();
                if (myLength>=0 && myLength<=80){
                    acceptable = true;
                    }
                    else{
                        System.out.println("Input is not in range");
                        System.out.print("Input your desired length:");
                    }
                }
                else{
                //if not, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("Error: please type in an integer.");
                System.out.print("Input your desired length:");
                myScanner.next();
                }
                } 
                //Prompt user for integer for width
                System.out.print("Input your desired width:");
                //Accepts user input
                //int input = myScanner.nextInt();
                
                //an integer to store the user input
                int myWidth = 0;

                //a switch to decide if you want to ask again
                boolean acceptableWidth = false;

                //loop until you get acceptable input (i.e. if it's an integer)
                //System.out.print("Input your integer: ");
                while( !acceptableWidth ){
                //check if the input is an integer.
                if (myScanner.hasNextInt() ){
                //if so, store it.
                myWidth = myScanner.nextInt();
                if (myWidth<=myLength){
                    acceptableWidth = true;
                    }
                    else{
                        System.out.println("Error: Please input an integer smaller than the length.");
                        System.out.print("Input your desired width:");
                    }
                }
                else{
                //if not, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("Error: please type in an integer.");
                System.out.print("Input your desired width:");
                myScanner.next();
                }
                }
                //loop to create number of lines generated
                for( int n = 0; n < myWidth; n++ ) {
                    //loop that controls characters on each line
                    for( int m = 0; m < myLength; m++ ) {
                        if( m == n || n == myLength - m - 1) {
                        System.out.print("#");
                        }
                        else {
                        System.out.print(" ");
                        }
                        if( m == n || n == myWidth - m - 1) {
                        System.out.print("/");
                        }
                        else {
                        System.out.print(" ");
                        }
                        if( m == n || n == myWidth - m - 1) {
                        System.out.print("\\");
                        }
                        else {
                        System.out.print(" ");
                        }
                    }
                    System.out.println();
                    }
                    
}
}