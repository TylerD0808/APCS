package Labs1;
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Lab5
{
    public static void main(String[] args)
    {
        final int COVERAGE = 350; //paint covers 350 sq ft/gal
        final int DOOR = 20;
        final int WINDOW = 15;
        
        int length;
        int width;
        int height;
        int doorNum;
        int windowNum;
        
        double totalSqFt;
        double paintNeeded;
        
        Scanner scan = new Scanner (System.in);
        System.out.println ("Please enter a value for the length:");
        length = scan.nextInt();
        
        System.out.println ("Please enter a value for the width:");
        width = scan.nextInt();
        
        System.out.println ("Please enter a value for the height:");
        height = scan.nextInt();
        
        System.out.println ("How many doors are in the room?");
        doorNum = scan.nextInt();
        
        System.out.println ("How many windows are in the room?");
        windowNum = scan.nextInt();
        
        System.out.println();
        double doorSqFt = DOOR * doorNum;
        double windowSqFt = WINDOW * windowNum;
        
        totalSqFt = length * width * height - doorSqFt - windowSqFt;
        paintNeeded = totalSqFt / COVERAGE;

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Square feet: " + totalSqFt);
        
        System.out.println();
        
        System.out.println("In order to paint a room with these dimensions, " + 
        	"you will need " + paintNeeded + " gallons of paint.");
    }
}