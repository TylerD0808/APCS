import java.util.Scanner;
import java.text.NumberFormat;

public class Lab3
{
   public static void main (String[] args)
   {
	   int temp;
	   Scanner scan = new Scanner (System.in);
	   System.out.print("Please enter a temperature (Fahrenheit): ");
	   temp = scan.nextInt();
	   
	   if(temp < 20 || temp > 95)
	   {
		   System.out.print("Visit our shops!");
	   }
	   else
	   {
		   System.out.print("Activity: ");
		   if (temp < 40)
		   {
			   System.out.print("Skiing");
		   }
		   else if (40 <= temp && temp < 60)
		   {
			   System.out.print("Golf");
		   }
		   else if (60 <= temp && temp < 80)
		   {
			   System.out.print("Tennis");
		   }
		   else 
		   {
			   System.out.print("Swimming");
		   }
	   }
   }
}