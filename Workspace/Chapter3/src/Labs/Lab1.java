import java.util.Scanner;
import java.text.NumberFormat;

public class Lab1
{
   public static void main (String[] args)
   {
      double currentSalary;  // current annual salary
      String rating;         // performance rating
      double raise = 0;          // dollar amount of the raise
      
	   Scanner scan = new Scanner(System.in);

      // Get the current salary and performance rating
      System.out.print ("Enter the current salary: ");
      currentSalary = scan.nextDouble();
      NumberFormat money = NumberFormat.getCurrencyInstance();
      
      System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
      rating = scan.next();

      if (rating.equalsIgnoreCase("excellent") || rating.equalsIgnoreCase("good") || rating.equalsIgnoreCase("poor"))
      {
    	  System.out.println();
    	  
      	  if (rating.equalsIgnoreCase("excellent"))
      	  {
      	  	   raise = currentSalary * 0.06;
      	  }
      	  else if (rating.equalsIgnoreCase("good"))
      	  {
      	  	   raise = currentSalary * 0.04;
      	  }
      	  else
      	  {
      		   raise = currentSalary * 0.015;
      	  }
      }  
      else 
      {
    	  System.out.println("Your performance rating is invalid. Please start over");
    	  System.exit(0);
      }
    	    
      // Print the results
      //System.out.println ("Amount of your raise: $" + raise);
      // System.out.println ("Your new salary: $" + currentSalary + raise);
      System.out.println();
      System.out.println("Your current salary is " + money.format(currentSalary));
      System.out.println("Your raise is " + money.format(raise));
      System.out.println("Your new salary is " + money.format(currentSalary + raise));
   }
}