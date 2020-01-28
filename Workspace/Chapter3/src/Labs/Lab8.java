import java.util.Scanner;

public class Lab8
{
    public static void main(String[] args)
    {
    	int num, count, ans = 1;
    	
    	Scanner scan = new Scanner (System.in);
    	System.out.print("Please enter a positive integer: ");
    	num = scan.nextInt();
    	
    	while (num < 0)
    	{
    		System.out.print("Please try another positive integer: ");
    		num = scan.nextInt();
    	}
    	
    	final int NUM = num;
    	
    	if (num > 0)
    	{
    		while (num > 0)
    		{
    			ans = ans * num;
    			num--;
    		}
    	}
    	else
    	{
    		ans = 1;
    	}
    	
    	System.out.println(NUM + "! = " + ans);
    }
}
