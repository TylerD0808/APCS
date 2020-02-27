java.util.Scanner;

public class MultChoice extends TestQuestion
{
    String[] s;
    Scanner scan = new Scanner(new File("C:/Users/tyl.deb000/Desktop/GitHub/APCS/Workspace/Chapter7/src/Labs/Inheritance/testbank.dat"));

    public MultChoice(int num)
    {
        s = new String[num];
    }

    public void readQuestion()
    {
        testQuestion = scan.nextLine();
    }
    
}