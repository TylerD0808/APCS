package Labs1;
// ***************************************************************
//   Salary.java
//   Computes the raise and new salary for an employee
// ***************************************************************
import java.util.Scanner;
import java.text.NumberFormat;

public class Lab2
{
   public static void main (String[] args)
   {
	   double accountBalance, monthBalance, newBalance, interest, minPayment;
	   
	   NumberFormat money = NumberFormat.getCurrencyInstance();
	   
	   Scanner scan = new Scanner(System.in);
	   System.out.print("Please enter the balance of your account: ");
	   accountBalance = scan.nextDouble();
	   System.out.print("Please enter the total amount of additional charges from this month: ");
	   monthBalance = scan.nextDouble();
	   
	   
	   if (accountBalance != 0)
	   {
		   interest = 0.02;
	   }
	   else
	   {
		   interest = 0;
	   }
	   
	   newBalance = (accountBalance + monthBalance) * (1 + interest);
	   
	   if (newBalance < 50)
	   {
		   minPayment = newBalance;
	   }
	   else if (newBalance <= 300)
	   {
		   minPayment = 50;
	   }
	   else
	   {
		   minPayment = newBalance * 0.2;
	   }
	   
	   System.out.println();
	   System.out.println("CS CARD International Statement");
	   System.out.println("===============================");
	   System.out.println();
	   System.out.println("Previous balance: \t" + money.format(accountBalance));
	   System.out.println("Additional charges: \t" + money.format(monthBalance));
	   System.out.println("Interest: \t\t" + money.format(interest * (accountBalance + monthBalance)));
	   System.out.println();
	   System.out.println("New Balance: \t\t" + money.format(newBalance));
	   System.out.println();
	   System.out.println("Minimum payment: \t" + money.format(minPayment));
   }
}