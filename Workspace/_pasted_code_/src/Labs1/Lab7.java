package Labs1;
// ****************************************************************
//   PowersOf2.java
//
//   Print out as many powers of 2 as the user requests
//          
// ****************************************************************
import java.util.Scanner;

public class Lab7
{
    public static void main(String[] args)
    {
        int numPowersOf2;        //How many powers of 2 to compute
        int nextPowerOf2 = 1;    //Current power of  2
        int exponent;            //Exponent for current power of 2 -- this
                        	   //also serves as a counter for the loop
        Scanner scan = new Scanner(System.in);
        System.out.print("How many powers of 2 would you like printed?");
        numPowersOf2 = scan.nextInt();

        exponent = 0;

        System.out.println();
        System.out.println("Here are the first " + numPowersOf2 + " powers of 2:");
        
	  while (exponent <= (numPowersOf2 - 1))
        {
		  System.out.println("2^" + exponent + " = " + nextPowerOf2);
		  nextPowerOf2 = nextPowerOf2 * 2;
		  exponent ++;
	    }
    }
}
