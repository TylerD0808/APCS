import java.util.Scanner;

public class Lab3
{
    public static void main (String[] args)
    {
	double x1, y1, x2, y2; // coordinates of two points
	double distance;       // distance between the points

	Scanner scan = new Scanner(System.in);

	// Read in the two points 
	System.out.print ("Enter the coordinates of the first point " +
               "(put a space between them): ");
	x1 = scan.nextDouble();
	y1 = scan.nextDouble();

	System.out.print ("Enter the coordinates of the second point: ");
	x2 = scan.nextDouble();
	y2 = scan.nextDouble();

	double yDistance = (y2 - y1) * (y2 - y1);
	double xDistance = (x2 - x1) * (x2 - x1);
	double totalDistance = Math.sqrt(yDistance + xDistance);
	
	System.out.println("The distance between the points (" + x1 + " , " + y1 + 
			") and (" + x2 + " , " + y2 + ") is " + totalDistance);
    }
}