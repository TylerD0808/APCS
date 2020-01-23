// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
	final int SALESPEOPLE = 5;
	int[] sales = new int[SALESPEOPLE];
	int sum, average;

	Scanner scan = new Scanner(System.in);

	for (int i=0; i<sales.length; i++)
	    {
		System.out.print("Enter sales for salesperson " + i + ": ");
		sales[i] = scan.nextInt();
	    }

	System.out.println("\nSalesperson   Sales");
	System.out.println("--------------------");
	sum = 0;
	int highestSale = sales[0], salesPerson = 0, lowestSale = sales[0], salesPerson2 = 0;
	for (int i=0; i<sales.length; i++)
	    {
		System.out.println("     " + i + "         " + sales[i]);
		sum += sales[i];

			if (sales[i] > highestSale)
			{
				highestSale = sales[i];
				salesPerson = i;
			}

			if (sales[i] < lowestSale)
			{
				lowestSale = sales[i];
				salesPerson2 = i;
			}
		}
		
		average = sum/SALESPEOPLE;

	System.out.println("\nTotal sales: " + sum);
	System.out.println("Average sale: " + average);
	System.out.println("Salesperson " + salesPerson + " had the highest sale with $" + highestSale);
    }
}