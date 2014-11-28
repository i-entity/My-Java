// ************************************************************
//   PowersOf2.java
//
//   Print out as many powers of 2 as the user requests
//
// ************************************************************
import java.util.Scanner; 
public class PowerOf2{
    
    public static void main(String[] args){
        
        int numPowersOf2;               //How many powers of 2 to compute
       
        int nextPowerOf2 = 1;           //Current power of  2
        
        int exponent = 0;               //Exponent for current power of 2 -- this 
                                        //also serves as a counter for the loop Scanner
                                        //starts at 0
        
        Scanner scan = new Scanner(System.in); 
        
        //print a message saying how many powers of 2 will be printed
        System.out.println("How many powers of 2 would you like printed?");
        numPowersOf2 = scan.nextInt();
        
        //prints out the N powers of 2 that user entered
        System.out.println("The first " + numPowersOf2 + " power of 2 is:");

        while ( numPowersOf2 != exponent)
        {
            
            System.out.println("2^ " + exponent + " = " + nextPowerOf2);
            
            nextPowerOf2 = nextPowerOf2 * 2;          //formula for 2^exponent-1
            
            exponent++;                 //keeps adding 1 to the value, making the loop  
        }
   }
}
