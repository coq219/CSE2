/*Conor Quinlan
17 November 2015
HW 12
This HW uses mulitdimensional arrays
*/

//Scanner import statement
import java.util.Scanner;
//define a class
public class Transpose { 
    //add main method
    public static void main(String[] args) { 
        //2 input variables
        int height,width;
        //Declare instance of Scanner object and call Scanner constructor
        Scanner myScanner = new Scanner(System.in);
        //Prompt user for input
        System.out.print("Input matrix width: ");
        //Accept input
        width = myScanner.nextInt(); 
        //Prompt user for input
        System.out.print("Input matrix height: ");
        //Accept input
        height = myScanner.nextInt(); 
        //spacing
        System.out.println();
        
        int[][] randomArray = randomMatrix(height,width); 
        System.out.println("Printed Matrix:");
        printMatrix(randomArray,1); 
        System.out.println("Transposed Matrix:"); 
        int[][] lastMatrix = transposeMatrix(randomArray,height,width); 
        printMatrix(lastMatrix,2); 
    }
    //inital array method
    public static int[][] randomMatrix(int height,int width) { 
        int randomNum;
        int[][] randomArray = new int[height][width]; 
        for(int row=0;row<randomArray.length;row++) { 
            for(int column=0; column<randomArray[row].length;column++) {
                //random number between -10 and 10
                randomNum = (int) (((Math.random()*20))-10);
                randomArray[row][column]=randomNum;
            }
        }
        return randomArray; //return the array
    }
    //print method
    public static void printMatrix(int[][] randomArray,int i) { 
        //width variable
        int width = randomArray[0].length; 
        //height variable
        int height = randomArray.length;
        //variable to check if rectangular
        int checker;
        //when i equals 1
        if(i==1) { 
            for(int x=0;x<randomArray.length;x++) { 
                for(int y=0;y<randomArray[x].length;y++) {
                    checker = randomArray[x].length;
                    if(checker!=width) {
                        //alert if not rectangular
                        System.out.println("Matrix is not rectangular");
                    }
                    if(randomArray[x][y]>-1) {
                        System.out.print(" "+randomArray[x][y]+" ");
                    }
                    else {
                        System.out.print(randomArray[x][y]+" ");
                    }
                }
                //spacing
                System.out.println();
            }
        }
        //when i equals 2
        if(i==2) { 
            for(int a=0;a<width;a++) { 
                for(int b=0;b<randomArray.length;b++) {
                    checker = randomArray.length; 
                    if(height!=checker) {
                        //alert if not rectangular
                        System.out.println("Matrix is not rectangular");
                    }
                    if(randomArray[b][a]>-1) {
                        System.out.print(" "+randomArray[b][a]+" ");
                    }
                    else {
                        System.out.print(randomArray[b][a]+" ");
                    }
                }
                //spacing
                System.out.println();
            }
        }
        //spacing
        System.out.println();
    }
    //Transpose method
    public static int[][] transposeMatrix(int[][] randomArray, int height, int width) { 
        int[][] otherMatrix = new int[width][height]; 
        for(int a = 0; a < width; a++) {
            for(int b = 0; b < height; b++) {
                otherMatrix[a][b] = randomArray[b][a];
            }
        }   
        return otherMatrix; 
    }
} 