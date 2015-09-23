//Conor Quinlan
//Poker Hand Check Java Program
//
//  first compile the program
//      javac PokerHandCheck.java
//  run the program
//      java PokerHandCheck//
//Program will randomly draw 5 cards from different decks and check if the cards contain a pair, two pair, three of a kind, or simply a high card hand
//Cannot use loops or methods
//Suits:Diamonds=1-13,Clubs:14-26,Hearts:27-39,Spades:40-52

//  define a class
public class PokerHandCheck{
     //  add main method
    public static void main(String[] args) {
    //Deck 1
        //Generate random number
        //int year1 = (int)(Math.random()*(upperBound+1))+baseNum;
        int year1 = (int)(Math.random()*52)+1;
        //Create two String variables
        String suitName1=" "; //quote space avoids variable initialization error
        String cardIdentity1=" "; //quote space avoids variable initialization error
        //First Print Line
        System.out.println("Your random cards were:");
        //If statement to assign suit name
        if (year1 <= 13){
            suitName1 = "Diamonds";
        }
        if (year1 >= 14 && year1 <= 26){
            suitName1 = "Clubs";
        }
        if (year1 >= 27 && year1 <= 39){
            suitName1 = "Hearts";
        }
        if (year1 >= 40 && year1 <= 52){
            suitName1 = "Spades";
        }
        //Switch statements to assign card identity
        switch( year1 ){
            case 1:case 14:case 27:case 40:
                cardIdentity1 = "Ace";
                break;
            case 11:case 24:case 37:case 50:
                cardIdentity1 = "Jack";
                break;
            case 12:case 25:case 38:case 51:
                cardIdentity1 = "Queen";
                break;
            case 13:case 26:case 39:case 52:
                cardIdentity1 = "King";
                break;
            default: 
                cardIdentity1 = Integer.toString(year1%13);
                break;
        }
        System.out.println("the " + cardIdentity1 + " of " + suitName1);
    //Deck 2
        //Generate random number
        //int year2 = (int)(Math.random()*(upperBound+1))+baseNum;
        int year2 = (int)(Math.random()*52)+1;
        //Create two String variables
        String suitName2=" "; //quote space avoids variable initialization error
        String cardIdentity2=" "; //quote space avoids variable initialization error
        //If statement to assign suit name
        if (year2 <= 13){
            suitName2 = "Diamonds";
        }
        if (year2 >= 14 && year2 <= 26){
            suitName2 = "Clubs";
        }
        if (year2 >= 27 && year2 <= 39){
            suitName2 = "Hearts";
        }
        if (year2 >= 40 && year2 <= 52){
            suitName2 = "Spades";
        }
        //Switch statements to assign card identity
        switch( year2 ){
            case 1:case 14:case 27:case 40:
                cardIdentity2 = "Ace";
                break;
            case 11:case 24:case 37:case 50:
                cardIdentity2 = "Jack";
                break;
            case 12:case 25:case 38:case 51:
                cardIdentity2 = "Queen";
                break;
            case 13:case 26:case 39:case 52:
                cardIdentity2 = "King";
                break;
            default: 
                cardIdentity2 = Integer.toString(year2%13);
                break;
        }
        System.out.println("the " + cardIdentity2 + " of " + suitName2);
    //Deck 3
        //Generate random number
        //int year3 = (int)(Math.random()*(upperBound+1))+baseNum;
        int year3 = (int)(Math.random()*52)+1;
        //Create two String variables
        String suitName3=" "; //quote space avoids variable initialization error
        String cardIdentity3=" "; //quote space avoids variable initialization error
        //If statement to assign suit name
        if (year3 <= 13){
            suitName3 = "Diamonds";
        }
        if (year3 >= 14 && year3 <= 26){
            suitName3 = "Clubs";
        }
        if (year3 >= 27 && year3 <= 39){
            suitName3 = "Hearts";
        }
        if (year3 >= 40 && year3 <= 52){
            suitName3 = "Spades";
        }
        //Switch statements to assign card identity
        switch( year3 ){
            case 1:case 14:case 27:case 40:
                cardIdentity3 = "Ace";
                break;
            case 11:case 24:case 37:case 50:
                cardIdentity3 = "Jack";
                break;
            case 12:case 25:case 38:case 51:
                cardIdentity3 = "Queen";
                break;
            case 13:case 26:case 39:case 52:
                cardIdentity3 = "King";
                break;
            default: 
                cardIdentity3 = Integer.toString(year3%13);
                break;
        }
        System.out.println("the " + cardIdentity3 + " of " + suitName3);
   //Deck 4
        //Generate random number
        //int year4 = (int)(Math.random()*(upperBound+1))+baseNum;
        int year4 = (int)(Math.random()*52)+1;
        //Create two String variables
        String suitName4=" "; //quote space avoids variable initialization error
        String cardIdentity4=" "; //quote space avoids variable initialization error
        //If statement to assign suit name
        if (year4 <= 13){
            suitName4 = "Diamonds";
        }
        if (year4 >= 14 && year4 <= 26){
            suitName4 = "Clubs";
        }
        if (year4 >= 27 && year4 <= 39){
            suitName4 = "Hearts";
        }
        if (year4 >= 40 && year4 <= 52){
            suitName4 = "Spades";
        }
        //Switch statements to assign card identity
        switch( year4 ){
            case 1:case 14:case 27:case 40:
                cardIdentity4 = "Ace";
                break;
            case 11:case 24:case 37:case 50:
                cardIdentity4 = "Jack";
                break;
            case 12:case 25:case 38:case 51:
                cardIdentity4 = "Queen";
                break;
            case 13:case 26:case 39:case 52:
                cardIdentity4 = "King";
                break;
            default: 
                cardIdentity4 = Integer.toString(year4%13);
                break;
        }
        System.out.println("the " + cardIdentity4 + " of " + suitName4);
   //Deck 5
        //Generate random number
        //int year5 = (int)(Math.random()*(upperBound+1))+baseNum;
        int year5 = (int)(Math.random()*52)+1;
        //Create two String variables
        String suitName5=" "; //quote space avoids variable initialization error
        String cardIdentity5=" "; //quote space avoids variable initialization error
        //If statement to assign suit name
        if (year5 <= 13){
            suitName5 = "Diamonds";
        }
        if (year5 >= 14 && year5 <= 26){
            suitName5 = "Clubs";
        }
        if (year5 >= 27 && year5 <= 39){
            suitName5 = "Hearts";
        }
        if (year5 >= 40 && year5 <= 52){
            suitName5 = "Spades";
        }
        //Switch statements to assign card identity
        switch( year5 ){
            case 1:case 14:case 27:case 40:
                cardIdentity5 = "Ace";
                break;
            case 11:case 24:case 37:case 50:
                cardIdentity5 = "Jack";
                break;
            case 12:case 25:case 38:case 51:
                cardIdentity5 = "Queen";
                break;
            case 13:case 26:case 39:case 52:
                cardIdentity5 = "King";
                break;
            default: 
                cardIdentity5 = Integer.toString(year5%13);
                break;
        }
        System.out.println("the " + cardIdentity5 + " of " + suitName5);
        //Spacing
        System.out.println("");
        
    //Comparing Strings for pairs
        if( cardIdentity1.equals(cardIdentity2) ){
            System.out.println("You have a pair!");
        }
    
    //Comparing Strings for pairs
        else if( cardIdentity1.equals(cardIdentity3) ){
            System.out.println("You have a pair!");
        }
    
    //Comparing Strings for pairs
        else if( cardIdentity1.equals(cardIdentity4) ){
            System.out.println("You have a pair!");
        }
    
    //Comparing Strings for pairs
        else if( cardIdentity1.equals(cardIdentity5) ){
            System.out.println("You have a pair!");
        }
    
    //Comparing Strings for pairs
        else if( cardIdentity2.equals(cardIdentity3) ){
            System.out.println("You have a pair!");
        }
    
    //Comparing Strings for pairs
        else if( cardIdentity2.equals(cardIdentity4) ){
            System.out.println("You have a pair!");
        }
    
    //Comparing Strings for pairs
        else if( cardIdentity2.equals(cardIdentity5) ){
            System.out.println("You have a pair!");
        }

    //Comparing Strings for pairs
        else if( cardIdentity3.equals(cardIdentity4) ){
            System.out.println("You have a pair!");
        }
    
    //Comparing Strings for pairs
        else if( cardIdentity3.equals(cardIdentity5) ){
            System.out.println("You have a pair!");
        }

    //Comparing Strings for pairs
        else if( cardIdentity4.equals(cardIdentity5) ){
            System.out.println("You have a pair!");
        }

    //Comparing Strings for two pairs
        if( cardIdentity1.equals(cardIdentity2) && cardIdentity3.equals(cardIdentity4) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity1.equals(cardIdentity2) && cardIdentity3.equals(cardIdentity5) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity1.equals(cardIdentity2) && cardIdentity4.equals(cardIdentity5) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity1.equals(cardIdentity3) && cardIdentity2.equals(cardIdentity4) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity1.equals(cardIdentity3) && cardIdentity2.equals(cardIdentity5) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity1.equals(cardIdentity3) && cardIdentity4.equals(cardIdentity5) ){
            System.out.println("You have a two pair!");
        }
           
    //Comparing Strings for two pairs
        else if( cardIdentity1.equals(cardIdentity4) && cardIdentity2.equals(cardIdentity3) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity1.equals(cardIdentity4) && cardIdentity3.equals(cardIdentity5) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity1.equals(cardIdentity4) && cardIdentity2.equals(cardIdentity5) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity1.equals(cardIdentity5) && cardIdentity2.equals(cardIdentity3) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity1.equals(cardIdentity5) && cardIdentity2.equals(cardIdentity4) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity1.equals(cardIdentity5) && cardIdentity3.equals(cardIdentity4) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity2.equals(cardIdentity3) && cardIdentity1.equals(cardIdentity4) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity2.equals(cardIdentity3) && cardIdentity1.equals(cardIdentity5) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity2.equals(cardIdentity3) && cardIdentity4.equals(cardIdentity5) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity2.equals(cardIdentity4) && cardIdentity3.equals(cardIdentity1) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity2.equals(cardIdentity4) && cardIdentity3.equals(cardIdentity5) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity2.equals(cardIdentity4) && cardIdentity1.equals(cardIdentity5) ){
            System.out.println("You have a two pair!");
        }
    
    //Comparing Strings for two pairs
        else if( cardIdentity2.equals(cardIdentity5) && cardIdentity1.equals(cardIdentity3) ){
            System.out.println("You have a two pair!");
        }
       
    //Comparing Strings for two pairs
        else if( cardIdentity2.equals(cardIdentity5) && cardIdentity3.equals(cardIdentity4) ){
            System.out.println("You have a two pair!");
        }
       
    //Comparing Strings for two pairs
        else if( cardIdentity2.equals(cardIdentity5) && cardIdentity1.equals(cardIdentity4) ){
            System.out.println("You have a two pair!");
        }
      
    //Comparing Strings for two pairs
        else if( cardIdentity3.equals(cardIdentity4) && cardIdentity1.equals(cardIdentity2) ){
            System.out.println("You have a two pair!");
        }
       
    //Comparing Strings for two pairs
        else if( cardIdentity3.equals(cardIdentity4) && cardIdentity2.equals(cardIdentity5) ){
            System.out.println("You have a two pair!");
        }
       
    //Comparing Strings for two pairs
        else if( cardIdentity3.equals(cardIdentity4) && cardIdentity1.equals(cardIdentity5) ){
            System.out.println("You have a two pair!");
        }
       
    //Comparing Strings for two pairs
        else if( cardIdentity3.equals(cardIdentity5) && cardIdentity1.equals(cardIdentity2) ){
            System.out.println("You have a two pair!");
        }
       
    //Comparing Strings for two pairs
        else if( cardIdentity3.equals(cardIdentity5) && cardIdentity2.equals(cardIdentity4) ){
            System.out.println("You have a two pair!");
        }
       
    //Comparing Strings for two pairs
        else if( cardIdentity3.equals(cardIdentity5) && cardIdentity1.equals(cardIdentity4) ){
            System.out.println("You have a two pair!");
        }
       
    //Comparing Strings for two pairs
        else if( cardIdentity4.equals(cardIdentity5) && cardIdentity1.equals(cardIdentity2) ){
            System.out.println("You have a two pair!");
        }
       
    //Comparing Strings for two pairs
        else if( cardIdentity4.equals(cardIdentity5) && cardIdentity2.equals(cardIdentity3) ){
            System.out.println("You have a two pair!");
        }
       
    //Comparing Strings for two pairs
        else if( cardIdentity4.equals(cardIdentity5) && cardIdentity1.equals(cardIdentity3) ){
            System.out.println("You have a two pair!");
        }
    //Comparing Strings for three of a kind
        if( cardIdentity1.equals(cardIdentity2) && cardIdentity1.equals(cardIdentity3) ){
            System.out.println("You have three of a kind!");
        }
        
    //Comparing Strings for three of a kind
        else if( cardIdentity1.equals(cardIdentity2) && cardIdentity1.equals(cardIdentity4) ){
            System.out.println("You have three of a kind!");
        }
        
    //Comparing Strings for three of a kind
        else if( cardIdentity1.equals(cardIdentity2) && cardIdentity1.equals(cardIdentity5) ){
            System.out.println("You have three of a kind!");
        }
        
    //Comparing Strings for three of a kind
        else if( cardIdentity1.equals(cardIdentity3) && cardIdentity1.equals(cardIdentity4) ){
            System.out.println("You have three of a kind!");
        }
        
    //Comparing Strings for three of a kind
        else if( cardIdentity1.equals(cardIdentity3) && cardIdentity1.equals(cardIdentity5) ){
            System.out.println("You have three of a kind!");
        }
        
    //Comparing Strings for three of a kind
        else if( cardIdentity1.equals(cardIdentity4) && cardIdentity1.equals(cardIdentity5) ){
            System.out.println("You have three of a kind!");
        }
        
    //Comparing Strings for three of a kind
        else if( cardIdentity2.equals(cardIdentity3) && cardIdentity2.equals(cardIdentity4) ){
            System.out.println("You have three of a kind!");
        }
        
    //Comparing Strings for three of a kind
        else if( cardIdentity2.equals(cardIdentity3) && cardIdentity2.equals(cardIdentity5) ){
            System.out.println("You have three of a kind!");
        }
        
    //Comparing Strings for three of a kind
        else if( cardIdentity2.equals(cardIdentity4) && cardIdentity2.equals(cardIdentity5) ){
            System.out.println("You have three of a kind!");
        }
        
    //Comparing Strings for three of a kind
        else if( cardIdentity3.equals(cardIdentity4) && cardIdentity3.equals(cardIdentity5) ){
            System.out.println("You have three of a kind!");
        }
    
    //Could not get the high card hand to print correctly. Attempted to compare strings for when they did not equal eachother. See below
    
    /*    
    //Comparing Strings for a high card hand
        if( !cardIdentity1.equals(cardIdentity2) && !cardIdentity1.equals(cardIdentity3) && !cardIdentity1.equals(cardIdentity4) && !cardIdentity1.equals(cardIdentity5) ){
            System.out.println("You have a high card hand!");
        }
    
    //Comparing Strings for a high card hand
        else if( !cardIdentity2.equals(cardIdentity3) && !cardIdentity2.equals(cardIdentity4) && !cardIdentity2.equals(cardIdentity5) ){
            System.out.println("You have a high card hand!");
        }   
        
    //Comparing Strings for a high card hand
        else if( !cardIdentity3.equals(cardIdentity4) && !cardIdentity3.equals(cardIdentity5) ){
            System.out.println("You have a high card hand!");
        } 
        
    //Comparing Strings for a high card hand
        else if( !cardIdentity4.equals(cardIdentity5) ){
            System.out.println("You have a high card hand!");
        }
        */
       
  }//end of main method
}//end of class