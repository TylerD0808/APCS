import java.util.Scanner;

public class Lab5
{
    public static void main (String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	int integer;
    	
    	System.out.print("Please enter an integer: ");
    	integer = scan.nextInt();
    	
    	System.out.println();
    	System.out.println(integer);
    	
    	System.out.println();
    	System.out.println("Binary: " + Integer.toBinaryString(integer));
    	System.out.println("Octal: " + Integer.toOctalString(integer));
    	System.out.println("Hexadecimal: " + Integer.toHexString(integer));
    	
    	System.out.println();
    	System.out.println(Integer.MAX_VALUE);
    	System.out.println(Integer.MIN_VALUE);
    	
    	String dec1, dec2;
    	System.out.println();
    	System.out.println("Enter a decimal: ");
    	dec1 = scan.next();
    	
    	System.out.println("Enter another decimal: ");
    	dec2 = scan.next();
    	
    	System.out.println();
    	System.out.println(dec1);
    	System.out.println(dec2);
    	
    	int dec11 = Integer.parseInt(dec1);
    	
    	int dec21 = Integer.parseInt(dec2);
    	
    	int sum = dec11 + dec21;
    	
    	System.out.println();
    	System.out.println("Integer sum: " + sum);
    	
    }
}