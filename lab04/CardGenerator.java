//Conor Quinlan
//Card Generator Java Program
//
//  first compile the program
//      javac CardGenerator.java
//  run the program
//      java CardGenerator//
//Randomly generate a number between 1 and 52. These numbers represent a deck of cards grouped by suit.
//Suits:Diamonds=1-13,Clubs:14-26,Hearts:27-39,Spades:40-52

//  define a class
public class CardGenerator{
    //  add main method
    public static void main(String[] args) {
        //Generate random number
        //int year = (int)(Math.random()*(upperBound+1))+baseNum;
        int year = (int)(Math.random()*52)+2;
        //Create two String variables
        String suitName=" "; //quote space avoids variable initialization error
        String cardIdentity=" "; //quote space avoids variable initialization error
        //If statement to assign suit name
        if (year <= 13){
            suitName = "Diamonds";
        }
        if (year >= 14 && year <= 26){
            suitName = "Clubs";
        }
        if (year >= 27 && year <= 39){
            suitName = "Hearts";
        }
        if (year >= 40 && year <= 52){
            suitName = "Spades";
        }
        //Switch statements to assign card identity
        switch( year ){
            case 1:case 14:case 27:case 40:
                cardIdentity = "Ace";
                break;
            case 11:case 24:case 37:case 50:
                cardIdentity = "Jack";
                break;
            case 12:case 25:case 38:case 51:
                cardIdentity = "Queen";
                break;
            case 13:case 26:case 39:case 52:
                cardIdentity = "King";
                break;
            default: 
                cardIdentity = Integer.toString(year%13);
                break;
        }
        System.out.println("You picked the " + cardIdentity + " of " + suitName);
  }//end of main method
}//end of class