import java.util.Scanner;
import java.util.Random;

public class Lab10
{
    public static void main(String[] args)
    {
      int numToGuess;       //Number the user tries to guess
      int guess;            //The user's guess
      int numOfGuess = 1;
      int numHigh = 0;
      int numLow = 0;

	Scanner scan = new Scanner(System.in);
	Random generator = new Random();

	numToGuess = generator.nextInt(10) + 1;
	System.out.print("Enter an integer: ");
	guess = scan.nextInt();
	System.out.println("You guessed a " + guess);
	
	do
	{
		if (guess > numToGuess)
		{
			System.out.print("Your guess was too high. ");
			numHigh++;
		}
		else
		{
			System.out.print("Your guess was too low. ");
			numLow++;
		}
		System.out.print("Please enter another number: ");
		guess = scan.nextInt();
		numOfGuess++;
	}
	while (guess != numToGuess);
	{
		System.out.println();
		
		if(numOfGuess == 1)
		{
			System.out.println("Congratulations!!! You guessed correctly in " + numOfGuess + " try!");
		}
		else
		{
			System.out.println("Congratulations!!! You guessed correctly in " + numOfGuess + " tries!");
			System.out.print("Number of high guesses: " + numHigh + "\nNumber of low guesses: " + numLow);
		}
	    }
	}
}
