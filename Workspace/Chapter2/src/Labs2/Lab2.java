package Labs2;
// ***************************************************************
//   StringManips.java
//
//   Test several methods for manipulating String objects
// ***************************************************************

import java.util.Scanner;

public class Lab2
{
    public static void main (String[] args)
    {
    	int number1 = (int)(Math.random() * 6) + 1;
    	int number2 = (int)(Math.random() * 6) + 1;
    	System.out.println("You rolled a " + number1 + " and a " + number2);
    	
    	int sumNum = number1 + number2;
    	System.out.println("The total of your roll equals " + sumNum);
    }
}