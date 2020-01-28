package Labs1;
// ********************************************************************
// Runs.java
//
// Finds the length of the longest run of heads in 100 flips of a coin.
// ********************************************************************

public class Lab14
{
    public static void main (String[] args)
    {
	final int FLIPS = 100; // number of coin flips

	int currentRun = 0; // length of the current run of HEADS
	int maxRun = 0;     // length of the maximum run so far

	Coin coin = new Coin();

	for (int i = 0; i < FLIPS; i++)
	    {
		coin.flip();

		boolean prevFlip = coin.isHeads();
		
		if (coin.isHeads() && prevFlip == true)
		{
			currentRun++;
			if (currentRun > maxRun)
			{
				maxRun = currentRun;
			}
		}
		else
		{
			currentRun = 0;
		}
	    }
	
	System.out.println("The most amount of heads in a row was: " + maxRun);

	// Print the results

    }
}