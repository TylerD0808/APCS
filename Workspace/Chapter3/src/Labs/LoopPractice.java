import java.util.Scanner;
import java.text.NumberFormat;

public class LoopPractice
{
   public static void main (String[] args)
   {
	 Scanner scan = new Scanner (System.in);
	 System.out.print("Please enter an operand: ");
	 int num = scan.nextInt();
	 
	 System.out.print("Please enter a multiple of " + num + " : ");
	 int num2 = scan.nextInt();
	 
	 while (num2 % num != 0)
	 {
		System.out.print("Please enter a different multiple of " + num + " : ");
		num2 = scan.nextInt();
	 }

	 for (int i = num2 / num; i >= 1; i--)
	 {
		 System.out.println(num + " * " + i + " = " + (num * i));
	 }
   }
}