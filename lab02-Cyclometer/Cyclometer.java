//Conor Quinlan
//Cyclometer Java Program
//Sep 4 2015
//CSE2 Sec 111
//Program will print the number of minutes and counts for each trip. 
//Program should also print the distance of each trip in 2 miles and the distance for the 2 trips combined.
//MPG measures the miles per gallon
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer {
    
    	// main method required for every Java program
   	public static void main(String[] args) {
   	        // our input data. Document your variables by placing your
		// comments after the “//”. State the purpose of each variable.

	   	int secsTrip1=480;  // Seconds for trip 1
       	int secsTrip2=3220;  // Seconds for trip 2
		int countsTrip1=1561;  // Rotations for trip 1
		int countsTrip2=9037; // Rotations for trip 2
		
		double wheelDiameter=27.0,  // Wheel diameter 
  	    PI=3.14159, // Constant for PI
      	    feetPerMile=5280,  // Feet in 1 mile
      	    inchesPerFoot=12,   // Inches in 1 foot
      	    secondsPerMinute=60;  // Seconds in 1 minute
	    double distanceTrip1, distanceTrip2,totalDistance;  //
	    
	    System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+
       	(secsTrip2/secondsPerMinute)+" minutes and had "+
       	countsTrip2+" counts.");
        
        //run the calculations; store the values. Document your
		//calculation here. What are you calculating?
		//Calculating the distance trip 1 and 2 took
		//
		distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	    distanceTrip1=inchesPerFoot*feetPerMile; // Gives distance in miles
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	    totalDistance=distanceTrip1+distanceTrip2;
	    
	    //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");






	}  //end of main method   
} //end of class
