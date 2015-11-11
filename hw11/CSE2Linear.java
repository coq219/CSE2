/*Conor Quinlan
10 November 2015
HW 11
This HW uses arrays to search through 15 ints entered by the user
*/

//Scanner import statement
import java.util.Scanner;
//define a class
public class CSE2Linear{
    //add main method
    public static void main(String[] args) {
    //Declare instance of Scanner object and call Scanner constructor
   			    Scanner myScanner = new Scanner( System.in );
   			    //Prompt user for input
   			    System.out.println("Enter 15 ints for final grades in CSE2: ");
   			    //Array of size 15
   			    int[] csGrades = new int[15];
                //Create validation boolean
                boolean validation = false; 
                    for(int i=0;i<15;i++) { 
                        while( !validation ){ 
                        //Checks if input is an int
                        if(myScanner.hasNextInt()) { 
                            csGrades[i] = myScanner.nextInt();
                                //Checks if input is between 0-100
                                if(csGrades[i]>=0 && csGrades[i]<=100) { 
                                    if(i==0) {
                                    validation=true;
                                    }
                                    //Checks if input is larger than last input
                                    if(i>0 && (csGrades[i]>=csGrades[i-1])) {
                                    validation=true;
                                    }
                                }
                            //Error for input not between 0-100
                            if(csGrades[i]<0 || csGrades[i]>100) { 
                            System.out.print("Error: Enter int between 0-100: ");
                            }
                            //Error for input smaller than last input
                            if((i>0)&&(csGrades[i]<csGrades[i-1])) { 
                            System.out.print("Error: Enter int greater than previous input: ");
                            }
                        }
                        //Error for input other than an integer
                        else{ 
                        System.out.print("Error: Enter an integer: ");
                        myScanner.next();
                        }
                        }
                        //Set validation boolean to false
                        validation=false;
                    }   
    //Sorted    
        //Spacing
        System.out.println("");
        //Run print method for sorted grades
        print(csGrades,"Sorted:");
        //Prompt user to enter a number to search
        System.out.print("Enter a grade to search for: ");
        //Accepts input
        int userNumber = myScanner.nextInt();
        //Run search method
    //Scrambled    
        search(csGrades,userNumber);
        //Run scramble method
        scramble(csGrades);
        //Spacing
        System.out.println("");
        //Run print method for scrambled grades
        print(csGrades,"Scrambled:");
        //Prompt user to enter a number to search
        System.out.print("Enter a grade to search for: ");
        //Acceptts input
        userNumber = myScanner.nextInt();
        //Run search method
        search(csGrades,userNumber);
    }
    //Linear search method
    public static void search(int[] csGrades,int userNumber) { 
        //Iteration variable
        int counter=0;
        boolean isFound=false;
        for(int i=0;i<15;i++){ 
        counter++; 
            //if statement for if number was found
            if(csGrades[i] == userNumber){
            isFound=true;
            System.out.println(userNumber + " was found in the list with " + (i+1) + " iterations");
            //Stop if the number was found
            break; 
            }
        }
        //if statement for if number was not found
        if(isFound == false){ 
        System.out.println(userNumber + " was not found in the list with " + counter + " iterations");
        }
    }
	//Print method	    
   	public static void print(int[] otherGrades,String one) { 
        String prints=one;
        for(int i=0;i<otherGrades.length;i++) { 
            prints+=(otherGrades[i]+" ");
        }
        System.out.println(prints); 
    }
    //Scramble method
    public static int[] scramble(int[] otherGrades){
        for (int i=0; i<otherGrades.length; i++){
            //Random number
	        int swap = (int)(otherGrades.length * Math.random());
	        //Swap grades using temp int
	        int temp = otherGrades[swap];
	        otherGrades[swap] = otherGrades[i];
	        otherGrades[i] = temp;
        }
        return otherGrades;
    }
} 
                    