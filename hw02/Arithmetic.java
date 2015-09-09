//Conor Quinlan
//Arithmetic Calculations Java Program
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
public class Arithmetic{

//  add main method
  public static void main(String[] args) {
    
//Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost$=2.58;

//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;

//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;

double totalSockCost$;   //total cost of socks
double totalGlassCost$;  //total cost of drinking glasses
double totalEnvelopeCost$;  //total cost of boxes of envelopes
double totalSockTax$;  //total sales tax on socks
double totalGlassTax$;  //total sales tax on glasses
double totalEnvelopeTax$;  //total sales tax on boxes of envelopes
double totalCost$;  //total cost of purchases before tax
double totalSalesTax$;  //total sales tax
double totalPurchaseCost$;  //total cost of purchases including tax

    //Item being bought
    System.out.println("Item:Socks");
    //How many of the item being bought
    System.out.println("How many Socks:" + nSocks);
    //Cost per item
    System.out.println("Cost per Sock:$" + sockCost$);
    //Compute total cost of socks
    totalSockCost$ = nSocks * sockCost$;
    //Display results
    System.out.println("The total cost of socks without tax is $" + totalSockCost$);
    //Compute total sales tax on socks
    totalSockTax$ = totalSockCost$ * taxPercent;
    //Round the tax
    double roundedSockTax$ = ((int)(totalSockTax$*100))/((double)100.0);
    //Display Results
    System.out.println("The sales tax on socks is $" + roundedSockTax$);
    //Spacing
    System.out.println("");

    //Item being bought
    System.out.println("Item:Glasses");
    //How many of the item being bought
    System.out.println("How many Glases:" + nGlasses);
    //Cost per item
    System.out.println("Cost per Glass:$" + glassCost$);
    //Compute total cost of glasses
    totalGlassCost$ = nGlasses * glassCost$;
    //Display results
    System.out.println("The total cost of glasses without tax is $" + totalGlassCost$);
    //Compute total sales tax on glasses
    totalGlassTax$ = totalGlassCost$ * taxPercent;
    //Round the tax
    double roundedGlassTax$ = ((int)(totalGlassTax$*100))/((double)100.0);
    //Display Results
    System.out.println("The sales tax on glasses is $" + roundedGlassTax$);
    //Spacing
    System.out.println("");
    
    //Item being bought
    System.out.println("Item:Boxes of Envelopes");
    //How many of the item being bought
    System.out.println("How many Boxes of Envelopes:" + nEnvelopes);
    //Cost per item
    System.out.println("Cost per Box of Envelopes:$" + envelopeCost$);
    //Compute total cost of envelopes
    totalEnvelopeCost$ = nEnvelopes * envelopeCost$;
    //Display results
    System.out.println("The total cost of boxes of envelopes without tax is $" + totalEnvelopeCost$);
    //Compute total sales tax on envelopes
    totalEnvelopeTax$ = totalEnvelopeCost$ * taxPercent;
    //Round the tax
    double roundedEnvelopeTax$ = ((int)(totalEnvelopeTax$*100))/((double)100.0);
    //Display Results
    System.out.println("The sales tax on envelopes is $" + roundedEnvelopeTax$);
     //Spacing
    System.out.println("");
    
    //Compute total cost of purchases before tax
    totalCost$ = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;
    //Display Results
    System.out.println("The total purchase cost before tax is $" + totalCost$);
    
    //Compute total sales tax
    totalSalesTax$ = roundedSockTax$ + roundedGlassTax$ + roundedEnvelopeTax$;
    //Display Results
    System.out.println("The total sales tax is $" + totalSalesTax$);
    
    //Compute total cost of purchases including tax
    totalPurchaseCost$ = totalCost$ + totalSalesTax$;
    //Display Results
    System.out.println("The total purchase cost after tax is $" + totalPurchaseCost$);
    
  }
}
    