package Labs1;
import java.util.Scanner;

public class ReprintBackwards
{
    public static void main (String[] args)
    {
       String currentText;
 	   Scanner scan = new Scanner (System.in);
 	   System.out.println("Please enter a word: ");
 	   currentText = scan.nextLine();
 	   int length = currentText.length();
 	   while(length >= 0)
 	   {
 		   System.out.print(currentText.charAt(length));
 		   length --;
 	   }
    }
}