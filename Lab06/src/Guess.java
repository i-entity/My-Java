// ************************************************************  
//   Guess.java 
//
//   Play a game where the user guesses a number from 1 to 10
//
// ************************************************************
import java.util.Scanner;
import java.util.Random; 

public class Guess{ 

    private static final int MAX = 10; //Number in the guessing range
    
        public static void main(String[] args){
        
            int numToGuess;          //Number the user tries to guess
            int guess;              //The user's guess 
            int count = 1;          //This is the first guess from user
            int low = 0;
            int high = 0;
            
            Scanner scan = new Scanner(System.in); 
            
            Random generator = new Random();    //randomly generate the  number to guess
            
            numToGuess = generator.nextInt(MAX) + 1;    //system always counts from "0", thus + "1".
                                                        //range is 0 - 10
            
            //print message asking user to enter a guess
            System.out.print("I'm thinking of a number between 1 and " + MAX
                    + ". Guess what it is: ");
            guess = scan.nextInt();             //read in guess 
            
            while (guess != numToGuess)  //keeps going as long as the guess is wrong 
              {
                if (guess < numToGuess) //if the number is too low
                {                           
                    low = low + 1;
                    System.out.println("Wrong. Your guess is too low.");
                }
                
                if (guess > numToGuess)   //if not, then...
                {
                    high = high + 1;
                    System.out.println("Wrong. Your guess is too high.");
                }
            System.out.println("Try again: ");  //Asks the user to try guessing again
            guess = scan.nextInt();
            
            count++;
              } 
            
            System.out.println("Congrats! After " + count + " tries, you've got it right!");  //print message saying guess is right
            System.out.println("You've taken " + count + " guess(es);" 
                                + low + " guesses are too low and " + high + 
                                " guess(es) are too high.");
    }
} 