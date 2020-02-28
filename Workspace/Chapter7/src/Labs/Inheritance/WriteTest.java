import java.util.Scanner;
import java.io.*;

public class WriteTest {
    public static void main(String[] args) throws FileNotFoundException {
        TestQuestion[] test;
        int numAnswers, numLines;

        Scanner scan = new Scanner(
                new File("/Users/TylerDeBrock/GitHub/APCS/Workspace/Chapter7/src/Labs/Inheritance/testbank.dat"));
        int numQuestions = scan.nextInt();
        scan.nextLine();
        test = new TestQuestion[numQuestions];

        for (int i = 0; i < numQuestions; i++) {
            if (scan.next().charAt(0) == 'e') {
                numLines = scan.nextInt();
                scan.nextLine();
                test[i] = new Essay(numLines, scan);
            } else {
                numAnswers = scan.nextInt();
                scan.nextLine();
                test[i] = new MultChoice(numAnswers, scan);
            }
        }

        for (int a = 0; a < numQuestions; a++) {
            System.out.print(1 + a + ". " + test[a].toString());
        }
    }
}