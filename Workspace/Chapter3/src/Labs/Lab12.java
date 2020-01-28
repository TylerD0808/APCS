import java.util.Scanner;

public class Lab12
{
    public static void main (String[] args)
    {
	final int HOURS_PER_DAY = 24;

	int temp, maxTemp = -1000, timeOfMax = 0, minTemp = 1000, timeOfMin = 0;
	Scanner scan = new Scanner(System.in);

	System.out.println ();
	System.out.println ("Temperature Readings for 24 Hour Period");
	System.out.println ();

	for (int hour = 0; hour < HOURS_PER_DAY; hour++)
	{
	    System.out.print ("Enter the temperature reading at hour " + hour + ": ");
	    temp = scan.nextInt();
	    
	    if (maxTemp < temp)
	    {
	    	maxTemp = temp;
	    	timeOfMax = hour;
	    }
	    
	    if (minTemp > temp)
	    {
	    	minTemp = temp;
	    	timeOfMin = hour;
	    }
	}
	
	System.out.println();
	System.out.println("The maximum temperature was " + maxTemp + " degrees. "
			+ "This took place at hour " + timeOfMax + " of the day.");
	System.out.print("The minimium temperature was " + minTemp + " degrees. "
			+ "This took place at hour " + timeOfMin + " of the day.");
    }
}