//Conor Quinlan
//Timer Java Program
//
//  first compile the program
//      javac Timer.java
//  run the program
//      java Timer//
//This program will use the Scanner class to obtain the current time and dinner time from the user
//The program will determine the time remaining until the user eats dinner

//Scanner import statement
import java.util.Scanner;

//  define a class
public class Timer{
    	// main method required for every Java program
   			public static void main(String[] args) {
   			    //Declare instance of Scanner object and call Scanner constructor
   			    Scanner myScanner = new Scanner( System.in );
   			    //Prompt user for current time in military time as an integer HHMM
                System.out.print("Enter the current time: ");
                //Accepts user input
                int currentTime = myScanner.nextInt();
                //Prompt user for the time they will be eating dinner in military time as an integer HHMM
                System.out.print("Enter the time that you will be eating dinner: ");
                //Accepts user input
                int dinnerTime = myScanner.nextInt();
                //Output the time remaining until the user eats dinner
                //Declaration
                int remainingTimeHours;
                //Hours remaining
                remainingTimeHours = ((dinnerTime - currentTime) / 100);
                //Declaration
                int dinnerMinutes;
                //Calculates total minutes in day at dinnner time
                dinnerMinutes =  (((dinnerTime / 100)*60) + (dinnerTime % 100));
                //Declaration
                int currentMinutes;
                //Calculates total minutes in day at current time
                currentMinutes = (((currentTime / 100)*60) + (currentTime % 100));
                //Declaration
                int remainingTimeMinutes;
                //Minutes remaining
                remainingTimeMinutes = ((dinnerMinutes-currentMinutes) % 60);
                //Display results
                System.out.println("You have " + remainingTimeHours + " hours and " + remainingTimeMinutes + " minutes until dinner.");
     }  //end of main method   
}  //end of class
                
