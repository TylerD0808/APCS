package Labs1;
// ****************************************************************
//   LoveCS.java
//
//   Use a while loop to print many messages declaring your 
//   passion for computer science
// ****************************************************************
import java.util.Scanner;

public class Lab6
{
    public static void main(String[] args)
    {
	int num, sum = 0;
	Scanner scan = new Scanner (System.in);
	System.out.print("How many times would you like to print the message?");
	num = scan.nextInt();

	int count = 1;

	System.out.println();
	
	while (count <= num){
	    System.out.println(count + " I love Computer Science!!");
	    sum += count;
	    count++;
	}
	System.out.println();
	System.out.print("Printed this message " + num + " times. The sum of the numbers from 1 to " + num + " is " + sum + ".");
    }
}