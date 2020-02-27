java.util.Scanner;

public class Essay extends TestQuestion
{
    protected int numLines;
    Scanner scan = new Scanner(new File("C:/Users/tyl.deb000/Desktop/GitHub/APCS/Workspace/Chapter7/src/Labs/Inheritance/testbank.dat"));

    public Essay(int numLines)
    {
        this.numLines = numLines;
    }

    public void readQuestion()
    {
        testQuestion = scan.nextLine();
    }
}