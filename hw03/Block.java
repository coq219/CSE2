//Conor Quinlan
//Block Java Program
//
//  first compile the program
//      javac Block.java
//  run the program
//      java Block//
//This program will use the Scanner class to obtain the length, width, and height of a block
//The program will determine the volume and surface area of the block

//Scanner import statement
import java.util.Scanner;

//  define a class
public class Block{
    	// main method required for every Java program
   			public static void main(String[] args) {
   	           //Declare instance of Scanner object and call Scanner constructor
   		       Scanner myScanner = new Scanner( System.in );
   		       //Prompt user for the length of the block
               System.out.print("Enter the length of the block: ");
               //Accepts user input
               double blockLength = myScanner.nextDouble();
               //Prompt user for the width of the block
               System.out.print("Enter the width of the block: ");
               //Accepts user input
               double blockWidth = myScanner.nextDouble();
               //Prompt user for the height of the block
               System.out.print("Enter the height of the block: ");
               //Accepts user input
               double blockHeight = myScanner.nextDouble();
               //Declaration
               double blockVolume;
               //Calculate volume of block
               blockVolume = (blockLength * blockWidth * blockHeight);
               //Declaration
               double blockSurfaceArea;
               //Calculate surface area of block
               blockSurfaceArea = ((2 * blockLength * blockWidth) + (2 * blockWidth * blockHeight) + (2 * blockLength * blockHeight));
               //Display Volume
               System.out.println("The volume of the block of dimensions " + blockLength + " x " + blockWidth + " x " + blockHeight + " is " + blockVolume);
               //Display Surface Area
               System.out.println("The surface area of the block is " + blockSurfaceArea);
   	}  //end of main method   
}  //end of class
                               
               