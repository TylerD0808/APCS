import java.util.Scanner;

public class Lab4
{
    public static void main(String[] args)
    {
     
     Scanner scan = new Scanner (System.in);
     
     final double PI = 3.14159;
     
     System.out.println("Please enter a value for the radius.");
     
     int radius1 = scan.nextInt();
     
     double area1 = PI * radius1 * radius1;
     int diameter1 = 2 * radius1;
     double circumference1 = diameter1 * PI;
     System.out.println("The area of a circle with radius " + radius1 +
                        " is " + area1);
     

     System.out.println("The circumference of a circle with radius " + radius1 +
    		 " is " + circumference1);
     
     System.out.println();
     
     int radius2 = 2 * radius1;
     double area2 = PI * radius2 * radius2;
     int diameter2 = 2 * radius2;
     double circumference2 = diameter2 * PI;
     System.out.println("The area of a circle with radius " + radius2 +
                        " is " + area2);
     System.out.println("The circumference of a circle with radius " + radius2 +
    		 " is " + circumference2);
     
     System.out.println();
     
     double areaChange = area2 / area1;
     System.out.println("The areas of the circles change by a factor of " + areaChange);
     
     double circumferenceChange = circumference2 / circumference1;
     System.out.println("The circumferences of the circles change by a factor of " + circumferenceChange);
     
     // Yes it holds true
    }
}