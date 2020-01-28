import java.util.Scanner;

public class Lab4 
{
	public static void main(String[] args) 
	{
		String first, middle, last;
		Lab4Class person1, person2;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("First Person");
		System.out.print("Please enter their first name: ");
		first = scan.nextLine();
		System.out.print("Please enter their middle name: ");
		middle = scan.nextLine();
		System.out.print("Please enter their last name: ");
		last = scan.nextLine();
		person1 = new Lab4Class (first, middle, last);
		
		System.out.println("First Middle Last: " + person1.firstMiddleLast());
		System.out.println("Last, First Middle: " + person1.lastFirstMiddle());
		System.out.println("Initials: " + person1.initials());
		System.out.println("Name length: " + person1.length());
		
		
		System.out.println();
		System.out.println("Second Person");
		System.out.print("Please enter their first name: ");
		first = scan.nextLine();
		System.out.print("Please enter their middle name: ");
		middle = scan.nextLine();
		System.out.print("Please enter their last name: ");
		last = scan.nextLine();
		person2 = new Lab4Class (first, middle, last);
		
		System.out.println("First Middle Last: " + person2.firstMiddleLast());
		System.out.println("Last, First Middle: " + person2.lastFirstMiddle());
		System.out.println("Initials: " + person2.initials());
		System.out.println("Name length: " + person2.length());
		
		System.out.println();
		
		if (person1.equals(person2) == true)
		{
			System.out.print("These names are the same");
		}
		else
		{
			System.out.print("These names are NOT the same");
		}
	}
}
