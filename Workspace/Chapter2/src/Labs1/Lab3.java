public class Lab3
{
    // -------------------------------------------------
    // main prints some expressions using the + operator
    // -------------------------------------------------
    public static void main (String[] args)
    {
	System.out.println ("This is a long string that is the " +
			        "concatenation of two shorter strings.");

	/* This quote was fixed by adding spaces inside the strings before
	 * and after the 55.
	 */
	System.out.println ("The first computer was invented about " + 55 +
			        " years ago.");


	/* This one prints "8 plus 5 is 85"
	 * It does this because it concatenates the string with 8 and 5
	 * which is then displayed as "85".
	 */ 
	System.out.println ("8 plus 5 is " + 8 + 5);

	/* This one prints "8 plus 5 is 13"
	 * It does this because the 8 + 5 is in parentheses
	 * which makes it happen first. This  results in "13".
	 */
	System.out.println ("8 plus 5 is " + (8 + 5));
	
	/* This one prints "13 equals 8 plus 5"
	 * This happens because the plus between 8 and 5 happens
	 * first in the order of operations, then gets concatenated
	 * with the string.
	 */
	
	System.out.println (8 + 5 + " equals 8 plus 5.");
	
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("Ten robins plus "+ 13 +" canaries is "+ 23 +" birds.");
    }
}