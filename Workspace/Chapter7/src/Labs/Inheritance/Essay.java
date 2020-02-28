import java.util.Scanner;

public class Essay extends TestQuestion {
    protected int numLines;
    private Scanner scan;

    public Essay(int numLines, Scanner scan) {
        this.numLines = numLines;
        this.scan = scan;
        readQuestion();
    }

    public void readQuestion() {
        testQuestion = scan.nextLine();
    }

    public String toString() {
        String lines = "";

        for (int i = -1; i < numLines; i++) {
            lines += "\n";
        }

        return testQuestion + lines;
    }
}