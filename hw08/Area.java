/*Conor Quinlan
20 October 2015
HW 8
This hw uses multiple methods to calculate the area of a rectangle, triangle, and a circle
*/

//Scanner import statement
import java.util.Scanner;
//  define a class
public class Area{
    //  add main method
    public static void main(String[] args) {
        //Declare instance of Scanner object and call Scanner constructor
   			    Scanner myScanner = new Scanner( System.in );
   			    //Prompt user for shape
                System.out.print("Choose rectangle, triangle, or circle: ");
                //Accepts user input
                String shape = myScanner.next();
                //While loop to validate if user input is either "rectangle", "triangle", or "circle"
                while(!shape.equals("rectangle") && !shape.equals("triangle")  && !shape.equals("circle")){
                    System.out.println("Not an acceptable shape. Acceptable shapes are rectangle, triangle, or circle");
                    System.out.print("Choose rectangle, triangle, or circle: ");
                    shape=myScanner.next();
                }
                //User input is rectangle
                if (shape.equals("rectangle")){
                    System.out.println("Enter length: ");
                    double length = userInput();
                    System.out.println("Enter width: ");
                    double width = userInput();
                    double myRectangle = areaRectangle(length, width);
                    System.out.println(myRectangle);
                }
                //User input is triangle
                if (shape.equals("triangle")){
                    System.out.println("Enter base: ");
                    double base = userInput();
                    System.out.println("Enter height: ");
                    double height = userInput();
                    double myTriangle = areaTriangle(base, height);
                    System.out.println(myTriangle);
                }
                //User input is circle
                if (shape.equals("circle")){
                    System.out.println("Enter radius: ");
                    double radius = userInput();
                    double myCircle = areaCircle(radius);
                    System.out.println(myCircle);
                }
                
    }
    //Method to find area of rectangle
    public static double areaRectangle( double a, double b){
        double areaR = (a*b);
        return areaR;
    }
    //Method to find area of triangle
    public static double areaTriangle( double a, double b){
        double j=.5;
        double areaT = ((a*b)*j);
        return areaT;
    }
    //Method to find area of circle
    public static double areaCircle( double a){
        double pi = 3.14;
        double areaC = (pi*(a*a));
        return areaC;
    }
    //Method to check user input
    public static double userInput(){
        Scanner input = new Scanner(System.in);
        //if user does not input a double, get an error
        while(input.hasNextDouble()==false){
            System.out.println("Invalid, enter a double:");
            input.next();
        }
        //prompt user again
        double name = input.nextDouble();
        return name;
    }
}
    
                