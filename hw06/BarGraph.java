/*Conor Quinlan
7 October 2015
HW #6
This HW creates a bar graph of weekly expenses, averages the weekly expenses, and estimates the 4 year expense expenditure
*/


//Scanner import statement
import java.util.Scanner;
//  define a class
public class BarGraph{
    //  add main method
    public static void main(String[] args) {
        //Declare instance of Scanner object and call Scanner constructor
   			    Scanner myScanner = new Scanner( System.in );
   			    //Prompt user for expenses for each day of the week
                System.out.print("Enter expenses for Monday in the form xx.xx:");
                //Accepts user input
                double mondayExpenses = myScanner.nextDouble();
                //Prompt user for expenses for each day of the week
                System.out.print("Enter expenses for Tuesday in the form xx.xx:");
                //Accepts user input
                double tuesdayExpenses = myScanner.nextDouble();
                //Prompt user for expenses for each day of the week
                System.out.print("Enter expenses for Wednesday in the form xx.xx:");
                //Accepts user input
                double wednesdayExpenses = myScanner.nextDouble();
                //Prompt user for expenses for each day of the week
                System.out.print("Enter expenses for Thursday in the form xx.xx:");
                //Accepts user input
                double thursdayExpenses = myScanner.nextDouble();
                //Prompt user for expenses for each day of the week
                System.out.print("Enter expenses for Friday in the form xx.xx:");
                //Accepts user input
                double fridayExpenses = myScanner.nextDouble();
                //Prompt user for expenses for each day of the week
                System.out.print("Enter expenses for Saturday in the form xx.xx:");
                //Accepts user input
                double saturdayExpenses = myScanner.nextDouble();
                //Prompt user for expenses for each day of the week
                System.out.print("Enter expenses for Sunday in the form xx.xx:");
                //Accepts user input
                double sundayExpenses = myScanner.nextDouble();
                //round the expenses
                double roundedMonday = mondayExpenses + 0.50;
                double roundedTuesday = tuesdayExpenses + 0.50;
                double roundedWednesday = wednesdayExpenses + 0.50;
                double roundedThursday = thursdayExpenses + 0.50;
                double roundedFriday = fridayExpenses + 0.50;
                double roundedSaturday = saturdayExpenses + 0.50;
                double roundedSunday = sundayExpenses + 0.50;
                
                String Mon="";
                for (int i=0; i<(int)(roundedMonday); i++){
                    Mon=Mon.concat("*");
                }
                String Tues="";
                for (int i=0; i<(int)(roundedTuesday); i++){
                    Tues=Tues.concat("*");
                }
                String Wed="";
                for (int i=0; i<(int)(roundedWednesday); i++){
                    Wed=Wed.concat("*");
                }
                String Thu="";
                for (int i=0; i<(int)(roundedThursday); i++){
                    Thu=Thu.concat("*");
                }
                String Fri="";
                for (int i=0; i<(int)(roundedFriday); i++){
                    Fri=Fri.concat("*");
                }
                String Sat="";
                for (int i=0; i<(int)(roundedSaturday); i++){
                    Sat=Sat.concat("*");
                }
                String Sun="";
                for (int i=0; i<(int)(roundedSunday); i++){
                    Sun=Sun.concat("*");
                }
                System.out.println("Mon: " + Mon);
                System.out.println("Tues: " + Tues);
                System.out.println("Wed: " + Wed);
                System.out.println("Thu: " + Thu);
                System.out.println("Fri: " + Fri);
                System.out.println("Sat: " + Sat);
                System.out.println("Sun: " + Sun);
                
                //Average
                double average=((mondayExpenses+tuesdayExpenses+wednesdayExpenses+thursdayExpenses+fridayExpenses+saturdayExpenses+sundayExpenses)/7.00);
                //Make the average have 2 decimal points
                double averageRound = ((int)(average*100))/((double)100.0);
                System.out.println("Your average daily expenses are: $" + averageRound);
                
                
                double fouryear=0;
                double k =(double)(Math.random()*40-20)/100;
     
                for (int i=0;i<=208;i++){
                    fouryear+=((1+k)*average);
                }
                double fouryearRound = ((int)(fouryear*100))/((double)100.0);
                System.out.println("Estimated expenditure for 4 years: $" + fouryearRound);
                
}
}


                