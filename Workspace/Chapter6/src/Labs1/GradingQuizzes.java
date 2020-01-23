import java.util.Scanner;
import java.util.Arrays;

public class GradingQuizzes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int QUIZLENGTH = 10;

        System.out.print("Please enter the answer key: ");
        String a = scan.nextLine();

        int[] answers = new int[QUIZLENGTH];
        int startIndex = 0;
        String val;

        for (int i = 0; i < (answers.length - 1); i++) {
            int space = a.indexOf(' ', startIndex);
            val = a.substring(startIndex, space);
            answers[i] = Integer.parseInt(val);
            startIndex = space + 1;
        }

        val = a.substring(startIndex);
        answers[answers.length - 1] = Integer.parseInt(val);

        boolean anotherQuiz = true;

        while (anotherQuiz == true) {
            System.out.println();

            System.out.print("Please enter the answers from the quiz: ");
            String b = scan.nextLine();

            int[] quizAnswers = new int[QUIZLENGTH];
            int numCorrect = 0, percentCorrect;
            startIndex = 0;

            for (int k = 0; k < (answers.length - 1); k++) {
                int space = b.indexOf(' ', startIndex);
                val = b.substring(startIndex, space);

                if (answers[k] == Integer.parseInt(val)) {
                    numCorrect++;
                }

                startIndex = space + 1;
            }

            val = b.substring(startIndex);
            if (answers[answers.length - 1] == Integer.parseInt(val)) {
                numCorrect++;
            }

            System.out.println();

            percentCorrect = (100 * numCorrect) / QUIZLENGTH;

            System.out.println("Number correct: " + numCorrect);
            System.out.println("Percent correct: " + percentCorrect + "%");

            System.out.println();

            System.out.println("Grade another quiz? (y/n) ");
            String ans = scan.nextLine();

            if (ans.charAt(0) == 'n') {
                anotherQuiz = false;
            }
        }
    }
}