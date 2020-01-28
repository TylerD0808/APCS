import java.util.Scanner;

public class TestNameThing
{
   public static void main (String[] args)
   {
	   String name, first, last;
	   Scanner scan = new Scanner (System.in);
	   System.out.println("Please enter your name (Last, First): ");
	   name = scan.nextLine();
	   int num = 0;
	   while (name.charAt(num) != ',')
	   {
		   num = num + 1;
	   }
	   last = name.substring(0, num - 1);
	   first = name.substring(num + 1);
	   System.out.println(first + " " + last);
  }
}