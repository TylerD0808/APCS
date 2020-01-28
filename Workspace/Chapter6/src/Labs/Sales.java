import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many salespeople? ");
		int numSalespeople = scan.nextInt();

		int[] sales = new int[numSalespeople];
		int sum, average;
		
		for (int i = 0; i < sales.length; i++)
		{
			System.out.print("Enter sales for salesperson " + (1 + i) + ": ");
			sales[i] = scan.nextInt();
		}

		System.out.println("\nSalesperson   Sales");
		System.out.println("--------------------");

		sum = 0;

		int highestSale = sales[0], salesPerson = 0, lowestSale = sales[0], salesPerson2 = 0;
		for (int i = 0; i < sales.length; i++)
		{
			System.out.println("     " + (1 + i) + "         " + sales[i]);
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
			
		average = sum / numSalespeople;

		System.out.println("\nTotal sales: " + sum);
		System.out.println("Average sale: " + average);
		System.out.println("Salesperson " + (1 + salesPerson) + " had the highest sale with $" + highestSale);
		System.out.println("Salesperson " + (1 + salesPerson2) + " had the lowest sale with $" + lowestSale);
		System.out.println();
		System.out.print("Please enter a value: ");
		int val = scan.nextInt();
		int g = 0;
		System.out.println("Saleseople who exceeded $" + val + " in sales:");
		System.out.println("\nSalesperson   Sales");
		System.out.println("--------------------");

		for (int k = 0; k < sales.length; k++)
		{
			if (sales[k] > val)
			{
				System.out.println("     " + (1 + k) + "         " + sales[k]);
				g++;
			}
		}

		System.out.println(g + " salespeople exceeded $" + val + " in sales");
	
		


    }
}