import java.util.Scanner; 
 
public class Comparisons
{
     public static void main (String[]args)
     {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please write a string: ");
        Comparable string1 = scan.nextLine();

        System.out.print("Please write another string: ");
        Comparable string2 = scan.nextLine();
    
        System.out.print("Please write another string: ");
        Comparable string3 = scan.nextLine();

        System.out.println();
        
        System.out.print("Largest string: " + Compare3.largest(string1, string2, string3));

        System.out.println();
        System.out.println();
        
        System.out.print("Please write an integer: ");
        Comparable int1 = scan.nextInt();

        System.out.print("Please write another integer: ");
        Comparable int2 = scan.nextInt();
    
        System.out.print("Please write another integer: ");
        Comparable int3 = scan.nextInt();

        System.out.println("Largest integer: " + Compare3.largest(int1, int2, int3));
    }
}