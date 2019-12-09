package Labs1;

import java.util.Scanner;

public class Lab3
{
	
	public static void main(String[] args)
	{
		String name;
		int boxes;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the first student's name: ");
		name = scan.nextLine();
		Lab3Class student1 = new Lab3Class(name);
		
		System.out.print("Please enter the second student's name: ");
		name = scan.nextLine();
		Lab3Class student2 = new Lab3Class(name);
		
		System.out.println();

		for(int i = 0; i < 3; i++)
		{
			System.out.print("Enter the number of boxes sold by " + student1.getName() + " this week: ");
			boxes = scan.nextInt();
			student1.updateSales(boxes);
			
			System.out.print("Enter the number of boxes sold by " + student2.getName() + " this week: ");
			boxes = scan.nextInt();
			student2.updateSales(boxes);
			
			System.out.println();
		}
		
		System.out.println(student1.toString());
		System.out.print(student2.toString());
	}

}
