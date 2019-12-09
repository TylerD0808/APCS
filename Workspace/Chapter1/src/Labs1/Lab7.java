package Labs1;

//********
//	Problem2.java
//
//	Provide lots of runtime and logical errors for the user to correct.
//********

public class Lab7
{
	public static void main(String[] args)
	{
		System.out.println (args.length);
		System.out.println ("This fraction 1/0 is " + (1.0/0) + " as a decimal");
		System.out.println ("This fraction 1/2 is " + (double)1/2 + " as a decimal");
		System.out.println ("Hello, World".charAt(1));
		System.out.println ("Hello, World".substring(7,12));
		System.out.println (3 + 4 + " = 3 + 4 but 3 + 4 = "+ 3 + 4);
	}
}
