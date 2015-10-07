/*Conor Quinlan
2 October 2015
Lab #6
This Lab will use loops
*/

//  define a class
public class GettingLoopy{
    //  add main method
    public static void main(String[] args) {
    int counter=0;
    System.out.println("Step 1:");
    //Loop
    while (counter<7){
        System.out.print(counter++);
        if(counter>=7 && counter<=14){
            counter++;
            System.out.print(7777777);
        }
    }
    System.out.println("");
    System.out.println("Step 2:");
    System.out.print("WHILE LOOP: ");
    //Loop
    /*int myPrime=2;
    int inputValue=10;
        while(inputValue<=100){
            if(inputValue%myPrime==0 && inputValue!=myPrime){
                myPrime++;
                System.out.print(inputValue+ " ");
            }
            inputValue++;
        }*/
    /*int i=10;
    int j=1;
    int factors=0;
    while(i<=100){
        i++;
    }
        while(j<=i){
                if(i % j == 0){
                factors++;
                }
                j++;
        }
        if(factors==2){
            System.out.println(i);
        }
    }*/

    
    System.out.println("");
    System.out.print("FOR LOOP: ");
    //Loop
    int number;
    boolean notPrime;
    int k;
    for (number = 10; number <= 100; number++) {
    notPrime = false;
    for (k = 2; k <= number; k++) {
        if (number%k==0 && k!=number){
            notPrime = true; 
        }
    }
    if (notPrime == false) {
                System.out.print(number + " ");
        }
    }
	System.out.println(" ");
    System.out.print("DO WHILE LOOP: ");
    
    int ats =(int)(Math.random()*196) + 5;
    int p;
        for(p=0; p<=195; p++){
            System.out.print("@ ");
        }

}
}
