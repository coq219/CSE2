//Conor Quinlan
//Check Java Program
//
//  first compile the program
//      javac Check.java
//  run the program
//      java Check//
//This program will use the Scanner class to obtain the original cost of the check, percentage tip, and the number of ways the check will be split
//The program will determine how much each person needs to pay for the check

//Scanner import statement
import java.util.Scanner;

//  define a class
public class Check{
    	// main method required for every Java program
   			public static void main(String[] args) {
   			    //Declare instance of Scanner object and call Scanner constructor
   			    Scanner myScanner = new Scanner( System.in );
   			    //Prompt user for original cost of check
                System.out.print("Enter the original cost of the check in the form xx.xx:");
                //Accepts user input
                double checkCost = myScanner.nextDouble();
                //Prompt user for tip percentage they wish to pay
                System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):" );
                //Accepts user input
                double tipPercent = myScanner.nextDouble();
                tipPercent /= 100; //We want to convert the percentage into a decimal value
                //Prompt user for number of people who went out to dinner
                System.out.print("Enter the number of people who went out to dinner:");
                //Accepts user input
                int numPeople = myScanner.nextInt();
                //Output the amount that each member of the group needs to spend in order to pay the check
                double totalCost;
                double costPerPerson;
                int dollars,   //whole dollar amount of cost 
                      dimes, pennies; //for storing digits
                          //to the right of the decimal point 
                          //for the cost$ 
                totalCost = checkCost * (1 + tipPercent);
                costPerPerson = totalCost / numPeople;
                //get the whole amount, dropping decimal fraction
                dollars=(int)costPerPerson;
                //get dimes amount, e.g., 
                // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
                //  where the % (mod) operator returns the remainder
                //  after the division:   583%100 -> 83, 27%5 -> 2 
                dimes=(int)(costPerPerson * 10) % 10;
                pennies=(int)(costPerPerson * 100) % 10;
                System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);
     }  //end of main method   
}  //end of class
