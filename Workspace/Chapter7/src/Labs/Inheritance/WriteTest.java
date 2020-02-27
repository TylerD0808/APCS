import java.util.Scanner;
import java.io.*;

public class WriteTest
{
    public static void main(String[]args) throws FileNotFoundException
    {
        Essay essay;
        MultChoice multChoice;
        int numAnswers, numLines;
        
        Scanner scan = new Scanner(new File("C:/Users/tyl.deb000/Desktop/GitHub/APCS/Workspace/Chapter7/src/Labs/Inheritance/testbank.dat"));
        int numQuestions = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < numQuestions; i++)
        {
            if (scan.nextLine() == 'e')
            {
                numLines = scan.nextInt();
                scan.nextLine();
                essay = new Essay(numLines);
            }
            else
            {
                numAnswers = scan.nextInt();
                scan.nextLine();
                multChoice = new MultChoice(numAnswers);
            }
        }
         
    }
}