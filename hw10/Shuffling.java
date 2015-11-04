/*Conor Quinlan
3 November 2015
HW 10
This HW uses arrays to print a deck of cards, a shuffled deck, and a random hand
*/

//  define a class
public class Shuffling{
        //  add main method
  public static void main(String[] args) {
	//suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i=0; i<52; i++){
            cards[i]=rankNames[i%13]+suitNames[i/13];
            //System.out.print(cards[i]+" ");
            }

        printArray(cards);
        shuffle(cards);
        printArray(cards);
        hand = randomizeHand(cards);
        printArray(hand);

  }  
  public static void printArray(String[] list){
      int i;
      //loop to print the unshuffled deck
      for(i=0;i<list.length;i++){
          System.out.print(list[i]+" ");
      }
  }
  
  public static void shuffle(String[] list){
      //spacing
      System.out.println("");
      System.out.println("Shuffled");
      int j;
      //empty string
      String temp="";
      //Shuffle cards 60 times
      for(j=0;j<60;j++){
          int randomIndex = (int)(Math.random()*51)+1;
          //swap cards
          temp=list[randomIndex];
          list[randomIndex]=list[0];
          list[0]=temp;
      }
  }      
  
  public static String [] randomizeHand(String[] list){
        //spacing
        System.out.println("");
        System.out.println("Randomized hand!");
        //create 5 card variables
        int card1,card2,card3,card4,card5; 
        
        card1 = (int)(Math.random()*52);
        card2 = (int)(Math.random()*52);
            //while loop to make sure none of the cards are the same
            while(card2==card1){
                card2 = (int)(Math.random()*52);
            }
        card3 = (int)(Math.random()*52);
            //while loop to make sure none of the cards are the same
            while(card2==card1 || card3==card2){
                card3 = (int)(Math.random()*52);
            }
        card4 = (int)(Math.random()*52);
            //while loop to make sure none of the cards are the same
            while(card2==card1 || card3==card2 || card4==card3){
                card4 = (int)(Math.random()*52);
            }
        card5 = (int)(Math.random()*52);
            //while loop to make sure none of the cards are the same
            while(card2==card1 || card3==card2 || card4==card3 || card5==card4){
                card5 = (int)(Math.random()*52);
            }
        
        String[] fiveHand = new String[5]; 
        fiveHand[0] = list[card1];
        fiveHand[1] = list[card2];
        fiveHand[2] = list[card3];
        fiveHand[3] = list[card4];
        fiveHand[4] = list[card5];
        return fiveHand; 
  }
}      
